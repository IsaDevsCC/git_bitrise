package com.keepcoding.androidsuperpoderes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.keepcoding.androidsuperpoderes.ui.theme.AndroidSuperpoderesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setContent()
        setContent {
            AndroidSuperpoderesTheme {
                // A surface container using the 'background' color from the theme
                ComposableExercise()
                /*BaseComposable {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        Greeting("Android", "Compose")
                    }
                }*/
            }
        }
    }
}

@Composable
fun ComposableExercise() {
    Box(
        modifier = Modifier
            .size(140.dp)
            .background(Color.Green)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Red)
                .align(Alignment.Center)
                .size(90.dp)
        ) {
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .size(15.dp)
                    .align(Alignment.TopStart)
            )
            Box(modifier = Modifier
                .background(Color.Blue)
                .size(25.dp)
                .align(Alignment.CenterEnd)
            )
        }
        Box(
            modifier = Modifier
                .background(Color.Gray)
                .height(120.dp)
                .width(30.dp)
                .align(Alignment.Center)
        )
        Box(
            modifier = Modifier
                .background(Color.Black)
                .size(40.dp)
                .align(Alignment.BottomStart)
        )
    }
}

@Preview
@Composable
fun TestComposableExercise() {
    ComposableExercise()
}