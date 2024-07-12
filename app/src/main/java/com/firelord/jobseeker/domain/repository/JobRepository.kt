package com.firelord.jobseeker.domain.repository

import androidx.paging.PagingData
import com.firelord.jobseeker.data.model.JobModel
import kotlinx.coroutines.flow.Flow

interface JobRepository {
    suspend fun getJobList(): Flow<PagingData<JobModel>>
    suspend fun upsertJob(jobModel: JobModel)
    suspend fun deleteJob(jobModel: JobModel)
    fun getSavedJobs(): Flow<List<JobModel>>
}