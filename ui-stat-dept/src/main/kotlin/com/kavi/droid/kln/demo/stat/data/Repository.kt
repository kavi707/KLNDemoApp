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
        ),
        Lecturer(
            name = "Dr. (Mrs.) A.M.C.H. Attanayake (Senior Lecturer Grade I)",
            description = "B. Sc. (Special) (Kelaniya), M.Sc (Moratuwa), PhD (Colombo)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/Attanayake.png"
        ),
        Lecturer(
            name = "Dr. (Mrs.) A.P. Hewaarachchi (Senior Lecturer Grade I)",
            description = "B.Sc. (Special)(Colombo), M.Sc (Mathematics, USA), M.Sc(Mathematics Concentration on Statistics, USA), PhD (Clemson, USA)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/APHewaarachchi.jpg"
        ),
        Lecturer(
            name = "Mrs. W.G.D.M. Samankula (Senior Lecturer Grade II)",
            description = "B.Sc. (Special)(Kelaniya), M.Phil. (Computer Science, Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/Samankula.jpg"
        ),
        Lecturer(
            name = "Dr. (Mrs.) D.M.P.V. Dissanayaka (Senior Lecturer Grade II)",
            description = "B.Sc.(Special) (Kelaniya), M.Sc (Statistics, USA), Ph.D.(Mathematics Concentration on Statistics, USA)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/DMPVDissanayake.png"
        ),
        Lecturer(
            name = "Dr. W.A.C. Weerakoon (Senior Lecturer Grade II)",
            description = "B.Sc. (Special) (Kelaniya), M.Sc. (Colombo), PhD (Computer Science, Moratuwa)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/WACWeerakoon.jpg"
        ),
        Lecturer(
            name = "Dr. H.W.B. Kavinga (Senior Lecturer Grade II)",
            description = "B.Sc.(Special) (Kelaniya), M.Sc. (Statistics, USA), Ph.D.(Mathematics Concentration on Statistics, USA)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/Basithakavinga.jpg"
        ),
        Lecturer(
            name = "Dr. (Mrs.) B.M.T. Kumarika (Senior Lecturer Grade II)",
            description = "B.Sc.(Special) (Kelaniya), M. Sc. (Computer Science, USA), Ph.D. (Computer Science, GSU, USA)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/BMTKumarika.jpg"
        ),
        Lecturer(
            name = "Mrs. D.B. Jayasuriya (Lecturer)",
            description = "BSc (IT) Hons (Moratuwa), MSc in Computer Science specialized in Software Architecture (Moratuwa).",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/dhanuJay.jpg"
        )
    )

    val staffData = StaffData(
        deptName = "Statistics and Computer Science",
        staffList = lecturerList
    )
}