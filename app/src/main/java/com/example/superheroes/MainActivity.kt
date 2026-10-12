package com.example.superheroes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.superheroes.model.HeroesRepository
import com.example.superheroes.ui.theme.SuperheroesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperheroesTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "hero_list"
                ) {
                    // LIST SCREEN ROUTE
                    composable("hero_list") {
                        HeroesScreen(
                            onHeroClick = { heroId ->
                                navController.navigate("hero_detail/$heroId")
                            }
                        )
                    }

                    // DETAIL SCREEN ROUTE
                    composable("hero_detail/{heroId}") { backStackEntry ->
                        val heroId = backStackEntry.arguments?.getString("heroId")!!.toInt()
                        val hero = HeroesRepository.heroes.first { it.id == heroId }

                        HeroDetailScreen(
                            hero = hero,
                            onBackClick = { navController.navigateUp() }
                        )
                    }
                }
            }

        }
    }
}