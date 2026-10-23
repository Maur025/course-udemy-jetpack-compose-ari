package com.maur025.myfirstcomposeapp.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.maur025.myfirstcomposeapp.R

@Composable
fun MyImage() {/*Image(
        painter = painterResource(R.drawable.react_logo),
        contentDescription = "Avatar image profile",
        modifier = Modifier
            .height(200.dp)
            .width(30.dp),
        contentScale = ContentScale.Inside
    )*/

    Image(
        painter = painterResource(R.drawable.react_logo),
        contentDescription = "Avatar image profile",
        modifier = Modifier
            .size(300.dp)
            .clip(
                //RoundedCornerShape(50)
                CircleShape
            )
            //.border(width = 5.dp, color = Color.Red, shape = CircleShape)
            .border(
                width = 5.dp, shape = CircleShape, brush = Brush.linearGradient(
                    colors = listOf(
                        Color.Red, Color.Blue, Color.Yellow
                    )
                )
            ),
        contentScale = ContentScale.FillBounds
    )
}

@Composable
fun MyIcon() {
    Icon(
        painter = painterResource(R.drawable.ic_personita),
        contentDescription = null,
        modifier = Modifier.size(300.dp),
        tint = Color.Blue
    )
}

@Composable
fun MyNetworkImage() {
    AsyncImage(
        model = "https://mir-s3-cdn-cf.behance.net/project_modules/1400_webp/fecece74182713.5c254609b1588.png",
        contentDescription = "Image from network",
        modifier = Modifier.size(250.dp),
        onError = {
            Log.i("Image", "Ha ocurrido un error ${it.result.throwable.message}")
        })
}