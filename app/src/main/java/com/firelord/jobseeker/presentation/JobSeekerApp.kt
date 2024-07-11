package com.firelord.jobseeker.presentation

import android.app.Application
import com.firelord.jobseeker.presentation.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class JobSeekerApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@JobSeekerApp)
            modules(appModule())
        }
    }
}