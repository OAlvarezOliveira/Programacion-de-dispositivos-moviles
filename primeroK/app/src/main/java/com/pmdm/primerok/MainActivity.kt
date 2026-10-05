package com.pmdm.primerok

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pmdm.primerok.ui.theme.PrimeroKTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimeroKTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    EjemploContenedores(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
fun EjemploContenedores(
    modifier: Modifier = Modifier,
    text1: String = "Fila 1",
    text2: String = "Fila 2",
    text3: String = "Izquierda | ",
    text4: String = "Derecha"
) {
    Column(modifier = modifier) { // Se pasa el modifier recibido a la Column principal
        Text(text1)
        Text(text2)

        Row { // Dentro de la columna, abrimos una fila (de izquierda a derecha)
            Text(text3)
            Text(text4)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun EjemploContenedoresPreview() {
    PrimeroKTheme {
        EjemploContenedores()
    }
}
