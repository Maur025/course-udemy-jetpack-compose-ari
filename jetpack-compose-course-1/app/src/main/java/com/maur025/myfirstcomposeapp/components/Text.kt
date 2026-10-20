package com.maur025.myfirstcomposeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

@Composable
fun MyTexts(modifier: Modifier) {
    Column(modifier = modifier) {

        Text(text = "Pepe")
        Text(text = "Pepe rojo", color = Color.Red)
        Text(text = "Pepe", fontSize = 25.sp)
        Text(text = "FontStyle", fontStyle = FontStyle.Italic)
        Text(
            text = "FontWeight",
            fontWeight = FontWeight.ExtraBold,
            fontStyle = FontStyle.Italic,
            fontSize = 25.sp
        )

        Text("LetterSpacing", letterSpacing = 20.sp)
        Text(
            "textDecoration",
            textDecoration = TextDecoration.Underline,
            color = Color.Blue,
            modifier = Modifier.clickable {})
        Text(
            "textDecoration", textDecoration = TextDecoration.Underline + TextDecoration.LineThrough
        )

        Text(
            "Aling, Aling, Aling, Aling, Aling, Aling, Aling, Aling, Aling, Aling, Aling, Aling, Aling",
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red),
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}
