package com.firelord.jobseeker.data.api

import com.firelord.jobseeker.data.util.Resource
import com.google.common.truth.Truth.assertThat
import io.ktor.client.HttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.fullPath
import io.ktor.http.headersOf
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.json.Json
import org.junit.After
import org.junit.Before
import org.junit.Test
import readFile

class JobAPIServiceTest {
    private lateinit var jobAPIService: JobAPIService
    private val responseFile = "ktor_client/jobSeekerResponseFile.json".readFile()

    private val mockEngine = MockEngine { request ->
        when(request.url.fullPath) {
            "/common/jobs?page=2" -> {
                respond(
                    content = responseFile,
                    status = HttpStatusCode.OK,
                    headers = headersOf(HttpHeaders.ContentType, "application/json")
                )
            }
            else -> error("Error ${request.url.fullPath}")
        }
    }

    @Before
    fun setup() {
        val httpClientMock = HttpClient(mockEngine) {
            install(ContentNegotiation) {
                json(
                    Json {
                        prettyPrint = true
                        isLenient = true
                        ignoreUnknownKeys = true
                    }
                )
            }
        }

        jobAPIService = JobAPIService(httpClientMock)
    }

    @After
    fun close() {
        mockEngine.close()
    }

    @Test
    fun `make sure file is not empty`() {
        assertThat(responseFile).isNotEmpty()
    }

    @Test
    fun `make sure url path is right`() = runTest {
        jobAPIService.getJobList(2)
        val requestPath = mockEngine.requestHistory.first().url.fullPath
        assertThat(requestPath).isEqualTo("/common/jobs?page=2")
    }

    @Test
    fun `verify successful response`() = runTest {
        val result = jobAPIService.getJobList(2)
        assertThat(result).isInstanceOf(Resource.Success::class.java)
    }

    @Test
    fun `verify id is correct`() = runTest {
        val result = jobAPIService.getJobList(2)
        val data = (result as Resource.Success).data
        assertThat(data?.jobModel?.get(0)?.id).isEqualTo(606216)
    }
}