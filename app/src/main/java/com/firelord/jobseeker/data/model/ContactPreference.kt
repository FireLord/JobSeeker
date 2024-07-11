package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName

data class ContactPreference(
    @SerialName("preference")
    val preference: Int,
    @SerialName("preferred_call_end_time")
    val preferredCallEndTime: String,
    @SerialName("preferred_call_start_time")
    val preferredCallStartTime: String,
    @SerialName("whatsapp_link")
    val whatsappLink: String
)