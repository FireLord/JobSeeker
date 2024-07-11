package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Location(
    @SerialName("id")
    val id: Int? = null,
    @SerialName("locale")
    val locale: String? = null,
    @SerialName("state")
    val state: Int? = null
)