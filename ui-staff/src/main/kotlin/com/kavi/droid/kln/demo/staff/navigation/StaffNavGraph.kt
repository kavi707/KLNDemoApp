package com.kavi.droid.kln.demo.staff.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kavi.droid.kln.demo.parent.model.StaffData
import com.kavi.droid.kln.demo.staff.ui.LecturerDetailUI
import com.kavi.droid.kln.demo.staff.ui.NoStaffDataUI
import com.kavi.droid.kln.demo.staff.ui.StaffListUI

@Composable
fun StaffNavGraph(navController: NavHostController, startDestination: String = "staff_list", staffData: StaffData?) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable(route = "staff_list") {
            StaffListUI(staffData)
        }
        composable(route = "empty_staff") {
            NoStaffDataUI()
        }
        composable(route = "staff_person") {
            LecturerDetailUI()
        }
    }
}