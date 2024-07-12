package com.firelord.jobseeker.presentation.ui.screen.detail.viewModel

import android.util.Log
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import com.firelord.jobseeker.data.model.JobModel
import com.firelord.jobseeker.domain.usecase.DeleteJobUseCase
import com.firelord.jobseeker.domain.usecase.SaveJobUseCase
import kotlinx.coroutines.launch

class DetailViewModel(
    private val saveJobUseCase: SaveJobUseCase,
    private val deleteJobUseCase: DeleteJobUseCase
) : ScreenModel {
    fun saveJob(jobModel: JobModel) = screenModelScope.launch {
        try {
            saveJobUseCase.execute(jobModel = jobModel)
        } catch (e: Exception) {
            Log.d("DetailViewModel", "saveJob: ${e.message}")
        }
    }

    fun deleteJob(jobModel: JobModel) = screenModelScope.launch {
        try {
            deleteJobUseCase.execute(jobModel = jobModel)
        } catch (e: Exception) {
            Log.d("DetailViewModel", "deleteJob: ${e.message}")
        }
    }
}