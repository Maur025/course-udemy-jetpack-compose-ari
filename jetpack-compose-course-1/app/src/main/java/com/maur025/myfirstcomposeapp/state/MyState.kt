package com.maur025.myfirstcomposeapp.state

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyState(modifier: Modifier) {
    // var number: String = "0" -> Mal
    // val number = remember { mutableStateOf("0") } -> loss in rotation screen
    var number by rememberSaveable { mutableIntStateOf(0) }

    Column(modifier = modifier) {
        /*Text("Pulsame: $number", modifier = modifier.clickable { number += 1 })
        Text("Pulsame", modifier = modifier.clickable { number += 1 })
        Text("Pulsame: $number", modifier = modifier.clickable { number += 1 })
        Text("Pulsame: $number", modifier = modifier.clickable { number += 1 })*/

        StateExampl1(number) { number += 1 }
        StateExampl2(number, onClick = { number += 1 })
    }
}

@Composable
fun StateExampl1(number: Int, onClick: () -> Unit) {
    Text("Pulsame: $number", modifier = Modifier.clickable { onClick() })
}

@Composable
fun StateExampl2(number: Int, onClick: () -> Unit) {
    Text("Pulsame: $number", modifier = Modifier.clickable { onClick() })
}