package com.firelord.jobseeker.presentation.ui.screen.bottomNavigation.viewModel

import androidx.compose.runtime.mutableStateOf
import cafe.adriel.voyager.core.model.ScreenModel

class BottomNavViewModel: ScreenModel {
    val isNavVisible = mutableStateOf(true)
}