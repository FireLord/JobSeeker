package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName

data class V3(
    @SerialName("field_key")
    val fieldKey: String,
    @SerialName("field_name")
    val fieldName: String,
    @SerialName("field_value")
    val fieldValue: String
)