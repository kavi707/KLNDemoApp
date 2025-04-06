package com.kavi.droid.kln.demo.runner

import android.app.Application
import com.kavi.droid.color.palette.KvColorPalette
import com.kavi.droid.kln.demo.dashboard.DashboardContract
import com.kavi.droid.kln.demo.stat.StatDeptContract
import com.kavi.droid.kln.demo.maths.MathsDeptContract
import com.kavi.droid.kln.demo.parent.UIModuleRegistry
import com.kavi.droid.kln.demo.runner.theme.KLN_COLOR
import com.kavi.droid.kln.demo.staff.StaffContract
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class KLNDemoApp: Application() {

    @Inject
    lateinit var uiModuleRegistry: UIModuleRegistry

    @Inject
    lateinit var dashboardContract: DashboardContract
    @Inject
    lateinit var mathsDeptContract: MathsDeptContract

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
        uiModuleRegistry.registerUIModule(name = "MATHS_DEPT", module = mathsDeptContract)
        uiModuleRegistry.registerUIModule(name = "STAFF", module = StaffContract())
    }
}