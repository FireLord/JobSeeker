package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName

data class JobTag(
    @SerialName("bg_color")
    val bgColor: String,
    @SerialName("text_color")
    val textColor: String,
    @SerialName("value")
    val value: String
)