package com.example.rickandmorty.model

data class Character(
    val id: Int = 0,
    val name: String = "",
    val status: String = "",
    val species: String = "",
    val type: String = "",
    val gender: String = "",
    val origin: String = "",
    val location: Location = Location(),
    val image: String = "",
    val episodes: List<String> = listOf(),
    val url: String = "",
    val created: String = "",
)
