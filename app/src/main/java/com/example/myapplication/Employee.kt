package com.example.myapplication

data class Employee(
    val id: Long,
    val fullName: String,
    val city: String,
    var isLiked: Boolean = false,
) {
    companion object {
        fun getMockEmployees() = listOf(
            Employee(
                0,
                "Ершов Евгений",
                "Екатеринбург",
            ),
            Employee(
                1,
                "Ершов Евгений",
                "Екатеринбург",
            ),
            Employee(
                2,
                "Ершов Евгений",
                "Екатеринбург",
            ),
            Employee(
                3,
                "Ершов Евгений",
                "Екатеринбург",
            )
        )
    }
}