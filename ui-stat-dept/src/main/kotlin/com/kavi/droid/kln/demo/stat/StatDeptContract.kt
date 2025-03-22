package com.kavi.droid.kln.demo.stat

import androidx.compose.runtime.Composable
import com.kavi.droid.kln.demo.parent.UIModuleContract
import com.kavi.droid.kln.demo.stat.ui.StatDeptUI

class StatDeptContract: UIModuleContract {
    @Composable
    override fun GetEntryUI() {
        StatDeptUI()
    }
}