package com.firelord.jobseeker.presentation.ui.screen.detail

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import coil.compose.AsyncImage
import com.firelord.jobseeker.R
import com.firelord.jobseeker.data.model.JobModel
import com.firelord.jobseeker.presentation.ui.screen.detail.component.MoreDetailRow
import com.firelord.jobseeker.presentation.ui.screen.detail.component.NavButton
import com.firelord.jobseeker.presentation.ui.theme.NeonGreen
import com.firelord.jobseeker.presentation.ui.util.formatDDMMYY

data class DetailScreen(
    private val jobModel: JobModel
): Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val scrollState = rememberScrollState()
        val context = LocalContext.current

        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.detail_bg),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )

            Scaffold(
                containerColor = Color.Transparent
            ) { innerPadding ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(innerPadding)
                        .padding(20.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        NavButton(
                            icon = Icons.AutoMirrored.Filled.ArrowBack,
                            onIconClick = {
                                navigator.pop()
                            }
                        )

                        NavButton(
                            icon = Icons.Default.FavoriteBorder,
                            onIconClick = {}
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    AsyncImage(
                        model = jobModel.creatives?.get(0)?.thumbUrl ?: jobModel.creatives?.get(0)?.imageUrl ?: "",
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(5.dp))
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = jobModel.jobRole ?: "Job Title",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Black
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = jobModel.companyName ?: "Company Name",
                            style = MaterialTheme.typography.labelSmall,
                            maxLines = 1,
                            fontWeight = FontWeight.Thin,
                            color = Color.Gray
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Text(
                            text = "·",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.Gray
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Text(
                            text = jobModel.primaryDetails?.place ?: "Location",
                            style = MaterialTheme.typography.labelSmall,
                            maxLines = 1,
                            fontWeight = FontWeight.Thin,
                            color = Color.Gray
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .verticalScroll(scrollState)
                    ) {
                        Text(
                            text = "About the opportunity",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Black,
                            modifier = Modifier
                                .align(Alignment.Start)
                        )

                        Text(
                            text = jobModel.otherDetails ?: "Job Description",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Thin,
                            color = Color.Gray
                        )

                        Text(
                            text = "More details",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Black,
                            modifier = Modifier
                                .align(Alignment.Start)
                        )

                        MoreDetailRow(
                            title = "Salary",
                            content = "₹${jobModel.salaryMin ?: 0} - ₹${jobModel.salaryMax ?: 0}"
                        )

                        MoreDetailRow(
                            title = "Contact",
                            content = jobModel.whatsappNo ?: "--"
                        )

                        MoreDetailRow(
                            title = "Job Type",
                            content = jobModel.jobHours ?: "--"
                        )

                        MoreDetailRow(
                            title = "Opening Count",
                            content = jobModel.openingsCount.toString()
                        )

                        MoreDetailRow(
                            title = "Job Category",
                            content = jobModel.jobCategory ?: "--"
                        )

                        MoreDetailRow(
                            title = "Call Time",
                            content = "${jobModel.contactPreference?.preferredCallStartTime ?: 0} - ${jobModel.contactPreference?.preferredCallEndTime ?: 0}"
                        )

                        MoreDetailRow(
                            title = "Expire on",
                            content = "${jobModel.expireOn?.formatDDMMYY()}"
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Button(
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Black,
                            ),
                            onClick = {
                                jobModel.contactPreference?.whatsappLink.let {
                                    val intent = Intent(Intent.ACTION_VIEW).apply {
                                        data = Uri.parse(it)
                                    }
                                    context.startActivity(intent)
                                }
                            }
                        ) {
                            Text(
                                text = "Apply Now",
                                color = NeonGreen
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewDetailScreen() {
    DetailScreen(
        jobModel = JobModel.sampleJobModel
    ).Content()
}