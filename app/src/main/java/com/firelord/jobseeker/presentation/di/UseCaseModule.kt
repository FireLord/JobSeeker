package com.firelord.jobseeker.presentation.di

import com.firelord.jobseeker.domain.usecase.DeleteJobUseCase
import com.firelord.jobseeker.domain.usecase.GetJobListUseCase
import com.firelord.jobseeker.domain.usecase.GetSavedJobUseCase
import com.firelord.jobseeker.domain.usecase.SaveJobUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { GetJobListUseCase(get()) }
    single { SaveJobUseCase(get()) }
    single { DeleteJobUseCase(get()) }
    single { GetSavedJobUseCase(get()) }
}