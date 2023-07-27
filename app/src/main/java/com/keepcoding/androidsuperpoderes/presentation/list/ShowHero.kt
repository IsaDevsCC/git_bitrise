package com.keepcoding.androidsuperpoderes.presentation.list

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.keepcoding.androidsuperpoderes.presentation.HeroTestDataBuilder
import com.keepcoding.androidsuperpoderes.domain.model.HeroModel

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
