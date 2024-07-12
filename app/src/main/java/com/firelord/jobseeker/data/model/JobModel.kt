package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JobModel(
    @SerialName("company_name")
    val companyName: String? = null,
    @SerialName("contact_preference")
    val contactPreference: ContactPreference? = null,
    @SerialName("contentV3")
    val contentV3: ContentV3? = null,
    @SerialName("created_on")
    val createdOn: String? = null,
    @SerialName("creatives")
    val creatives: List<Creative>? = null,
    @SerialName("expire_on")
    val expireOn: String? = null,
    @SerialName("id")
    val id: Int? = null,
    @SerialName("is_applied")
    val isApplied: Boolean? = null,
    @SerialName("is_bookmarked")
    val isBookmarked: Boolean? = null,
    @SerialName("is_owner")
    val isOwner: Boolean? = null,
    @SerialName("is_premium")
    val isPremium: Boolean? = null,
    @SerialName("job_category")
    val jobCategory: String? = null,
    @SerialName("job_category_id")
    val jobCategoryId: Int? = null,
    @SerialName("job_hours")
    val jobHours: String? = null,
    @SerialName("job_role")
    val jobRole: String? = null,
    @SerialName("job_tags")
    val jobTags: List<JobTag>? = null,
    @SerialName("num_applications")
    val numApplications: Int? = null,
    @SerialName("openings_count")
    val openingsCount: Int? = null,
    @SerialName("other_details")
    val otherDetails: String? = null,
    @SerialName("primary_details")
    val primaryDetails: PrimaryDetails? = null,
    @SerialName("qualification")
    val qualification: Int? = null,
    @SerialName("salary_max")
    val salaryMax: Int? = null,
    @SerialName("salary_min")
    val salaryMin: Int? = null,
    @SerialName("shares")
    val shares: Int? = null,
    @SerialName("shift_timing")
    val shiftTiming: Int? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("type")
    val type: Int? = null,
    @SerialName("whatsapp_no")
    val whatsappNo: String? = null
) {
    companion object {
        val sampleJobModel = JobModel(
            id = 606376,
            title = "Satyam Home Care Services wants nannies and ward boys for patient care, housework and cooking.",
            type = 1009,
            primaryDetails = PrimaryDetails(
                place = "Hyderabad",
                salary = "₹18000 - ₹25000+",
                jobType = "ఆఫీస్ జాబ్ ",
                experience = "Less than 1 year",
                feesCharged = "-1",
                qualification = "Not Required"
            ),
            salaryMax = 26000,
            salaryMin = 18000,
            contentV3 = ContentV3(
                v3 = listOf(
                    V3(fieldKey = "Job Category", fieldName = "జాబ్ కేటగిరి", fieldValue = "మెడికల్ / డాక్టర్"),
                    V3(fieldKey = "Gender", fieldName = "జెండర్ ఎంచుకోండి", fieldValue = "Any Gender"),
                    V3(fieldKey = "Shift timing", fieldName = "షిఫ్ట్ టైమ్", fieldValue = "Day Shift"),
                    V3(fieldKey = "Other details", fieldName = "ఇతర వివరాలు", fieldValue = "టైటిల్ : సత్యం  హోమ్  కేర్ సర్వీసెస్ నందు పేషంట్ కేర్,ఇంటి,వంట పని చేయుటకు ఆయాలు , వార్డ్ బాయ్స్ కావలెను\r\nఇతర వివరాలు:సత్యం     హోమ్ కేర్ లో పెద్దవారికి సేవలు చేయుటకు పేషంట్ కేర్ , ఇంటి/వంట పని చేయుటకు ఆయాలు, అనుభవం ఉన్న స్త్రీలు (ఆడవాళ్ళు) కావలెను. ఏజెంట్స్ కమిషన్:5,000/-\r\nఅర్హత: అనుభవం ఉంటే చాలు.\r\nఎటువంటి ఫీజు చెల్లించనవసరం లేదు\r\nఖాళీలు :200\r\nజీతం:18,000/-25,000/- వరకు ఇవ్వబడును\r\nఅనుభవం:ఏదైనా \r\nఅడ్రస్:కూకట్ పల్లి \r\nమరిన్ని వివరాలకు క్రింది ఉన్న కాల్ బటన్ క్లిక్ చెయ్యండి")
                )
            ),
            otherDetails = "Title : Satyam Home Care Services Wanted Nurses, Ward Boys for Patient Care, Housekeeping, Cooking\r\nOther Details: Satyam Home Care requires experienced women (females) to provide patient care, home/cooking work for elderly. Agents commission: 5000/-\r\nQualification: Experience required.\r\nNo fee to be paid.\r\nVacancies : 200\r\nSalary: 18000/-25000/-\r\nExperience: Any\r\nAddress: Kukatpally\r\nClick on the call button for more details",
            jobTags = listOf(
                JobTag(value = "హైదరాబాద్", bgColor = "#ffcc00", textColor = "#000000"),
                JobTag(value = "పూర్తి-కాలం (ఫుల్ టైం)", bgColor = "#ffcc00", textColor = "#000000"),
                JobTag(value = "హెల్త్ కేర్", bgColor = "#ffcc00", textColor = "#000000"),
                JobTag(value = "అనుభవం అవసరం లేదు", bgColor = "#ffcc00", textColor = "#000000")
            ),
            jobCategory = "Medical / Doctor",
            jobCategoryId = 22,
            shiftTiming = 13,
            jobRole = "పేషంట్ కేర్ & ఇంటి పని & వంట పని",
            isBookmarked = false,
            isApplied = false,
            isOwner = false,
            createdOn = "2023-12-14T12:24:00+05:30",
            shares = 1,
            companyName = "Satyam Home Care Services",
            contactPreference = ContactPreference(
                preference = 1,
                whatsappLink = "https://wa.me/916302532832?text=Hi%2C+I+am+interested+to+apply+on+the+job+opening+for+%E0%B0%B8%E0%B0%A4%E0%B1%8D%E0%B0%AF%E0%B0%82+++%E0%B0%B9%E0%B1%8B%E0%B0%AE%E0%B1%8D+%E0%B0%95%E0%B1%87%E0%B0%B0%E0%B1%8D+%E0%B0%B8%E0%B0%B0%E0%B1%8D%E0%B0%B5%E0%B1%80%E0%B0%B8%E0%B1%86%E0%B0%B8%E0%B1%8D+%E0%B0%A8%E0%B0%82%E0%B0%A6%E0%B1%81++%E0%B0%AA%E0%B1%87%E0%B0%B7%E0%B0%82%E0%B0%9F%E0%B1%8D+%E0%B0%95%E0%B1%87%E0%B0%B0%E0%B1%8D%2C%E0%B0%87%E0%B0%82%E0%B0%9F%E0%B0%BF%2C%E0%B0%B5%E0%B0%82%E0%B0%9F+%E0%B0%AA%E0%B0%A8%E0%B0%BF+%E0%B0%9A%E0%B1%87%E0%B0%AF%E0%B1%81%E0%B0%9F%E0%B0%95%E0%B1%81+%E0%B0%86%E0%B0%AF%E0%B0%BE%E0%B0%B2%E0%B1%81+%2C+%E0%B0%B5%E0%B0%BE%E0%B0%B0%E0%B1%8D%E0%B0%A1%E0%B1%8D+%E0%B0%AC%E0%B0%BE%E0%B0%AF%E0%B1%8D%E0%B0%B8%E0%B1%8D+%E0%B0%95%E0%B0%BE%E0%B0%B5%E0%B0%B2%E0%B1%86%E0%B0%A8%E0%B1%81+that+you+posted+on+the+Lokal+app.",
                preferredCallStartTime = "10:00:00",
                preferredCallEndTime = "19:00:00"
            ),
            whatsappNo = "8886364555",
            isPremium = true,
            expireOn = "2024-12-14T12:24:00+05:30",
            jobHours = "9 AM to 6 PM",
            numApplications = 10,
            openingsCount = 200,
            creatives = listOf(
                Creative(
                    file = "https://media.getlokalapp.com/classified_images/606376/606376_411e9452730aa77ccb17642734b7995f.jpg",
                    thumbUrl = "https://creatives.getlokalapp.com/cache/e2/77/e277823ddb606daca9b148b786a5de3e.jpg",
                    creativeType = 1
                )
            )
        )
    }
}