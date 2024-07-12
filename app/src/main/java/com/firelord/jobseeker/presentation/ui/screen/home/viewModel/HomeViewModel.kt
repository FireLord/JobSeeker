package com.firelord.jobseeker.presentation.ui.screen.home.viewModel

import android.util.Log
import androidx.paging.PagingData
import androidx.paging.cachedIn
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import com.firelord.jobseeker.data.api.JobAPIService
import com.firelord.jobseeker.data.model.JobModel
import com.firelord.jobseeker.data.util.Resource
import com.firelord.jobseeker.domain.usecase.GetJobListUseCase
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val getJobListUseCase: GetJobListUseCase,
): ScreenModel {
    private var _jobModelList = Channel<PagingData<JobModel>>()
    val jobModelList = _jobModelList.receiveAsFlow()

    fun fetchJobList() = screenModelScope.launch {
        try {
            val result = getJobListUseCase.execute()
                .cachedIn(screenModelScope)
            result.collect { pagingData ->
                _jobModelList.send(pagingData)
            }
        } catch (e: Exception) {
            Log.d("HomeViewModel", "getJobList: ${e.message}")
        }
    }
}