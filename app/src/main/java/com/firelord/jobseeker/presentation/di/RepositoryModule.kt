package com.firelord.jobseeker.presentation.di

import com.firelord.jobseeker.data.repository.JobRepositoryImpl
import com.firelord.jobseeker.domain.repository.JobRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<JobRepository> { JobRepositoryImpl(get(), get()) }
}