package com.firelord.jobseeker.presentation.ui.screen.home.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.firelord.jobseeker.data.model.JobModel

@Composable
fun JobCard(
    jobModel: JobModel,
    onCardClick: () -> Unit
) {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp,
        ),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,

        ),
        border = BorderStroke(1.dp, Color.LightGray),
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
            .clip(RoundedCornerShape(10.dp))

            .clickable {
                onCardClick()
            }

    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                AsyncImage(
                    model = jobModel.creatives?.get(0)?.thumbUrl ?: jobModel.creatives?.get(0)?.imageUrl ?: "",
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(5.dp))
                )
                Column {
                    Text(
                        text = jobModel.jobRole ?: "Job Title",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Black,
                        maxLines = 1,
                        color = Color.Black
                    )

                    Text(
                        text = jobModel.companyName ?: "Company Name",
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Thin,
                        color = Color.Gray
                    )
                }
            }

            Text(
                text = jobModel.title ?: "Job Description",
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.Thin,
                color = Color.Gray
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Start)
            ) {
                Text(
                    text = jobModel.jobLocationSlug ?: "Location",
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
                )

                Text(
                    text = "·",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.Gray
                )

                Text(
                    text = "₹${jobModel.salaryMin ?: 0} - ₹${jobModel.salaryMax ?: 0}",
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
                )

                Text(
                    text = "·",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.Gray
                )

                Text(
                    text = jobModel.whatsappNo ?: "Contact",
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
                )
            }
        }
    }
}

@Preview
@Composable
fun JobCardPreview() {
    JobCard(
        jobModel = JobModel.sampleJobModel,
        onCardClick = {}
    )
}