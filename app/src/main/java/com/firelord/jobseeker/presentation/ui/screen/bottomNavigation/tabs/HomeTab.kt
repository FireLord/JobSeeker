package com.firelord.jobseeker.presentation.ui.screen.bottomNavigation.tabs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.NavigatorDisposeBehavior
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import cafe.adriel.voyager.transitions.SlideTransition
import com.firelord.jobseeker.presentation.ui.screen.home.HomeScreen

object HomeTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(Icons.Default.Home)

            return remember {
                TabOptions(
                    index = 0u,
                    icon = icon,
                    title = "Home"
                )
            }
        }

    @Composable
    override fun Content() {
        Navigator(
            screen = HomeScreen(),
            disposeBehavior = NavigatorDisposeBehavior(
                disposeNestedNavigators = false,
                disposeSteps = true
            )
        ) { navigator ->
            SlideTransition(navigator = navigator) { screen ->
                screen.Content()
            }
        }
    }
}