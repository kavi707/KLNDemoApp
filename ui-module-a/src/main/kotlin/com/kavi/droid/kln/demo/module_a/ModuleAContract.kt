package com.kavi.droid.kln.demo.module_a

import androidx.compose.runtime.Composable
import com.kavi.droid.kln.demo.module_a.ui.ModuleAUI
import com.kavi.droid.kln.demo.parent.UIModuleContract

class ModuleAContract: UIModuleContract {
    @Composable
    override fun GetEntryUI() {
        ModuleAUI()
    }
}