package com.kavi.droid.kln.demo.parent.model

data class Lecturer(
    val name: String,
    val description: String,
    val imageUrl: String,
    val email: String = "",
    val phone: String = "",
    val researchInterests: List<String> = emptyList(),
)
