package com.firelord.jobseeker.presentation.ui.screen.bottomNavigation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.firelord.jobseeker.presentation.ui.theme.NeonGreen

@Composable
fun CustomBottomNavigation(
    modifier: Modifier,
    icon: Painter,
    isSelected: Boolean,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .background(Color.Transparent)
            .size(56.dp)
    ) {
        Icon(
            painter = icon,
            contentDescription = null,
            tint = if (isSelected) NeonGreen else Color.Gray,
            modifier = Modifier
                .size(32.dp)
        )
    }
}

@Preview
@Composable
fun CustomBottomNavigationPreview() {
    CustomBottomNavigation(
        modifier = Modifier,
        icon = rememberVectorPainter(image = Icons.Default.Home),
        isSelected = true
    )
}