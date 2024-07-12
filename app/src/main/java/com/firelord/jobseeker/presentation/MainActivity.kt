package com.firelord.jobseeker.presentation

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.NavigatorDisposeBehavior
import cafe.adriel.voyager.transitions.SlideTransition
import com.firelord.jobseeker.presentation.ui.screen.bottomNavigation.MainBottomNavScreen
import com.firelord.jobseeker.presentation.ui.theme.JobSeekerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(scrim = Color.WHITE, darkScrim = Color.BLACK),
            navigationBarStyle = SystemBarStyle.light(scrim = Color.WHITE, darkScrim = Color.BLACK)
        )
        setContent {
            JobSeekerTheme {
                Navigator(
                    screen = MainBottomNavScreen(),
                    disposeBehavior = NavigatorDisposeBehavior(
                        disposeNestedNavigators = false,
                        disposeSteps = true
                    )
                ) {
                    SlideTransition(navigator = it) { screen ->
                        screen.Content()
                    }
                }
            }
        }
    }
}