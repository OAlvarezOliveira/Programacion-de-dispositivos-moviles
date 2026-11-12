package com.example.ejerciciom2pantallaconpiefijo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejerciciom2pantallaconpiefijo.ui.theme.EjercicioM2PantallaConPieFijoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioM2PantallaConPieFijoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Pie(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Pie(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.fillMaxSize().padding(horizontal = 12.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("título centrado", Modifier.padding(bottom = 8.dp))

        Text("Parrafo1: Erase que se era una manzana y una pera ", Modifier.weight(1f))
        Text("Parrafo2: que dorminan en el jardin dentro de un calcetin",Modifier.weight(1f))
        Text("Parrafo1: y soñaban con viajar en un frutero por el mar",Modifier.weight(1f))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement =Arrangement.SpaceBetween
        ){
            Button(onClick = {},
                ) {
                Text("Entrar")
            }
            Button(onClick = {},
            ) {
                Text("Salir")
            }
        }
    }




}

@Preview(showBackground = true)
@Composable
fun PiePreview() {
    EjercicioM2PantallaConPieFijoTheme {
        Pie()
    }
}