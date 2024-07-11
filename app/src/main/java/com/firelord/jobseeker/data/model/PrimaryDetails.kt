package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PrimaryDetails(
    @SerialName("Experience")
    val experience: String? = null,
    @SerialName("Fees_Charged")
    val feesCharged: String? = null,
    @SerialName("Job_Type")
    val jobType: String? = null,
    @SerialName("Place")
    val place: String? = null,
    @SerialName("Qualification")
    val qualification: String? = null,
    @SerialName("Salary")
    val salary: String? = null
)