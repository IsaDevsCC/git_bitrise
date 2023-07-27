package com.keepcoding.androidsuperpoderes.presentation.detail

import androidx.compose.runtime.Composable
import com.keepcoding.androidsuperpoderes.HeroTestDataBuilder
import com.keepcoding.androidsuperpoderes.presentation.list.ShowHero

@Composable
fun HeroDetailScreen(
    id: String
) {

    // Faltaría extraer el hero del viewmodel a partir del id


    ShowHero(
        HeroTestDataBuilder()
            .withName("ID: $id")
            .withDescription("Long description Long description Long description Long description")
            .buildSingle()
    )

    // Mostrar información
}