package com.keepcoding.androidsuperpoderes.presentation.detail

import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import com.keepcoding.androidsuperpoderes.components.ShowError
import org.koin.androidx.compose.koinViewModel

@Composable
fun HeroDetailScreen(
    id: String,
    heroDetailViewModel: DetailViewModel = koinViewModel()
) {
    val heroState = heroDetailViewModel.hero.observeAsState()
    val errorState = heroDetailViewModel.errorMessage.observeAsState()

    heroDetailViewModel.getHero(id)

    if (errorState.value?.isNotEmpty() == true) {
        val error = errorState.value
        ShowError(error = error ?: "")
    }

    val result = heroState.value

    // Side Effects
    // Mutabilidad
    result?.let { hero ->
        ShowHeroDetail(hero = hero)
    } ?: run {
        ShowError("Unknown error")
    }

    /*
    if (result != null) {

    } else {

    }
    */

}

/**
 * Paradigma funcional vs Paradigma Orientaión a Objetos
 * Para cada conjunto de valores de entrada siempre voy a tener la misma salida
 */
fun test(

    param1: String,
) {

}