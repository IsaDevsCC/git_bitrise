package com.keepcoding.androidsuperpoderes.presentation.list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.koin.androidx.compose.koinViewModel

@Composable
fun HeroListScreen(
    superHeroListViewModel: HeroListViewModel = koinViewModel()
) {

    // Get data from ViewModel

    // Init List
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "Hello ${superHeroListViewModel.testString}"
        )
    }
    // Show each Hero


}

@Preview
@Composable
fun HeroListScreenPreview() {
    HeroListScreen()
}
