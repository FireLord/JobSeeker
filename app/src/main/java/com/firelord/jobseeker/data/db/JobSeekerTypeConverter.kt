package com.firelord.jobseeker.data.db

import androidx.room.TypeConverter
import com.firelord.jobseeker.data.model.ContactPreference
import com.firelord.jobseeker.data.model.Creative
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

object JobSeekerTypeConverter {
    @TypeConverter
    fun fromContactPreference(value: ContactPreference?): String? {
        return value?.let { Json.encodeToString(it) }
    }

    @TypeConverter
    fun toContactPreference(value: String?): ContactPreference? {
        return value?.let { Json.decodeFromString(it) }
    }

    @TypeConverter
    fun fromCreativeList(value: List<Creative>?): String? {
        return value?.let { Json.encodeToString(it) }
    }

    @TypeConverter
    fun toCreativeList(value: String?): List<Creative>? {
        return value?.let { Json.decodeFromString(it) }
    }
}