package com.kavi.droid.kln.demo.runner.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kavi.droid.kln.demo.parent.UIModuleRegistry
import com.kavi.droid.kln.demo.runner.theme.KLNDemoTheme

class ContainerActivity: ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KLNDemoTheme {
                navController = rememberNavController()

                UIModuleRegistry.getModuleRegistry().getUIModule("DASHBOARD")?.GetEntryUI()
            }
        }
    }
}