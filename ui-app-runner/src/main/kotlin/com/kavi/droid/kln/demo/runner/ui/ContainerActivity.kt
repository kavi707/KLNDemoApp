package com.kavi.droid.kln.demo.runner.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.kavi.droid.kln.demo.runner.theme.KLNDemoTheme

class ContainerActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KLNDemoTheme {

            }
        }
    }
}