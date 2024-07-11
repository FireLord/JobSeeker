package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName

data class JobFetchModel(
    @SerialName("results")
    val results: List<Result>
)