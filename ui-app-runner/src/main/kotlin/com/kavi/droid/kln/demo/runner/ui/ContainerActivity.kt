package com.kavi.droid.kln.demo.runner.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kavi.droid.kln.demo.parent.UIModuleRegistry
import com.kavi.droid.kln.demo.runner.theme.KLNDemoTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ContainerActivity: ComponentActivity() {

    @Inject
    lateinit var uiModuleRegistry: UIModuleRegistry

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KLNDemoTheme {
                navController = rememberNavController()

                uiModuleRegistry.getUIModule("DASHBOARD")?.GetEntryUI()
            }
        }
    }
}