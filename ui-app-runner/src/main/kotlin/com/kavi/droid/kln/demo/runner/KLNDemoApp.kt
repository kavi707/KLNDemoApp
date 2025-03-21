package com.kavi.droid.kln.demo.runner

import android.app.Application
import com.kavi.droid.color.palette.KvColorPalette
import com.kavi.droid.color.palette.color.MatPackage

class KLNDemoApp: Application() {

    override fun onCreate() {
        super.onCreate()

        // Initiate the color palette
        KvColorPalette.initialize(basicColor = MatPackage.MatDGreen.color)
    }
}