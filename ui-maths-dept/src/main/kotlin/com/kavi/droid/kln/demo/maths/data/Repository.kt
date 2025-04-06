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
        ),
        Lecturer(
            name = "Mr. J. Munasinghe",
            description = "Senior Lecturer  (Grade I)\nM.Sc.Nat(Kaiserslautern, Germany), B.Sc.(Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/6.jpg"
        ),
        Lecturer(
            name = "Dr. (Mrs.) K.K.K.R. Perera",
            description = "Senior Lecturer  (Grade I)\nPh.D, MSc.(Kyushu), M.Sc.(Colombo),B.Sc.(Kelaniya), Dip. NIBM, CBA",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/1.jpg"
        ),
        Lecturer(
            name = "Dr. (Mrs) G.S. Wijesiri",
            description = "Senior Lecturer  (Grade I)\nPh.D, MA. (Oakland), B.Sc. (Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/7.jpg"
        ),
        Lecturer(
            name = "Ms. N.A.S.N. Wimaladharma",
            description = "Senior Lecturer  (Grade I)\nM.Phil (Kelaniya), B.Sc.(Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/8.jpg"
        ),
        Lecturer(
            name = "Dr. (Mrs.) W.P.T. Hansameenu",
            description = "Senior Lecturer  (Grade I)\nPh.D (Texas Tech, USA), M.Sc. (Texas Tech, USA) B.Sc.(Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/12.jpg"
        ),
        Lecturer(
            name = "Dr. Upeksha Perera",
            description = "Senior Lecturer  (Grade I) and Academic Advisor\nPhD (Potsdam, Germany), M.Sc.(Moratuwa), B.Sc.(Ruhuna) ,BCS , ACS",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/11.jpg"
        ),
        Lecturer(
            name = "Mr. K.D.W.J. Katugampola",
            description = "Senior Lecturer  (Grade II)\nM.Phil (Kelaniya), B.Sc.(Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/9.jpg"
        ),
        Lecturer(
            name = "Dr. (Mrs.) M. H. L.Weerasinghe",
            description = "Senior Lecturer (Grade II)\nPh.D, M.Sc. (Missouri University of Science and Technology, USA) B.Sc. (Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/MHW.jpg"
        )
    )

    val staffData = StaffData(
        deptName = "Mathematics",
        staffList = lecturerList
    )
}