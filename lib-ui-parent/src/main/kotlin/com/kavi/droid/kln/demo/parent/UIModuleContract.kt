package com.kavi.droid.kln.demo.parent

import androidx.compose.runtime.Composable

interface UIModuleContract {
    @Composable
    fun GetEntryUIWithData(data: String?)
}