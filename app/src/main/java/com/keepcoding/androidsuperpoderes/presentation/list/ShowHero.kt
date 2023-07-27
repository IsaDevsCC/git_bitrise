package com.keepcoding.androidsuperpoderes.presentation.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.keepcoding.androidsuperpoderes.HeroTestDataBuilder
import com.keepcoding.androidsuperpoderes.R
import com.keepcoding.androidsuperpoderes.domain.model.HeroModel


// Ejercicio en mostrar un diseño de un Hero
// Mostrar la imagen con coil
@Composable
fun ShowHero(
    hero: HeroModel
) {
    Row(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        AsyncImage(
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            placeholder = painterResource(id = R.drawable.ball),
            error = painterResource(id = R.drawable.ball),
            model = ImageRequest.Builder(LocalContext.current)
                .data(hero.photoUrl)
                .build()
            , contentDescription = ""
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = hero.name,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = hero.description,
                maxLines = 4,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}


@Composable
@Preview
fun ShowHeroPreview() {
    ShowHero(
        HeroTestDataBuilder()
            .withName("Sample name long text long text long text long textlong text long text long text")
            .withDescription(
                "Sample name long text long text long text long textlong text long text long text" +
                "Sample name long text long text long text long textlong text long text long text" +
                "Sample name long text long text long text long textlong text long text long text" +
                "Sample name long text long text long text long textlong text long text long text" +
                "Sample name long text long text long text long textlong text long text long text" +
                "Sample name long text long text long text long textlong text long text long text" +
                "Sample name long text long text long text long textlong text long text long text"
            )

            .buildSingle()
    )
}
