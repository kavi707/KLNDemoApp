package com.kavi.droid.kln.demo.runner

import android.app.Application
import com.kavi.droid.color.palette.KvColorPalette
import com.kavi.droid.color.palette.color.MatPackage
import com.kavi.droid.kln.demo.dashboard.DashboardContract
import com.kavi.droid.kln.demo.stat.StatDeptContract
import com.kavi.droid.kln.demo.maths.MathsDeptContract
import com.kavi.droid.kln.demo.parent.UIModuleRegistry
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class KLNDemoApp: Application() {

    @Inject
    lateinit var uiModuleRegistry: UIModuleRegistry

    override fun onCreate() {
        super.onCreate()

        // Initiate the color palette
        KvColorPalette.initialize(basicColor = MatPackage.MatDGreen.color)

        // Register all UI modules
        uiModuleConfig()
    }

    private fun uiModuleConfig() {
        //val uiModuleRegistry = UIModuleRegistry.getModuleRegistry()

        uiModuleRegistry.registerUIModule(name = "DASHBOARD", module = DashboardContract())
        uiModuleRegistry.registerUIModule(name = "STAT_DEPT", module = StatDeptContract())
        uiModuleRegistry.registerUIModule(name = "MATHS_DEPT", module = MathsDeptContract())
    }
}