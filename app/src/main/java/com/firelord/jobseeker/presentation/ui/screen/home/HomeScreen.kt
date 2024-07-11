package com.firelord.jobseeker.presentation.ui.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import com.firelord.jobseeker.presentation.ui.screen.home.component.JobCard
import com.firelord.jobseeker.presentation.ui.screen.home.component.SearchBar
import com.firelord.jobseeker.presentation.ui.screen.home.viewModel.HomeViewModel

class HomeScreen: Screen {
    @Composable
    override fun Content() {
        val viewModel = getScreenModel<HomeViewModel>()

        LaunchedEffect(key1 = Unit) {
            viewModel.fetchJobList()
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
                    text = "Hello, Job Seeker!\nStart Your New Journey",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(16.dp))

                SearchBar()

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Most Popular Jobs",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.ExtraBold
                    )

                    Text(
                        text = "Show All",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Thin,
                        color = Color.Gray
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                JobCard()
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen().Content()
}