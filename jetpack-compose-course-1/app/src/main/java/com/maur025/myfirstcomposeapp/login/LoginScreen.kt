package com.maur025.myfirstcomposeapp.login

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(
//    widthDp = 45,
//    heightDp = 60,
//    showBackground = true,
//    showSystemUi = true,
//    device = Devices.PIXEL_4,
//    locale = "es",
    // apiLevel =
)
@Composable
fun ExamplePreview() {
    Example("jo jo jo")
}

@Composable
fun Example(a: String) {
    Text(
        text = "Mauro, un saludo $a", modifier = Modifier
//        .height(33.dp)
//        .width(50.dp)
            //.size(70.dp)
//            .fillMaxWidth()
//            .fillMaxHeight()
//            .fillMaxSize()
//            .padding(all = 30.dp)
            .padding(horizontal = 30.dp)
    )
}