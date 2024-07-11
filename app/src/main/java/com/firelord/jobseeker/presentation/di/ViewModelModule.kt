package com.firelord.jobseeker.presentation.di

import com.firelord.jobseeker.presentation.ui.screen.home.viewModel.HomeViewModel
import org.koin.dsl.module

val viewModelModule = module {
    factory {
        HomeViewModel( get() )
    }
}