package com.firelord.jobseeker.data.repository.dataSource

import com.firelord.jobseeker.data.model.JobModel
import kotlinx.coroutines.flow.Flow

interface JobLocalDataSource {
    suspend fun upsertJobToDb(jobModel: JobModel)
    suspend fun deleteJobFromDb(jobModel: JobModel)
    fun getSavedJobsFromDb(): Flow<List<JobModel>>
}