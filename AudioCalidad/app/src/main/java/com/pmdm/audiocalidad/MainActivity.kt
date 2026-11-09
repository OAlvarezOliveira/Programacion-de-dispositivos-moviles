package com.pmdm.audiocalidad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmdm.audiocalidad.ui.theme.AudioCalidadTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AudioCalidadTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    panel(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun panel(modifier: Modifier = Modifier) {

    var opcionSeleccionada by remember { mutableStateOf(480) }
    var  volumen by remember { mutableStateOf(50) }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Calidad de Reproduccion")
        // Opción 1
        Row(verticalAlignment = Alignment.CenterVertically) {

            RadioButton(
                selected = (opcionSeleccionada == 480),
                onClick = { opcionSeleccionada = 480}
            )
            Text(text = "BAJA - 480p", modifier = Modifier.clickable {
                opcionSeleccionada = 480 })

        }

        // Opción 2
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = (opcionSeleccionada == 1080),
                onClick = { opcionSeleccionada = 1080 }
            )
            Text(text = "Media - 1080p", modifier = Modifier.clickable {
                opcionSeleccionada = 1080 })

        }

        // Opción 3
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = (opcionSeleccionada == 3840),
                onClick = { opcionSeleccionada = 3840 }
            )
            Text(text = "Alta - 4k UHD", modifier = Modifier.clickable {
                opcionSeleccionada = 3840  })

        }
        Divider()
        // 2. Slider

        Text(text = "Volumen Predeterminado (%):${volumen}")
        Slider(
            value = volumen.toFloat(),
            onValueChange = { volumen = it.toInt() },
            valueRange = 1f..100f,
            steps = 100
        )

    }
}

@Preview(showBackground = true)
@Composable
fun panelPreview() {
    AudioCalidadTheme {
        panel()
    }
}