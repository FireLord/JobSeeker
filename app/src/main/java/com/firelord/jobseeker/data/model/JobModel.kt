package com.firelord.jobseeker.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.UUID

@Entity(tableName = "job_model")
@Serializable
data class JobModel(
    @PrimaryKey
    @SerialName("id")
    val id: Int = UUID.randomUUID().hashCode(),
    @SerialName("company_name")
    val companyName: String? = null,
    @SerialName("contact_preference")
    val contactPreference: ContactPreference? = null,
    @SerialName("creatives")
    val creatives: List<Creative>? = null,
    @SerialName("expire_on")
    val expireOn: String? = null,
    @SerialName("is_bookmarked")
    val isBookmarked: Boolean? = null,
    @SerialName("job_category")
    val jobCategory: String? = null,
    @SerialName("job_hours")
    val jobHours: String? = null,
    @SerialName("job_role")
    val jobRole: String? = null,
    @SerialName("openings_count")
    val openingsCount: Int? = null,
    @SerialName("other_details")
    val otherDetails: String? = null,
    @SerialName("salary_max")
    val salaryMax: Int? = null,
    @SerialName("salary_min")
    val salaryMin: Int? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("whatsapp_no")
    val whatsappNo: String? = null,
    @SerialName("job_location_slug")
    val jobLocationSlug: String? = null,
) {
    companion object {
        val sampleJobModel = JobModel(
            id = 606376,
            title = "Satyam Home Care Services wants nannies and ward boys for patient care, housework and cooking.",
            salaryMax = 26000,
            salaryMin = 18000,
            otherDetails = "Title : Satyam Home Care Services Wanted Nurses, Ward Boys for Patient Care, Housekeeping, Cooking\r\nOther Details: Satyam Home Care requires experienced women (females) to provide patient care, home/cooking work for elderly. Agents commission: 5000/-\r\nQualification: Experience required.\r\nNo fee to be paid.\r\nVacancies : 200\r\nSalary: 18000/-25000/-\r\nExperience: Any\r\nAddress: Kukatpally\r\nClick on the call button for more details",
            jobCategory = "Medical / Doctor",
            jobRole = "పేషంట్ కేర్ & ఇంటి పని & వంట పని",
            isBookmarked = false,
            companyName = "Satyam Home Care Services",
            contactPreference = ContactPreference(
                preference = 1,
                whatsappLink = "https://wa.me/916302532832?text=Hi%2C+I+am+interested+to+apply+on+the+job+opening+for+%E0%B0%B8%E0%B0%A4%E0%B1%8D%E0%B0%AF%E0%B0%82+++%E0%B0%B9%E0%B1%8B%E0%B0%AE%E0%B1%8D+%E0%B0%95%E0%B1%87%E0%B0%B0%E0%B1%8D+%E0%B0%B8%E0%B0%B0%E0%B1%8D%E0%B0%B5%E0%B1%80%E0%B0%B8%E0%B1%86%E0%B0%B8%E0%B1%8D+%E0%B0%A8%E0%B0%82%E0%B0%A6%E0%B1%81++%E0%B0%AA%E0%B1%87%E0%B0%B7%E0%B0%82%E0%B0%9F%E0%B1%8D+%E0%B0%95%E0%B1%87%E0%B0%B0%E0%B1%8D%2C%E0%B0%87%E0%B0%82%E0%B0%9F%E0%B0%BF%2C%E0%B0%B5%E0%B0%82%E0%B0%9F+%E0%B0%AA%E0%B0%A8%E0%B0%BF+%E0%B0%9A%E0%B1%87%E0%B0%AF%E0%B1%81%E0%B0%9F%E0%B0%95%E0%B1%81+%E0%B0%86%E0%B0%AF%E0%B0%BE%E0%B0%B2%E0%B1%81+%2C+%E0%B0%B5%E0%B0%BE%E0%B0%B0%E0%B1%8D%E0%B0%A1%E0%B1%8D+%E0%B0%AC%E0%B0%BE%E0%B0%AF%E0%B1%8D%E0%B0%B8%E0%B1%8D+%E0%B0%95%E0%B0%BE%E0%B0%B5%E0%B0%B2%E0%B1%86%E0%B0%A8%E0%B1%81+that+you+posted+on+the+Lokal+app.",
                preferredCallStartTime = "10:00:00",
                preferredCallEndTime = "19:00:00"
            ),
            whatsappNo = "8886364555",
            expireOn = "2024-12-14T12:24:00+05:30",
            openingsCount = 200,
            creatives = listOf(
                Creative(
                    file = "https://media.getlokalapp.com/classified_images/606376/606376_411e9452730aa77ccb17642734b7995f.jpg",
                    thumbUrl = "https://creatives.getlokalapp.com/cache/e2/77/e277823ddb606daca9b148b786a5de3e.jpg",
                    creativeType = 1
                )
            ),
            jobLocationSlug = "Hyderabad"
        )
    }
}