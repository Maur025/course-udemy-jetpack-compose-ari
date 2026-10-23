package com.maur025.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.maur025.myfirstcomposeapp.components.MyButtons
import com.maur025.myfirstcomposeapp.components.MyTextFieldParent
import com.maur025.myfirstcomposeapp.login.Greeting
import com.maur025.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyButtons(Modifier.padding(innerPadding))
                    // MyTextFieldParent(Modifier.padding(innerPadding))
                    // MyTexts(Modifier.padding(innerPadding))
                    // MyState(Modifier.padding(innerPadding))
                    // ConstraintChain(Modifier.padding(innerPadding))
                    // ConstraintBarrier(Modifier.padding(innerPadding))
                    // ConstraintExampleGuide(Modifier.padding(innerPadding))
                    // ExerciseTwo(Modifier.padding(innerPadding))
                    // MyBasicConstraintLayout(Modifier.padding(innerPadding))
                    // ExerciseOne(Modifier.padding(innerPadding))
                    // MyComplexLayout(Modifier.padding(innerPadding))
                    // MyRow(Modifier.padding(innerPadding))
                    // MyColumn(Modifier.padding(innerPadding))
                    // MyBox()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstComposeAppTheme {
        Greeting("Android")
    }
}