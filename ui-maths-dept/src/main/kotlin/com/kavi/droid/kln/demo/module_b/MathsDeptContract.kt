package com.kavi.droid.kln.demo.module_b

import androidx.compose.runtime.Composable
import com.kavi.droid.kln.demo.module_b.ui.MathDeptUI
import com.kavi.droid.kln.demo.parent.UIModuleContract

class MathsDeptContract: UIModuleContract {
    @Composable
    override fun GetEntryUI() {
        MathDeptUI()
    }
}