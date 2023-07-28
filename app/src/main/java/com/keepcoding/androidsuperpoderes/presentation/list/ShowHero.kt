package com.keepcoding.androidsuperpoderes.presentation.list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
    hero: HeroModel,
    onClick: (() -> Unit)? = null
) {
    var state by remember {
        mutableStateOf(false)
    }

    if (state) {
        // Show icon
    }

    Row(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable {
                onClick?.invoke()
            }
    ) {
        AsyncImage(
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .clickable {
                   state = !state
                },
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
    ) {
        // Nothing todo here
    }
}
