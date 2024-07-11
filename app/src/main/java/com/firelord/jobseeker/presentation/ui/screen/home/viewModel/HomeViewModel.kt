package com.firelord.jobseeker.presentation.ui.screen.home.viewModel

import android.util.Log
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import com.firelord.jobseeker.data.api.JobAPIService
import com.firelord.jobseeker.data.util.Resource
import kotlinx.coroutines.launch

class HomeViewModel(
    private val jobAPIService: JobAPIService
): ScreenModel {
    fun fetchJobList() = screenModelScope.launch {
        val data = jobAPIService.getJobList(1)
        when(data) {
            is Resource.Success -> {
                // Handle success
                Log.d("HomeViewModel", "Data: ${data.data}")
            }
            is Resource.Error -> {
                // Handle error
                Log.e("HomeViewModel", "Error: ${data.message}")
            }

            is Resource.Loading -> {
                // Handle loading
                Log.d("HomeViewModel", "Loading")
            }
        }
    }
}