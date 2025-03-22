package com.kavi.droid.kln.demo.maths

import androidx.compose.runtime.Composable
import com.kavi.droid.kln.demo.maths.ui.MathDeptUI
import com.kavi.droid.kln.demo.parent.UIModuleContract

class MathsDeptContract: UIModuleContract {
    @Composable
    override fun GetEntryUI() {
        MathDeptUI()
    }
}