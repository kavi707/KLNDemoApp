package com.kavi.droid.kln.demo.runner

import android.app.Application
import com.kavi.droid.color.palette.KvColorPalette
import com.kavi.droid.color.palette.color.MatPackage
import com.kavi.droid.kln.demo.dashboard.DashboardContract
import com.kavi.droid.kln.demo.module_a.ModuleAContract
import com.kavi.droid.kln.demo.module_b.ModuleBContract
import com.kavi.droid.kln.demo.parent.UIModuleRegistry

class KLNDemoApp: Application() {

    override fun onCreate() {
        super.onCreate()

        // Initiate the color palette
        KvColorPalette.initialize(basicColor = MatPackage.MatDGreen.color)

        // Register all UI modules
        uiModuleConfig()
    }

    private fun uiModuleConfig() {
        val uiModuleRegistry = UIModuleRegistry.getModuleRegistry()

        uiModuleRegistry.registerUIModule(name = "DASHBOARD", module = DashboardContract())
        uiModuleRegistry.registerUIModule(name = "MODULE_A", module = ModuleAContract())
        uiModuleRegistry.registerUIModule(name = "MODULE_B", module = ModuleBContract())
    }
}