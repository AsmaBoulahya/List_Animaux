package com.example.animal

data class Animal(
    val nom: String,
    val espece: String,
    val image: Int,
    var isSelected: Boolean = false
)

