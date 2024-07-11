package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JobFetchModel(
    @SerialName("results")
    val results: List<Result>
)