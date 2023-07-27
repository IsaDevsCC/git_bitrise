package com.keepcoding.androidsuperpoderes.presentation.list

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.keepcoding.androidsuperpoderes.HeroTestDataBuilder
import com.keepcoding.androidsuperpoderes.domain.model.HeroModel


// Ejercicio en mostrar un diseño de un Hero
// Mostrar la imagen con coil
@Composable
fun ShowHero(
    hero: HeroModel
) {
    Text(
        text = hero.name
    )
}


@Composable
@Preview
fun ShowHeroPreview() {
    ShowHero(
        HeroTestDataBuilder()
            .withName("Sample name")
            .buildSingle()
    )
}
