package com.kavi.droid.kln.demo.staff

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.google.gson.Gson
import com.kavi.droid.kln.demo.parent.UIModuleContract
import com.kavi.droid.kln.demo.parent.model.StaffData
import com.kavi.droid.kln.demo.staff.navigation.StaffNavigation
import javax.inject.Inject

class StaffContract @Inject constructor(): UIModuleContract {

    @Inject
    lateinit var staffNavigation: StaffNavigation

    @Composable
    override fun GetEntryUIWithData(data: String?) {
        data?.let {
            val staffData = Gson().fromJson(it, StaffData::class.java)
            staffNavigation.StaffNavGraph(navController = rememberNavController(), staffData = staffData)
        }?: run {
            staffNavigation.StaffNavGraph(navController = rememberNavController(), startDestination = "empty_staff", staffData = null)
        }
    }
}