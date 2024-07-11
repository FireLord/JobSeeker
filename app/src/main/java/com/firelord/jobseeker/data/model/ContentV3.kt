package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ContentV3(
    @SerialName("V3")
    val v3: List<V3>? = null
)