package com.example.ajustesresumen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ajustesresumen.ui.theme.AjustesResumenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AjustesResumenTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AjustesResumen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun AjustesResumen(modifier: Modifier = Modifier) {
    var oscuro by rememberSaveable { mutableStateOf(false) }
    var idioma by rememberSaveable { mutableStateOf("Castellano") }
    var volumen by rememberSaveable { mutableStateOf(40f) }
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .border(width = 2.dp, color = Color.Gray, shape = RoundedCornerShape(4.dp))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Ajustes")

        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text("Modo oscuro")
            Switch(checked = oscuro, onCheckedChange = { oscuro = it })
        }
        Row(Modifier
            .fillMaxWidth()
            .clickable { idioma = "Castellano" },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start)
        {
            RadioButton(
                selected = (idioma == "Castellano"),
                onClick = { idioma = "Castellano" }
            )
            Text("Castellano")
        }
        Row(Modifier
            .fillMaxWidth()
            .clickable { idioma = "Galego" },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start) {

            RadioButton(
                selected = (idioma == "Galego"),
                onClick = { idioma = "Galego" }
            )
            Text("Galego")
        }

        Slider(
            value = volumen,
            onValueChange = { volumen = it },
            valueRange = 0f..100f,
            modifier = Modifier.fillMaxWidth()
        )
        Text("Oscuro: ${if (oscuro) "sí" else "no"} · Idioma: $idioma · Volumen: ${volumen.toInt()}",modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)
    }
}

@Preview(showBackground = true)
@Composable
fun AjustesResumenPreview() {
    AjustesResumenTheme {
        AjustesResumen()
    }
}