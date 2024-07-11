package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName

data class Creative(
    @SerialName("creative_type")
    val creativeType: Int,
    @SerialName("file")
    val `file`: String,
    @SerialName("image_url")
    val imageUrl: String,
    @SerialName("order_id")
    val orderId: Int,
    @SerialName("thumb_url")
    val thumbUrl: String
)