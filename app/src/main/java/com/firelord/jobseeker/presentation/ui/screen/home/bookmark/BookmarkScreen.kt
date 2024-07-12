package com.firelord.jobseeker.presentation.ui.screen.home.bookmark

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.firelord.jobseeker.presentation.ui.screen.detail.DetailScreen
import com.firelord.jobseeker.presentation.ui.screen.home.bookmark.viewModel.BookmarkViewModel
import com.firelord.jobseeker.presentation.ui.screen.home.component.JobCard

class BookmarkScreen: Screen {
    @Composable
    override fun Content() {
        val viewModel = getScreenModel<BookmarkViewModel>()
        val navigator = LocalNavigator.currentOrThrow
        val jobModelListState = viewModel.jobModelList.collectAsStateWithLifecycle(initialValue = emptyList())

        LaunchedEffect(key1 = true) {
            viewModel.fetchSavedJobList()
        }

        Scaffold(
            containerColor = Color.White
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(20.dp)
            ) {
                Text(
                    text = "Hello, Job Seeker!\nYour Saved Jobs",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(16.dp))

                LazyColumn {
                    items(jobModelListState.value.size) { index ->
                        val jobData = jobModelListState.value[index]
                        JobCard(
                            jobModel = jobData,
                            onCardClick = {
                                navigator.push(DetailScreen(jobModel = jobData))
                            }
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun BookmarkScreenPreview() {
    BookmarkScreen().Content()
}