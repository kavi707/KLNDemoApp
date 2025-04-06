package com.kavi.droid.kln.demo.maths.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.google.gson.Gson
import com.kavi.droid.kln.demo.maths.data.Repository
import com.kavi.droid.kln.demo.maths.model.MenuItemModel
import com.kavi.droid.kln.demo.parent.UIModuleRegistry
import javax.inject.Inject

class MenuItemModelUI @Inject constructor() {

    @Inject
    lateinit var uiModuleRegistry: UIModuleRegistry

    @Inject
    lateinit var repository: Repository

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MenuItemSheet(sheetState: SheetState, showSheet: MutableState<Boolean>, menuItem: MenuItemModel) {
        ModalBottomSheet(
            sheetState = sheetState,
            onDismissRequest = {
                showSheet.value = false
            }
        ) {
            when (menuItem) {
                MenuItemModel.STAFF -> {
                    val staffDataString = Gson().toJson(repository.staffData)
                    uiModuleRegistry.getUIModule("STAFF")?.GetEntryUIWithData(data = staffDataString)
                }
                MenuItemModel.NEWS -> {}
                MenuItemModel.ABOUT_US -> {}
                MenuItemModel.CONTACT_US -> {}
            }
        }
    }
}