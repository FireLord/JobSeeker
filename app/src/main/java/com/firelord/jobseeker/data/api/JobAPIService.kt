package com.firelord.jobseeker.data.api

import com.firelord.jobseeker.data.model.JobFetchModel
import com.firelord.jobseeker.data.util.Constants.Companion.JOB_API_URL
import com.firelord.jobseeker.data.util.Resource
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class JobAPIService(private val client: HttpClient) {
    suspend fun getJobList(page: Int) : Resource<JobFetchModel> {
        return try {
            val response = client.get(JOB_API_URL) {
                parameter("page", page)
            }.body<JobFetchModel>()
            Resource.Success(response)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An error occurred")
        }
    }
}