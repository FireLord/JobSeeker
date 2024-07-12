package com.firelord.jobseeker.domain.usecase

import com.firelord.jobseeker.data.model.JobModel
import com.firelord.jobseeker.domain.repository.JobRepository
import kotlinx.coroutines.flow.Flow

class GetSavedJobUseCase(private val jobRepository: JobRepository) {
    fun execute() : Flow<List<JobModel>> = jobRepository.getSavedJobs()
}