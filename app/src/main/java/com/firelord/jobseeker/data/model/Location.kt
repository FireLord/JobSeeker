package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName

data class Location(
    @SerialName("id")
    val id: Int,
    @SerialName("locale")
    val locale: String,
    @SerialName("state")
    val state: Int
)