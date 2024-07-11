package com.firelord.jobseeker.presentation.ui.screen.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import com.firelord.jobseeker.presentation.ui.screen.home.viewModel.HomeViewModel

class HomeScreen: Screen {
    @Composable
    override fun Content() {
        val viewModel = getScreenModel<HomeViewModel>()

        LaunchedEffect(key1 = Unit) {
            viewModel.fetchJobList()
        }
        Scaffold { innerPadding ->
            Text(
                text = "Home Screen",
                modifier = Modifier
                    .padding(innerPadding)
            )
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen().Content()
}