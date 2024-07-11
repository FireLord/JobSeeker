package com.firelord.jobseeker.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Result(
    @SerialName("advertiser")
    val advertiser: Int? = null,
    @SerialName("amount")
    val amount: String? = null,
    @SerialName("button_text")
    val buttonText: String? = null,
    @SerialName("city_location")
    val cityLocation: Int? = null,
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
    @SerialName("custom_link")
    val customLink: String? = null,
    @SerialName("enable_lead_collection")
    val enableLeadCollection: Boolean? = null,
    @SerialName("experience")
    val experience: Int? = null,
    @SerialName("expire_on")
    val expireOn: String? = null,
    @SerialName("fb_shares")
    val fbShares: Int? = null,
    @SerialName("fees_charged")
    val feesCharged: Int? = null,
    @SerialName("fees_text")
    val feesText: String? = null,
    @SerialName("id")
    val id: Int? = null,
    @SerialName("is_applied")
    val isApplied: Boolean? = null,
    @SerialName("is_bookmarked")
    val isBookmarked: Boolean? = null,
    @SerialName("is_job_seeker_profile_mandatory")
    val isJobSeekerProfileMandatory: Boolean? = null,
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
    @SerialName("job_location_slug")
    val jobLocationSlug: String? = null,
    @SerialName("job_role")
    val jobRole: String? = null,
    @SerialName("job_role_id")
    val jobRoleId: Int? = null,
    @SerialName("job_tags")
    val jobTags: List<JobTag>? = null,
    @SerialName("job_type")
    val jobType: Int? = null,
    @SerialName("locality")
    val locality: Int? = null,
    @SerialName("locations")
    val locations: List<Location>? = null,
    @SerialName("num_applications")
    val numApplications: Int? = null,
    @SerialName("openings_count")
    val openingsCount: Int? = null,
    @SerialName("other_details")
    val otherDetails: String? = null,
    @SerialName("premium_till")
    val premiumTill: String? = null,
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
    @SerialName("should_show_last_contacted")
    val shouldShowLastContacted: Boolean? = null,
    @SerialName("status")
    val status: Int? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("type")
    val type: Int? = null,
    @SerialName("updated_on")
    val updatedOn: String? = null,
    @SerialName("views")
    val views: Int? = null,
    @SerialName("whatsapp_no")
    val whatsappNo: String? = null
)