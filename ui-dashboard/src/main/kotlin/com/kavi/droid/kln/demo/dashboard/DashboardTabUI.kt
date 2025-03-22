package com.kavi.droid.kln.demo.dashboard

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.kavi.droid.kln.demo.stat.StatDeptUI
import com.kavi.droid.kln.demo.maths.MathDeptUI

@Composable
fun DashboardTabUI(navController: NavHostController) {
    val tabItems = listOf(
        TabModel("Stat Dept", R.drawable.stat_icon),
        TabModel("Maths Dept", R.drawable.maths_icon)
    )
    var selectedTabIndex by remember { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.primary,
            ) {
                tabItems.forEachIndexed { index, tabItem ->
                    NavigationBarItem(
                        modifier = Modifier.padding(4.dp),
                        colors = navigationBarColors(),
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index },
                        label = { Text(tabItem.name) },
                        icon = {
                            Icon(
                                painterResource(id = tabItem.icon),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(40.dp)
                                    .height(40.dp)
                                    .padding(8.dp),
                            )
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        // Content displayed above the bottom bar
        TabContent(
            selectedTabIndex = selectedTabIndex,
            modifier = Modifier
                .padding(bottom = innerPadding.calculateBottomPadding())
                .fillMaxSize()
        )
    }
}

@Composable
fun TabContent(selectedTabIndex: Int, modifier: Modifier = Modifier) {
    when (selectedTabIndex) {
        0 -> StatDeptUI()
        1 -> MathDeptUI()
    }
}

@Composable
fun navigationBarColors(): NavigationBarItemColors {
    return NavigationBarItemColors(
        selectedIconColor = MaterialTheme.colorScheme.onPrimary,
        selectedTextColor = MaterialTheme.colorScheme.onPrimary,
        unselectedIconColor = Color.Black,
        unselectedTextColor = MaterialTheme.colorScheme.onPrimary,
        selectedIndicatorColor = MaterialTheme.colorScheme.tertiary,
        disabledIconColor = Color.Gray,
        disabledTextColor = Color.Gray,
    )
}