package com.example.posicionamiento

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.posicionamiento.ui.theme.PosicionamientoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PosicionamientoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Posiciones(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Posiciones(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxHeight().width(200.dp).border(2.dp,color=Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text("COLUMN")

        Row(
            modifier = Modifier.fillMaxWidth().height(100.dp).border(2.dp,color=Color.Gray),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom


        ) {
            Text("ROW1")
            Text("ROW2")
            Text("ROW3")
            Text("ROW4")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PosicionamientoTheme {
        Posiciones()
    }
}