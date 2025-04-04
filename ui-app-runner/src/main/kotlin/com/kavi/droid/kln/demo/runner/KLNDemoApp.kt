package com.kavi.droid.kln.demo.runner

import android.app.Application
import com.kavi.droid.color.palette.KvColorPalette
import com.kavi.droid.kln.demo.dashboard.DashboardContract
import com.kavi.droid.kln.demo.stat.StatDeptContract
import com.kavi.droid.kln.demo.maths.MathsDeptContract
import com.kavi.droid.kln.demo.parent.UIModuleRegistry
import com.kavi.droid.kln.demo.runner.theme.KLN_COLOR
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class KLNDemoApp: Application() {

    @Inject
    lateinit var uiModuleRegistry: UIModuleRegistry

    @Inject
    lateinit var dashboardContract: DashboardContract

    override fun onCreate() {
        super.onCreate()

        // Initiate the color palette
        KvColorPalette.initialize(basicColor = KLN_COLOR)

        // Register all UI modules
        uiModuleConfig()
    }

    private fun uiModuleConfig() {
        uiModuleRegistry.registerUIModule(name = "DASHBOARD", module = dashboardContract)
        uiModuleRegistry.registerUIModule(name = "STAT_DEPT", module = StatDeptContract())
        uiModuleRegistry.registerUIModule(name = "MATHS_DEPT", module = MathsDeptContract())
    }
}