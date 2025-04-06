package com.kavi.droid.kln.demo.maths.data

import com.kavi.droid.kln.demo.parent.model.Lecturer
import com.kavi.droid.kln.demo.parent.model.StaffData
import javax.inject.Inject

class Repository @Inject constructor() {

    val lecturerList = listOf<Lecturer>(
        Lecturer(
            name = "Dr. (Mrs.) L. P. N. D. Premarathna",
            description = "Head of the department and Senior Lecturer (Grade I)\nPh.D (Massey, NZ), M.Sc.(Moratuwa), B.Sc.(Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/10.jpg"
        ),
        Lecturer(
            name = "Dr. N.P.W.B.V.K. Senanayake",
            description = "Senior Lecturer (Grade I)\nPh.D., M.Sc.(Kyushu), B.Sc.(Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/3.jpg"
        )
    )

    val staffData = StaffData(
        deptName = "Mathematics",
        staffList = lecturerList
    )
}