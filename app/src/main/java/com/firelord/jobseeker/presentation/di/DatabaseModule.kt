package com.firelord.jobseeker.presentation.di

import androidx.room.Room
import com.firelord.jobseeker.data.db.JobDao
import com.firelord.jobseeker.data.db.JobSeekerDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room.databaseBuilder(
            androidApplication(),
            JobSeekerDatabase::class.java,
            "jobseeker_database"
        ).fallbackToDestructiveMigration().build()
    }

    single<JobDao> { get<JobSeekerDatabase>().jobDao() }
}