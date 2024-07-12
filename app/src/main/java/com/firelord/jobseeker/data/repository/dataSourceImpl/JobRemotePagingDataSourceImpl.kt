package com.firelord.jobseeker.data.repository.dataSourceImpl

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.firelord.jobseeker.data.api.JobAPIService
import com.firelord.jobseeker.data.model.JobModel
import com.firelord.jobseeker.data.util.Resource

class JobRemotePagingDataSourceImpl(
    private val apiService: JobAPIService
): PagingSource<Int, JobModel>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, JobModel> {
        val page = params.key ?: 1
        val response = apiService.getJobList(page)

        return try {
            when (response) {
                is Resource.Success -> {
                    val data = response.data?.jobModel ?: emptyList()

                    LoadResult.Page(
                        data = data,
                        prevKey = if (page == 1) null else page - 1,
                        nextKey = if (data.isEmpty()) null else page + 1
                    )
                }
                is Resource.Error -> {
                    LoadResult.Error(Exception(response.message))
                }

                is Resource.Loading -> TODO()
            }
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, JobModel>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }
}