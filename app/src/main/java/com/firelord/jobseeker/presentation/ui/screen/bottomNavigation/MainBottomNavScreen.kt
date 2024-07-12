package com.firelord.jobseeker.presentation.ui.screen.bottomNavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabDisposable
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.firelord.jobseeker.presentation.ui.screen.bottomNavigation.component.CustomBottomNavigation
import com.firelord.jobseeker.presentation.ui.screen.bottomNavigation.tabs.BookmarkTab
import com.firelord.jobseeker.presentation.ui.screen.bottomNavigation.tabs.HomeTab

class MainBottomNavScreen: Screen {
    @Composable
    override fun Content() {
        TabNavigator(
            tab = HomeTab,
            tabDisposable = {
                TabDisposable(
                    navigator = it,
                    tabs = listOf(HomeTab, BookmarkTab)
                )
            }
        ) { _ ->
            Scaffold(
                content = {
                 CurrentTab()
                 print(it)
                },
                bottomBar = {
                    Box(
                        contentAlignment = Alignment.BottomCenter,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(40.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .shadow(elevation = 10.dp, shape = RoundedCornerShape(30.dp))
                                .clip(RoundedCornerShape(30.dp))
                                .width(150.dp)
                                .background(color = Color.Black)
                        ) {
                            TabNavigationItem(tab = HomeTab)
                            TabNavigationItem(tab = BookmarkTab)
                        }
                    }
                }
            )
        }
    }

    @Composable
    private fun TabNavigationItem(tab: Tab) {
        val tabNavigator = LocalTabNavigator.current

        CustomBottomNavigation(
            modifier = Modifier
                .clickable {
                    tabNavigator.current = tab
                },
            icon = tab.options.icon ?: rememberVectorPainter(Icons.Default.Favorite),
            isSelected =  tabNavigator.current.key == tab.key
        )
    }
}

@Preview
@Composable
fun MainBottomNavScreenPreview() {
    MainBottomNavScreen().Content()
}