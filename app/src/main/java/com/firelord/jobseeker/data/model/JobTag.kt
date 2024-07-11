package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JobTag(
    @SerialName("bg_color")
    val bgColor: String? = null,
    @SerialName("text_color")
    val textColor: String? = null,
    @SerialName("value")
    val value: String? = null
)