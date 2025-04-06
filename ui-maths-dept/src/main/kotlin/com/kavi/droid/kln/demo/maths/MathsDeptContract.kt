package com.kavi.droid.kln.demo.maths

import androidx.compose.runtime.Composable
import com.kavi.droid.kln.demo.maths.ui.MathsDeptUI
import com.kavi.droid.kln.demo.parent.UIModuleContract
import javax.inject.Inject

class MathsDeptContract @Inject constructor() : UIModuleContract {

    @Inject
    lateinit var mathDeptUI: MathsDeptUI

    @Composable
    override fun GetEntryUIWithData(data: String?) {
        mathDeptUI.MathDeptUI()
    }
}