package com.firelord.jobseeker.domain.usecase

import com.firelord.jobseeker.data.model.JobModel
import com.firelord.jobseeker.domain.repository.JobRepository

class DeleteJobUseCase(private val jobRepository: JobRepository) {
    suspend fun execute(jobModel: JobModel) = jobRepository.deleteJob(jobModel = jobModel)
}