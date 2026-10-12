package com.example.superheroes.model

import com.example.superheroes.R

object HeroesRepository {
    val heroes = listOf(
        Hero(
            id = 1,
            nameRes = R.string.hero1_name,
            descriptionRes = R.string.hero1_description,
            imageRes = R.drawable.android_superhero1
        ),
        Hero(
            id = 2,
            nameRes = R.string.hero2_name,
            descriptionRes = R.string.hero2_description,
            imageRes = R.drawable.android_superhero2
        ),
        Hero(
            id = 3,
            nameRes = R.string.hero3_name,
            descriptionRes = R.string.hero3_description,
            imageRes = R.drawable.android_superhero3
        ),
        Hero(
            id = 4,
            nameRes = R.string.hero4_name,
            descriptionRes = R.string.hero4_description,
            imageRes = R.drawable.android_superhero4
        ),
        Hero(
            id = 5,
            nameRes = R.string.hero5_name,
            descriptionRes = R.string.hero5_description,
            imageRes = R.drawable.android_superhero5
        ),
        Hero(
            id = 6,
            nameRes = R.string.hero6_name,
            descriptionRes = R.string.hero6_description,
            imageRes = R.drawable.android_superhero6
        )
    )
}
