package com.firelord.jobseeker.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.firelord.jobseeker.data.model.JobModel
import kotlinx.coroutines.flow.Flow

@Dao
interface JobDao {
    @Upsert
    suspend fun upsert(jobModel: JobModel)

    @Query("SELECT * FROM job_model")
    fun getAllJobs(): Flow<List<JobModel>>

    @Delete
    suspend fun delete(jobModel: JobModel)
}