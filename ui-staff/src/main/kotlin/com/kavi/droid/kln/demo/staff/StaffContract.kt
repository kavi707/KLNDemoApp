package com.kavi.droid.kln.demo.staff

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.google.gson.Gson
import com.kavi.droid.kln.demo.parent.UIModuleContract
import com.kavi.droid.kln.demo.parent.model.StaffData
import com.kavi.droid.kln.demo.staff.navigation.StaffNavGraph

class StaffContract: UIModuleContract {

    @Composable
    override fun GetEntryUIWithData(data: String?) {
        data?.let {
            val staffData = Gson().fromJson(it, StaffData::class.java)
            StaffNavGraph(navController = rememberNavController(), staffData = staffData)
        }?: run {
            StaffNavGraph(navController = rememberNavController(), startDestination = "empty_staff", staffData = null)
        }
    }
}