package com.kavi.droid.kln.demo.stat.data

import com.kavi.droid.kln.demo.parent.model.Lecturer
import com.kavi.droid.kln.demo.parent.model.StaffData
import javax.inject.Inject

class Repository @Inject constructor() {

    val lecturerList = listOf<Lecturer>(
        Lecturer(
            name = "Prof. N.V. Chandrasekara (Head of the Department and Professor)",
            description = "B.Sc.(Special in Statistics with Computer Science) (Colombo), B.Sc. (Computer Science, BCS, UK), MAFE (Colombo),\nPh.D. (Colombo), MBCS",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/NVCHandrasekara.jpg"
        ),
        Lecturer(
            name = "Prof. D.D.M. Jayasundara (Professor)",
            description = "B.Sc. (Special)(Kelaniya), M.Sc, PhD (Kaiserslautern, Germany)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/DDmJayasundara.png"
        )
    )

    val staffData = StaffData(
        deptName = "Statistics and Computer Science",
        staffList = lecturerList
    )
}