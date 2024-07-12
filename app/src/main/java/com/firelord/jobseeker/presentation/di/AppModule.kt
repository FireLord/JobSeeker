package com.firelord.jobseeker.presentation.di

fun appModule() = listOf(
    databaseModule,
    localDataModule,
    netModule,
    pagingModule,
    repositoryModule,
    useCaseModule,
    viewModelModule
)