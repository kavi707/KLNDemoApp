package com.kavi.droid.kln.demo.dashboard

import androidx.compose.runtime.Composable
import com.kavi.droid.kln.demo.dashboard.ui.DashboardUI
import com.kavi.droid.kln.demo.parent.UIModuleContract
import javax.inject.Inject

class DashboardContract @Inject constructor() : UIModuleContract {

    @Inject
    lateinit var dashboardUI: DashboardUI

    @Composable
    override fun GetEntryUI() {
        dashboardUI.DashboardTabUI()
    }
}