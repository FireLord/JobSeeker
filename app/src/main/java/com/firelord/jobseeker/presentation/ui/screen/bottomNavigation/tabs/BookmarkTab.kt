package com.firelord.jobseeker.presentation.ui.screen.bottomNavigation.tabs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.NavigatorDisposeBehavior
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import cafe.adriel.voyager.transitions.SlideTransition
import com.firelord.jobseeker.presentation.ui.screen.bookmark.BookmarkScreen

object BookmarkTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(Icons.Default.Favorite)

            return remember {
                TabOptions(
                    index = 1u,
                    icon = icon,
                    title = "Bookmark"
                )
            }
        }

    @Composable
    override fun Content() {
        Navigator(
            screen = BookmarkScreen(),
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