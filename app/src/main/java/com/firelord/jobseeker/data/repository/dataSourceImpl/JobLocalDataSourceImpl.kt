package com.firelord.jobseeker.data.repository.dataSourceImpl

import com.firelord.jobseeker.data.db.JobDao
import com.firelord.jobseeker.data.model.JobModel
import com.firelord.jobseeker.data.repository.dataSource.JobLocalDataSource
import kotlinx.coroutines.flow.Flow

class JobLocalDataSourceImpl(
    private val jobDao: JobDao
): JobLocalDataSource {
    override suspend fun upsertJobToDb(jobModel: JobModel) {
        jobDao.upsert(jobModel = jobModel)
    }

    override suspend fun deleteJobFromDb(jobModel: JobModel) {
        jobDao.delete(jobModel = jobModel)
    }

    override fun getSavedJobsFromDb(): Flow<List<JobModel>> {
        return jobDao.getAllJobs()
    }
}