package com.pmdm.encuesta


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun EncuestaScreen(modifier: Modifier = Modifier) {
    var aceptaPromociones by remember { mutableStateOf(false) }
    var nivelSatisfaccion by remember { mutableStateOf(3f) }
    var turnoElegido by remember { mutableStateOf("Mañana") }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp) // Separa los elementos hijos automáticamente
    ) {
        Text(text = "Encuesta de Opinión", style =
            MaterialTheme.typography.headlineSmall)
        // 1. Switch
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = CenterVertically
        ) {
            Text("¿Desea recibir ofertas por correo?")
            Switch(
                checked = aceptaPromociones,
                onCheckedChange = { aceptaPromociones = it }
            )
        }
        Divider() // Línea divisoria visual
        // 2. Slider
        Text(text = "valora tu nivel de satisfacción (1 al 10):${nivelSatisfaccion.toInt()}")
        Slider(
            value = nivelSatisfaccion,
            onValueChange = { nivelSatisfaccion = it },
            valueRange = 1f..10f,
            steps = 8 // Divide la barra en puntos intermedios exactos
        )
        Divider()
        // 3. RadioButtons de turno
        Text(text = "Turno preferido de clases:")
        Row(verticalAlignment = CenterVertically) {
            RadioButton(
                selected = turnoElegido == "Mañana",
                onClick = { turnoElegido = "Mañana" }
            )
            Text(
                text = "Mañana",
                modifier = Modifier.clickable { turnoElegido = "Mañana" }
            )

            Spacer(modifier = Modifier.width(24.dp))

            RadioButton(
                selected = turnoElegido == "Tarde",
                onClick = { turnoElegido = "Tarde" }
            )
            Text("Tarde", modifier = Modifier.clickable { turnoElegido = "Tarde" })
        }
    }
}