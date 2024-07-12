package com.firelord.jobseeker.presentation.ui.screen.bookmark.viewModel

import android.util.Log
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import com.firelord.jobseeker.data.model.JobModel
import com.firelord.jobseeker.domain.usecase.GetSavedJobUseCase
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class BookmarkViewModel(
    private val getSavedJobUseCase: GetSavedJobUseCase,
) : ScreenModel {
    private var _jobModelList = Channel<List<JobModel>>()
    val jobModelList = _jobModelList.receiveAsFlow()

    fun fetchSavedJobList() = screenModelScope.launch {
        getSavedJobUseCase.execute().collect { jobList ->
            try {
                _jobModelList.send(jobList)
            } catch (e: Exception) {
                Log.d("BookmarkViewModel", "getSavedJobList: ${e.message}")
            }
        }
    }
}