package com.pmdm.ejercicio_1_4_1_tarjeta

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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext // <-- IMPORTANTE: Añadido para el contexto
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmdm.ejercicio_1_4_1_tarjeta.ui.theme.Ejercicio_1_4_1_TarjetaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio_1_4_1_TarjetaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    pintaTarjeta(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun pintaTarjeta(modifier: Modifier = Modifier) {

    val contexto = LocalContext.current

    Box(
        modifier = modifier.fillMaxSize(), // Usamos el modifier que viene por parámetro
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(400.dp)
                .border(5.dp, Color.Gray)
                .padding(10.dp)
        ) {
            // Fila superior derecha (Círculos)
            Row(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(25))
                        .background(Color.LightGray)
                )
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(25))
                        .background(Color.Green)
                )
            }

            // Fila central (Imagen y textos)
            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterStart),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.oao),
                    contentDescription = "Icono OAO DEV",
                    modifier = Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text("Oscar Alvarez Oliveira")
                    Text("Java Developer")
                }
            }

            // Fila inferior (Botón)

            Button(
                onClick = {
                    Toast.makeText(contexto, "Pulsado", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(8.dp)
                    .width(150.dp)
                    .height(50.dp)
            ) {
                Text(
                    text = "Pulsar",
                    color = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun pintaTarjetaPreview() {
    Ejercicio_1_4_1_TarjetaTheme {
        pintaTarjeta()
    }
}


