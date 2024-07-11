package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class V3(
    @SerialName("field_key")
    val fieldKey: String? = null,
    @SerialName("field_name")
    val fieldName: String? = null,
    @SerialName("field_value")
    val fieldValue: String? = null
)