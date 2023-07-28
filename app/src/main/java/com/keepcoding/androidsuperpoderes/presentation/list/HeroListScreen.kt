package com.keepcoding.androidsuperpoderes.presentation.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.keepcoding.androidsuperpoderes.HeroTestDataBuilder
import org.koin.androidx.compose.koinViewModel

@Composable
fun HeroListScreen(
    superHeroListViewModel: HeroListViewModel = koinViewModel(),
    onItemClick: (String) -> Unit
) {
    val state = superHeroListViewModel.heroList.observeAsState()

    // superHeroListViewModel.getData()

    // TODO Manage error

    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val heroList = state.value
        items(heroList?.size ?: 0) { i ->
            // Unwrap
            val item = heroList?.get(i)
            item?.let { hero ->
                ShowHero(hero) {
                    onItemClick.invoke(hero.id)
                }
            }
            /** Versión javera
            if (item != null) {

            }
            */

        }
    }
}

@Preview
@Composable
fun HeroListScreenPreview() {
    HeroListScreen {
        // Empty callback
    }
}
