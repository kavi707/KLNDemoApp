package com.kavi.droid.kln.demo.dashboard

import androidx.compose.runtime.Composable
import com.kavi.droid.kln.demo.dashboard.ui.DashboardTabUI
import com.kavi.droid.kln.demo.parent.UIModuleContract

class DashboardContract: UIModuleContract {
    @Composable
    override fun GetEntryUI() {
        DashboardTabUI()
    }
}