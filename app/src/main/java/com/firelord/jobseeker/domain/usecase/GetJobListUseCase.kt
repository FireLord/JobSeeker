package com.firelord.jobseeker.domain.usecase

import androidx.paging.PagingData
import com.firelord.jobseeker.data.model.JobModel
import com.firelord.jobseeker.domain.repository.JobRepository
import kotlinx.coroutines.flow.Flow

class GetJobListUseCase(private val jobRepository: JobRepository) {
    suspend fun execute() : Flow<PagingData<JobModel>> = jobRepository.getJobList()
}