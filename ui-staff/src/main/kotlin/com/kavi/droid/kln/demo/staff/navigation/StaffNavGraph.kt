package com.kavi.droid.kln.demo.staff.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.gson.Gson
import com.kavi.droid.kln.demo.parent.model.Lecturer
import com.kavi.droid.kln.demo.parent.model.StaffData
import com.kavi.droid.kln.demo.staff.ui.LecturerUI
import com.kavi.droid.kln.demo.staff.ui.StaffUI
import javax.inject.Inject

class StaffNavigation @Inject constructor() {

    @Inject
    lateinit var staffUI: StaffUI

    @Inject
    lateinit var lecturer: LecturerUI

    @Composable
    fun StaffNavGraph(navController: NavHostController, startDestination: String = "staff_list", staffData: StaffData?) {
        NavHost(navController = navController, startDestination = startDestination) {
            composable(route = "staff_list") {
                staffUI.StaffListUI(navController, staffData)
            }
            composable(route = "empty_staff") {
                staffUI.NoStaffDataUI()
            }
            composable(route = "staff_person/{lecturer}") { backStackEntry ->
                val lecturerJson = backStackEntry.arguments?.getString("lecturer")
                val lecturerData = Gson().fromJson(lecturerJson, Lecturer::class.java)
                lecturer.LecturerDetailUI(lecturer = lecturerData)
            }
        }
    }
}
