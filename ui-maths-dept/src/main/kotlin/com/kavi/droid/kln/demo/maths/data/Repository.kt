package com.kavi.droid.kln.demo.maths.data

import com.kavi.droid.kln.demo.parent.model.Lecturer
import com.kavi.droid.kln.demo.parent.model.StaffData
import javax.inject.Inject

class Repository @Inject constructor() {

    val lecturerList = listOf<Lecturer>(
        Lecturer(
            name = "Dr. (Mrs.) L. P. N. D. Premarathna",
            description = "Head of the department and Senior Lecturer (Grade I)\nPh.D (Massey, NZ), M.Sc.(Moratuwa), B.Sc.(Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/10.jpg",
            email = "lpnadeeka@kln.ac.lk",
            phone = "+94 (0)11 2 903 303 (ext: 303)",
            researchInterests = listOf(
                " - Modeling : Financial Applications (Financial Derivatives, Financial Time Series)",
                " - Market Micro-Structure (Market Efficiency, Volatility, Volatility Spillover)"
            )
        ),
        Lecturer(
            name = "Dr. N.P.W.B.V.K. Senanayake",
            description = "Senior Lecturer (Grade I)\nPh.D., M.Sc.(Kyushu), B.Sc.(Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/3.jpg",
            email = "vernon@kln.ac.lk",
            phone = "+94 (0)11 2 903 304 (ext: 304)",
            researchInterests = listOf(
                " - Differential Geometry - The Geometry of Alexandrov Space"
            )
        ),
        Lecturer(
            name = "Mr. J. Munasinghe",
            description = "Senior Lecturer  (Grade I)\nM.Sc.Nat(Kaiserslautern, Germany), B.Sc.(Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/6.jpg",
            email = "munasing@kln.ac.lk",
            phone = "+94 (0)11 2 903 300 (ext: 300), +94 (0) 112903312, +94 (0)114851098",
            researchInterests = listOf(
                " - Mathematical Modeling and Scientific Computing",
                " - Computational Fluid Dynamics"
            )
        ),
        Lecturer(
            name = "Dr. (Mrs.) K.K.K.R. Perera",
            description = "Senior Lecturer  (Grade I)\nPh.D, MSc.(Kyushu), M.Sc.(Colombo),B.Sc.(Kelaniya), Dip. NIBM, CBA",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/1.jpg",
            email = "kkkrperera@kln.ac.lk",
            phone = "+94 (0)11 2 903 304 (ext: 304)",
            researchInterests = listOf(
                " - Spectral Graph Theory and related applications",
                " - Energy of graphs"
            )
        ),
        Lecturer(
            name = "Dr. (Mrs) G.S. Wijesiri",
            description = "Senior Lecturer  (Grade I)\nPh.D, MA. (Oakland), B.Sc. (Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/7.jpg",
            email = "sujeew@kln.ac.lk",
            phone = "+94 (0)11 2 903 310 (ext: 310)",
            researchInterests = listOf(
                " - Computational Algebraic Geometry",
                " - Elliptic curves and Cryptography",
                " - Coding Theory"
            )
        ),
        Lecturer(
            name = "Ms. N.A.S.N. Wimaladharma",
            description = "Senior Lecturer  (Grade I)\nM.Phil (Kelaniya), B.Sc.(Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/8.jpg",
            email = "wimaladharma@kln.ac.lk",
            phone = "+94 (0)11 2 903 310 (ext: 310)",
            researchInterests = listOf(
                " - General Relativity"
            )
        ),
        Lecturer(
            name = "Dr. (Mrs.) W.P.T. Hansameenu",
            description = "Senior Lecturer  (Grade I)\nPh.D (Texas Tech, USA), M.Sc. (Texas Tech, USA) B.Sc.(Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/12.jpg",
            email = "hansameenu@kln.ac.lk",
            phone = "+94 (0)11 2 903 302 (ext: 302)",
            researchInterests = listOf(
                " - Control Theory",
                " - Fluid Dynamics",
                " - Mathematical Biology",
                " - Partial Differential Equations",
            )
        ),
        Lecturer(
            name = "Dr. Upeksha Perera",
            description = "Senior Lecturer  (Grade I) and Academic Advisor\nPhD (Potsdam, Germany), M.Sc.(Moratuwa), B.Sc.(Ruhuna) ,BCS , ACS",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/11.jpg",
            email = "upeksha@kln.ac.lk",
            phone = "+94 (0)11 2 903 311(ext: 311)",
            researchInterests = listOf(
                " - Sturm-Liouville theory",
                " - Artificial Neural Networks, Fuzzy systems",
            )
        ),
        Lecturer(
            name = "Mr. K.D.W.J. Katugampola",
            description = "Senior Lecturer  (Grade II)\nM.Phil (Kelaniya), B.Sc.(Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/9.jpg",
            email = "wasantha@kln.ac.lk",
            phone = "+94 (0)11 2 903 310 (ext: 310)",
            researchInterests = listOf(
                " - Cosmology",
            )
        ),
        Lecturer(
            name = "Dr. (Mrs.) M. H. L.Weerasinghe",
            description = "Senior Lecturer (Grade II)\nPh.D, M.Sc. (Missouri University of Science and Technology, USA) B.Sc. (Kelaniya)",
            imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/MHW.jpg",
            email = "madhukahl@kln.ac.lk",
            phone = "+94 (0)11 2 903 302(ext: 302)",
        )
    )

    val staffData = StaffData(
        deptName = "Mathematics",
        staffList = lecturerList
    )
}