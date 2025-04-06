package com.kavi.droid.kln.demo.staff.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kavi.droid.kln.demo.parent.model.StaffData
import com.kavi.droid.kln.demo.staff.ui.LecturerDetailUI
import com.kavi.droid.kln.demo.staff.ui.StaffUI
import javax.inject.Inject

class StaffNavigation @Inject constructor() {

    @Inject
    lateinit var staffUI: StaffUI

    @Composable
    fun StaffNavGraph(navController: NavHostController, startDestination: String = "staff_list", staffData: StaffData?) {
        NavHost(navController = navController, startDestination = startDestination) {
            composable(route = "staff_list") {
                staffUI.StaffListUI(staffData)
            }
            composable(route = "empty_staff") {
                staffUI.NoStaffDataUI()
            }
            composable(route = "staff_person") {
                LecturerDetailUI()
            }
        }
    }
}
