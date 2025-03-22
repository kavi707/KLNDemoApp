package com.kavi.droid.kln.demo.module_b

import androidx.compose.runtime.Composable
import com.kavi.droid.kln.demo.module_b.ui.ModuleBUI
import com.kavi.droid.kln.demo.parent.UIModuleContract

class ModuleBContract: UIModuleContract {
    @Composable
    override fun GetEntryUI() {
        ModuleBUI()
    }
}