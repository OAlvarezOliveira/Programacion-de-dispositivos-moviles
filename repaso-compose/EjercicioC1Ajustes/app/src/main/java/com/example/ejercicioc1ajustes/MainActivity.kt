package com.example.ejercicioc1ajustes

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
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicioc1ajustes.ui.theme.EjercicioC1AjustesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioC1AjustesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Ajustes(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Ajustes(modifier: Modifier = Modifier) {
    var activo by rememberSaveable { mutableStateOf(false) }
    var recordar by rememberSaveable { mutableStateOf(false) }
    var idioma by rememberSaveable { mutableStateOf("Castellano") }
    var nivelVolumen by rememberSaveable { mutableFloatStateOf(0f) }
    Column(
        modifier = modifier.fillMaxWidth().padding(horizontal = 22.dp)

    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text("modo oscuro")
            Switch(
                checked = activo,
                onCheckedChange = { activo = it })

        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text("Recordarme")
            Checkbox(
                checked = recordar,
                onCheckedChange = { recordar = it })

        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            RadioButton(
                selected = idioma == "Castellano",
                onClick = { idioma = "Castellano" })
            Text("Castellano")


            RadioButton(
                selected = idioma == "Galego",
                onClick = { idioma = "Galego" })
            Text("Galego")
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Slider(
                value = nivelVolumen,
                onValueChange = { nivelVolumen = it },
                valueRange = 0f..100f,
            )
        }
        Text("Oscuro: ${if (activo) "sí" else "no"} · Idioma: $idioma · Volumen: ${nivelVolumen.toInt()}")

    }
}

@Preview(showBackground = true)
@Composable
fun AjustesPreview() {
    EjercicioC1AjustesTheme {
        Ajustes()
    }
}