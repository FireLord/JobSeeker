package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Creative(
    @SerialName("creative_type")
    val creativeType: Int? = null,
    @SerialName("file")
    val file: String? = null,
    @SerialName("image_url")
    val imageUrl: String? = null,
    @SerialName("order_id")
    val orderId: Int? = null,
    @SerialName("thumb_url")
    val thumbUrl: String? = null
)