package com.firelord.jobseeker.presentation.di

import com.firelord.jobseeker.presentation.ui.screen.detail.viewModel.DetailViewModel
import com.firelord.jobseeker.presentation.ui.screen.bookmark.viewModel.BookmarkViewModel
import com.firelord.jobseeker.presentation.ui.screen.bottomNavigation.viewModel.BottomNavViewModel
import com.firelord.jobseeker.presentation.ui.screen.home.viewModel.HomeViewModel
import org.koin.dsl.module

val viewModelModule = module {
    single {
        HomeViewModel( get() )
    }

    single {
        DetailViewModel( get(), get() )
    }

    single {
        BookmarkViewModel( get() )
    }

    single {
        BottomNavViewModel()
    }
}