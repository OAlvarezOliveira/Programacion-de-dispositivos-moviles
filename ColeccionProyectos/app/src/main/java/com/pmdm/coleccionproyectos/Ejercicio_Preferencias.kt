package com.pmdm.coleccionproyectos

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun Ejercicio_Preferencias(onBack: () -> Unit,modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Preferencias de Notificación",
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Switch 1
        var aceptaPush by remember { mutableStateOf(true) }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Notificaciones Push")
            Switch(
                checked = aceptaPush,
                onCheckedChange = { aceptaPush = it }
            )
        }

        // Switch 2
        var avisosMail by remember { mutableStateOf(false) }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Avisos por correo electrónico")
            Switch(
                checked = avisosMail,
                onCheckedChange = { avisosMail = it }
            )
        }

        HorizontalDivider() // Línea divisoria visual

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            var estaMarcado by remember { mutableStateOf(true) }
            Checkbox(
                checked = estaMarcado,
                onCheckedChange = { nuevoEstado ->
                    estaMarcado = nuevoEstado
                }
            )
            Text(text = "Modo silencioso durante las 24 horas")
        }

        Button(
            onClick = { },
            modifier = Modifier
                .height(45.dp)
                .fillMaxWidth()
                .border(
                    width = 3.dp,
                    color = Color.Blue,
                    shape = RoundedCornerShape(16.dp)
                )
        ) {
            Text(fontSize = 20.sp,text = "Guardar cambios", color = Color.White)
        }
    }
}

