package com.example.ejercicio_142

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicio_142.ui.theme.Ejercicio_142Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio_142Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PintaPantalla(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun PintaPantalla( modifier: Modifier = Modifier) {

    Column(modifier = modifier
        .fillMaxSize()) {

        Column(modifier = Modifier
            .fillMaxWidth()
            .weight(3f)
            .background(color = Color.Green),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Image(
                painter = painterResource(id = R.drawable.loreipsum),
                contentDescription = "Imagen Lore Ipsum",
                modifier = Modifier.size(150.dp))
            Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                    "Cras suscipit volutpat sem a luctus." ,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 12.dp),
                textAlign = TextAlign.Center)

        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(3f)
            .background(color = Color.Yellow),
            verticalAlignment =Alignment.CenterVertically
        ) {
            Text("Morbi ac dolor cursus tellus vehicula mollis at tristique eros. " +
                    "Aenean consectetur malesuada nunc ac vehicula. " +
                    "Curabitur ornare ex et mi iaculis faucibus. Sed et efficitur lorem. " +
                    "Mauris dictum commodo odio eu egestas. Integer rutrum arcu mattis neque tincidunt, " +
                    "non porttitor dolor lobortis. " +
                    "Maecenas bibendum massa quis sem mollis, ac dictum mauris placerat."
                ,modifier = Modifier.padding(horizontal = 20.dp, vertical = 25.dp),
                textAlign = TextAlign.Center)
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(color = Color.Red)
            .padding(horizontal = 20.dp),
            verticalAlignment =Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Button(
                onClick = { /* Acción de entrar */ },
                modifier = Modifier
                    .width(120.dp)
                    .height(50.dp)
            ) {
                Text("Entrar")
            }
            Button(
                onClick = { /* Acción de salir */ },
                modifier = Modifier
                    .width(120.dp)
                    .height(50.dp)

            ) {
                Text("Salir")
            }

        }

    }

}

@Preview(showBackground = true)
@Composable
fun PintaPantallaPreview() {
    Ejercicio_142Theme {
        PintaPantalla()
    }
}