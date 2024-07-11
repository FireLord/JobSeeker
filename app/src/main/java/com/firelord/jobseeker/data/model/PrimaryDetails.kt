package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName

data class PrimaryDetails(
    @SerialName("Experience")
    val experience: String,
    @SerialName("Fees_Charged")
    val feesCharged: String,
    @SerialName("Job_Type")
    val jobType: String,
    @SerialName("Place")
    val place: String,
    @SerialName("Qualification")
    val qualification: String,
    @SerialName("Salary")
    val salary: String
)