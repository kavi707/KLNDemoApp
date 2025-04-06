package com.kavi.droid.kln.demo.stat

import androidx.compose.runtime.Composable
import com.kavi.droid.kln.demo.parent.UIModuleContract
import com.kavi.droid.kln.demo.stat.ui.StatDeptUI
import javax.inject.Inject

class StatDeptContract @Inject constructor(): UIModuleContract {

    @Inject
    lateinit var statDeptUI: StatDeptUI

    @Composable
    override fun GetEntryUIWithData(data: String?) {
        statDeptUI.StatDeptUI()
    }
}