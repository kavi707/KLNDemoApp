package com.kavi.droid.kln.demo.module_a

import androidx.compose.runtime.Composable
import com.kavi.droid.kln.demo.module_a.ui.StatDeptUI
import com.kavi.droid.kln.demo.parent.UIModuleContract

class StatDeptContract: UIModuleContract {
    @Composable
    override fun GetEntryUI() {
        StatDeptUI()
    }
}