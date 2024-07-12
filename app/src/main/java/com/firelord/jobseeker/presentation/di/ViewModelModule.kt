package com.firelord.jobseeker.presentation.di

import com.firelord.jobseeker.presentation.ui.screen.detail.viewModel.DetailViewModel
import com.firelord.jobseeker.presentation.ui.screen.home.bookmark.viewModel.BookmarkViewModel
import com.firelord.jobseeker.presentation.ui.screen.home.viewModel.HomeViewModel
import org.koin.dsl.module

val viewModelModule = module {
    factory {
        HomeViewModel( get() )
    }

    factory {
        DetailViewModel( get(), get() )
    }

    factory {
        BookmarkViewModel( get() )
    }
}