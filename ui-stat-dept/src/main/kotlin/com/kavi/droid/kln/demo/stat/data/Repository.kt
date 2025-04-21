package com.kavi.droid.kln.demo.stat.data

import com.kavi.droid.kln.demo.parent.model.Lecturer
import com.kavi.droid.kln.demo.parent.model.StaffData
import javax.inject.Inject

class Repository @Inject constructor() {

    val lecturerList = listOf<Lecturer>(
        Lecturer(
            name = "Prof. N.V. Chandrasekara (Head of the Department and Professor)",
            description = "B.Sc.(Special in Statistics with Computer Science) (Colombo), B.Sc. (Computer Science, BCS, UK), MAFE (Colombo),\nPh.D. (Colombo), MBCS",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/NVCHandrasekara.jpg",
            email = "nvchandrasekara@kln.ac.lk",
            phone = "+94 (011) 2903 375 (ext: 375)",
            researchInterests = listOf(
                " - Data Mining",
                " - Deep Learning",
                " - Time Series Forecasting",
                " - Econometrics",
                " - Statistical Modelling",
            )
        ),
        Lecturer(
            name = "Prof. D.D.M. Jayasundara (Professor)",
            description = "B.Sc. (Special)(Kelaniya), M.Sc, PhD (Kaiserslautern, Germany)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/DDmJayasundara.png",
            email = "jayasund@kln.ac.lk",
            phone = "+94 (011) 2903 377 (ext: 377)",
            researchInterests = listOf(
                " - Applied optimization problems leading to facility location planning and optimization",
                " - Applied statistics",
            )
        ),
        Lecturer(
            name = "Dr. (Mrs.) A.M.C.H. Attanayake (Senior Lecturer Grade I)",
            description = "B. Sc. (Special) (Kelaniya), M.Sc (Moratuwa), PhD (Colombo)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/Attanayake.png",
            email = "succ@kln.ac.lk | chadithaattanayake@yahoo.com",
            phone = "+94 (011) 2903 374 (ext: 374)",
            researchInterests = listOf(
                " - Operational Research",
                " - Time series analysis",
                " - Multivariate Statistics",
                " - Sampling Techniques",
                " - Mathematical/Statistical Modelling",
            )
        ),
        Lecturer(
            name = "Dr. (Mrs.) A.P. Hewaarachchi (Senior Lecturer Grade I)",
            description = "B.Sc. (Special)(Colombo), M.Sc (Mathematics, USA), M.Sc(Mathematics Concentration on Statistics, USA), PhD (Clemson, USA)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/APHewaarachchi.jpg",
            email = "anuradhah@kln.ac.lk",
            phone = "+94 (011) 2903 379 (ext: 379)",
            researchInterests = listOf(
                " - Time series and forecasting",
                " - Statistical Climatology",
                " - Bayesian Statistics",
                " - Markov Chains",
            )
        ),
        Lecturer(
            name = "Mrs. W.G.D.M. Samankula (Senior Lecturer Grade II)",
            description = "B.Sc. (Special)(Kelaniya), M.Phil. (Computer Science, Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/Samankula.jpg",
            email = "samankula@kln.ac.lk",
            phone = "+94 (011) 2903 371 (ext: 371)",
            researchInterests = listOf(
                " - Natural Language Processing",
            )
        ),
        Lecturer(
            name = "Dr. (Mrs.) D.M.P.V. Dissanayaka (Senior Lecturer Grade II)",
            description = "B.Sc.(Special) (Kelaniya), M.Sc (Statistics, USA), Ph.D.(Mathematics Concentration on Statistics, USA)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/DMPVDissanayake.png",
            email = "pansujeed@kln.ac.lk",
            phone = "+94 (011) 2903 379 (ext: 379)",
            researchInterests = listOf(
                " - Computer vision",
                " - Functional Data analysis",
                " - Statistics on ManifoldMultivariate analysis",
                " - Data Science",
            )
        ),
        Lecturer(
            name = "Dr. W.A.C. Weerakoon (Senior Lecturer Grade II)",
            description = "B.Sc. (Special) (Kelaniya), M.Sc. (Colombo), PhD (Computer Science, Moratuwa)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/WACWeerakoon.jpg",
            email = "chinthanie@kln.ac.lk",
            phone = "+94 (011) 2903 371 (ext: 371)",
            researchInterests = listOf(
                " - Swarm Intelligence",
                " - Agent Technologies",
                " - Theory of Computation",
                " - Memory Models",
            )
        ),
        Lecturer(
            name = "Dr. H.W.B. Kavinga (Senior Lecturer Grade II)",
            description = "B.Sc.(Special) (Kelaniya), M.Sc. (Statistics, USA), Ph.D.(Mathematics Concentration on Statistics, USA)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/Basithakavinga.jpg",
            email = "basitha@kln.ac.lk",
            phone = "+94 (011) 2903 379 (ext: 379)",
            researchInterests = listOf(
                " - Time Series Analysis",
                " - Stochastic Processes",
            )
        ),
        Lecturer(
            name = "Dr. (Mrs.) B.M.T. Kumarika (Senior Lecturer Grade II)",
            description = "B.Sc.(Special) (Kelaniya), M. Sc. (Computer Science, USA), Ph.D. (Computer Science, GSU, USA)",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/BMTKumarika.jpg",
            email = "thosini@kln.ac.lk",
            phone = "+94 (011) 2903 379 (ext: 379)",
            researchInterests = listOf(
                " - Deep Graph Learning",
                " - Advanced Machine Learning",
                " - Computing in Medicine",
                " - Deep Learning",
                " - Machine Learning",
                " - Artificial Intelligence",
            )
        ),
        Lecturer(
            name = "Mrs. D.B. Jayasuriya (Lecturer)",
            description = "BSc (IT) Hons (Moratuwa), MSc in Computer Science specialized in Software Architecture (Moratuwa).",
            imageUrl = "https://science.kln.ac.lk/depts/stcs/images/Staff/Academic/dhanuJay.jpg",
            email = "dhanushkaj@kln.ac.lk",
            phone = "+94 (011) 2903 371 (ext: 371)",
            researchInterests = listOf(
                " - Software Engineering",
                " - Natural Language Processing",
            )
        )
    )

    val staffData = StaffData(
        deptName = "Statistics and Computer Science",
        staffList = lecturerList
    )
}