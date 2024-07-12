package com.firelord.jobseeker.presentation.di

import com.firelord.jobseeker.data.repository.dataSourceImpl.JobRemotePagingDataSourceImpl
import org.koin.dsl.module

val pagingModule = module {
    single { JobRemotePagingDataSourceImpl(get()) }
}