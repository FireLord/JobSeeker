package com.firelord.jobseeker.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.firelord.jobseeker.data.model.JobModel

@Database(
    entities = [JobModel::class],
    version = 1
)
@TypeConverters(JobSeekerTypeConverter::class)
abstract class JobSeekerDatabase : RoomDatabase() {
    abstract fun jobDao(): JobDao
}