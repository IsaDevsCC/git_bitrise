package com.keepcoding.androidsuperpoderes.presentation.list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.keepcoding.androidsuperpoderes.HeroTestDataBuilder
import org.koin.androidx.compose.koinViewModel

@Composable
fun HeroListScreen(
    superHeroListViewModel: HeroListViewModel = koinViewModel()
) {

    // Get data from ViewModel

    val heroList = HeroTestDataBuilder()
        .withNumElements(15)
        .withName("Name")
        .withDescription("Description")
        .withPhotoUrl("https://depor.com/resizer/oPf-2Xij6G_oA4sfJ7Y5DGDQYhM=/580x330/" +
                "smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishi" +
                "ng.com/elcomercio/DAYT2F5NUNB7VPAFKUPHNDXVQA.jpg")
        .buildList()


    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(heroList.size) { i ->
            // Show each Hero
            ShowHero(heroList[i])
        }
    }
}

@Preview
@Composable
fun HeroListScreenPreview() {
    HeroListScreen()
}
