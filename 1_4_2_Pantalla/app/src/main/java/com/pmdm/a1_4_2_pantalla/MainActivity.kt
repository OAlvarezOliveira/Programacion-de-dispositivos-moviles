package com.pmdm.a1_4_2_pantalla

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmdm.a1_4_2_pantalla.ui.theme._1_4_2_PantallaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _1_4_2_PantallaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PintaPantalla(
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}

@Composable
fun PintaPantalla(
    modifier: Modifier = Modifier
) {
    val contexto = LocalContext.current
    Column(
        modifier = modifier
            .fillMaxSize()
            .border(width = 2.dp, color = Color.Black),

    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(3f)
                .background(Color.Green),
                contentAlignment = Alignment.Center
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.LoreIpsum),
                    contentDescription = "Lore Ipsum",
                    modifier = Modifier.size(120.dp)
                )

                Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit. ")

            }

        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(3f)
                .background(Color.Yellow)
                .padding(16.dp),
                contentAlignment = Alignment.Center
        ) {
            Text("consectume dolor sit ametPellentesque sodales quam non vulputate porttitor, ligula lectus condimentum mauris, id porttitor tellus arcu at du")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Red),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
        ) {

            Button(
                onClick = {
                    Toast.makeText(contexto, "Pulsado1", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier
                    .padding(8.dp)
                    .width(150.dp)
                    .height(50.dp)
            ) {
                Text(
                    text = "Boton1",
                    color = Color.White
                )
            }

            Button(
                onClick = {
                    Toast.makeText(contexto, "Pulsado2", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier
                    .padding(8.dp)
                    .width(150.dp)
                    .height(50.dp)
            ) {
                Text(
                    text = "Boton2",
                    color = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PintaPantallaPreview() {
    _1_4_2_PantallaTheme {
        PintaPantalla()
    }
}