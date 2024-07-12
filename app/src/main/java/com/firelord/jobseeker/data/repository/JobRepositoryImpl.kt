package com.firelord.jobseeker.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.firelord.jobseeker.data.model.JobModel
import com.firelord.jobseeker.data.repository.dataSource.JobLocalDataSource
import com.firelord.jobseeker.data.repository.dataSourceImpl.JobRemotePagingDataSourceImpl
import com.firelord.jobseeker.domain.repository.JobRepository
import kotlinx.coroutines.flow.Flow

class JobRepositoryImpl(
    private val jobLocalDataSource: JobLocalDataSource,
    private val jobRemotePagingDataSourceImpl: JobRemotePagingDataSourceImpl
): JobRepository {

    override suspend fun getJobList(): Flow<PagingData<JobModel>> {
        return Pager(
            config = PagingConfig(
                pageSize = 10,
                prefetchDistance = 2,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { jobRemotePagingDataSourceImpl }
        ).flow
    }

    override suspend fun upsertJob(jobModel: JobModel) {
        jobLocalDataSource.upsertJobToDb(jobModel)
    }

    override suspend fun deleteJob(jobModel: JobModel) {
        jobLocalDataSource.deleteJobFromDb(jobModel)
    }

    override fun getSavedJobs(): Flow<List<JobModel>> {
        return jobLocalDataSource.getSavedJobsFromDb()
    }
}