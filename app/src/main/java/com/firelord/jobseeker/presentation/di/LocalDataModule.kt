package com.firelord.jobseeker.presentation.di

import com.firelord.jobseeker.data.repository.dataSource.JobLocalDataSource
import com.firelord.jobseeker.data.repository.dataSourceImpl.JobLocalDataSourceImpl
import org.koin.dsl.module

val localDataModule = module {
    single<JobLocalDataSource> { JobLocalDataSourceImpl(get()) }
}