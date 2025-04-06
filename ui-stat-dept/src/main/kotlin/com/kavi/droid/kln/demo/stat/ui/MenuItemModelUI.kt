package com.kavi.droid.kln.demo.stat.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.google.gson.Gson
import com.kavi.droid.kln.demo.parent.UIModuleRegistry
import com.kavi.droid.kln.demo.stat.data.Repository
import javax.inject.Inject

class MenuItemModelUI @Inject constructor() {

    @Inject
    lateinit var uiModuleRegistry: UIModuleRegistry

    @Inject
    lateinit var repository: Repository

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MenuItemSheet(sheetState: SheetState, showSheet: MutableState<Boolean>) {
        ModalBottomSheet(
            sheetState = sheetState,
            onDismissRequest = {
                showSheet.value = false
            }
        ) {
            val staffDataString = Gson().toJson(repository.staffData)
            uiModuleRegistry.getUIModule("STAFF")?.GetEntryUIWithData(data = staffDataString)
        }
    }
}