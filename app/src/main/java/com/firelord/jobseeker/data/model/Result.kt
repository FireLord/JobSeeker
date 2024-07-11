package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName

data class Result(
    @SerialName("advertiser")
    val advertiser: Int,
    @SerialName("amount")
    val amount: String,
    @SerialName("button_text")
    val buttonText: String,
    @SerialName("city_location")
    val cityLocation: Int,
    @SerialName("company_name")
    val companyName: String,
    @SerialName("contact_preference")
    val contactPreference: ContactPreference,
    @SerialName("contentV3")
    val contentV3: ContentV3,
    @SerialName("created_on")
    val createdOn: String,
    @SerialName("creatives")
    val creatives: List<Creative>,
    @SerialName("custom_link")
    val customLink: String,
    @SerialName("enable_lead_collection")
    val enableLeadCollection: Boolean,
    @SerialName("experience")
    val experience: Int,
    @SerialName("expire_on")
    val expireOn: String,
    @SerialName("fb_shares")
    val fbShares: Int,
    @SerialName("fee_details")
    val feeDetails: FeeDetails,
    @SerialName("fees_charged")
    val feesCharged: Int,
    @SerialName("fees_text")
    val feesText: String,
    @SerialName("id")
    val id: Int,
    @SerialName("is_applied")
    val isApplied: Boolean,
    @SerialName("is_bookmarked")
    val isBookmarked: Boolean,
    @SerialName("is_job_seeker_profile_mandatory")
    val isJobSeekerProfileMandatory: Boolean,
    @SerialName("is_owner")
    val isOwner: Boolean,
    @SerialName("is_premium")
    val isPremium: Boolean,
    @SerialName("job_category")
    val jobCategory: String,
    @SerialName("job_category_id")
    val jobCategoryId: Int,
    @SerialName("job_hours")
    val jobHours: String,
    @SerialName("job_location_slug")
    val jobLocationSlug: String,
    @SerialName("job_role")
    val jobRole: String,
    @SerialName("job_role_id")
    val jobRoleId: Int,
    @SerialName("job_tags")
    val jobTags: List<JobTag>,
    @SerialName("job_type")
    val jobType: Int,
    @SerialName("locality")
    val locality: Int,
    @SerialName("locations")
    val locations: List<Location>,
    @SerialName("num_applications")
    val numApplications: Int,
    @SerialName("openings_count")
    val openingsCount: Int,
    @SerialName("other_details")
    val otherDetails: String,
    @SerialName("premium_till")
    val premiumTill: String,
    @SerialName("primary_details")
    val primaryDetails: PrimaryDetails,
    @SerialName("qualification")
    val qualification: Int,
    @SerialName("question_bank_id")
    val questionBankId: Any,
    @SerialName("salary_max")
    val salaryMax: Int,
    @SerialName("salary_min")
    val salaryMin: Int,
    @SerialName("screening_retry")
    val screeningRetry: Any,
    @SerialName("shares")
    val shares: Int,
    @SerialName("shift_timing")
    val shiftTiming: Int,
    @SerialName("should_show_last_contacted")
    val shouldShowLastContacted: Boolean,
    @SerialName("status")
    val status: Int,
    @SerialName("tags")
    val tags: List<Any>,
    @SerialName("title")
    val title: String,
    @SerialName("type")
    val type: Int,
    @SerialName("updated_on")
    val updatedOn: String,
    @SerialName("videos")
    val videos: List<Any>,
    @SerialName("views")
    val views: Int,
    @SerialName("whatsapp_no")
    val whatsappNo: String
)