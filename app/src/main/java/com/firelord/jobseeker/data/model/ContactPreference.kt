package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ContactPreference(
    @SerialName("preference")
    val preference: Int? = null,
    @SerialName("preferred_call_end_time")
    val preferredCallEndTime: String? = null,
    @SerialName("preferred_call_start_time")
    val preferredCallStartTime: String? = null,
    @SerialName("whatsapp_link")
    val whatsappLink: String? = null
)