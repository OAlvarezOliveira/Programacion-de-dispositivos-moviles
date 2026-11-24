package com.example.examen_pdmd

// PASO 3 (vacía) y PASO 7 (rellenar).
// QUÉ: campo de texto, RadioButton (una sola variable String, selected = plan == "x"), Checkbox (Boolean),
// botón Enviar y AlertDialog dentro de if (mostrarDialogo). El diálogo va FUERA de cualquier Row.

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


@Composable
fun PantallaFormulario(modifier: Modifier = Modifier,onNavigateTo: (String) -> Unit) {
    var nombre by rememberSaveable { mutableStateOf("") }
    var plan by rememberSaveable { mutableStateOf("") }
    var terminos by rememberSaveable { mutableStateOf( false) }
    var mostrarDialogo by rememberSaveable { mutableStateOf(false) }


    Column(modifier = Modifier.background(colorResource(R.color.fondo_login)).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {


        Text(stringResource(R.string.formulario_titulo))

        OutlinedTextField(
            value = nombre,
            onValueChange = {nombre = it},
            label = {Text(stringResource(R.string.formulario_nombre))}
        )

        Text(stringResource(R.string.formulario_plan))

        Row(modifier= Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            RadioButton(
                selected = plan == "basico" ,
                onClick = {plan = "basico" }
            )
            Text(stringResource(R.string.formulario_plan_basico))

        }

        Row(modifier= Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)) {

            RadioButton(
                selected = plan == "premium",
                onClick = { plan = "premium" }
            )

            Text(stringResource(R.string.formulario_plan_premium))

        }

        Row(modifier= Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {

            Checkbox(
                checked = terminos,
                onCheckedChange = {terminos = it},
            )

            Text(stringResource(R.string.formulario_terminos))

        }
        Button(
            onClick = { mostrarDialogo = true }

        ) { Text(stringResource(R.string.formulario_enviar)) }

        if(mostrarDialogo){
            AlertDialog(
                onDismissRequest = { mostrarDialogo = false },
                title = { Text(stringResource(R.string.formulario_dialogo_titulo)) },
                confirmButton = { TextButton(onClick = { mostrarDialogo = false })
                { Text(stringResource(R.string.formulario_dialogo_cerrar)) } }
            )

        }

        Button(onClick = { onNavigateTo(Rutas.PantallaLista.route) }) {  Text(stringResource(R.string.formulario_boton_navegar))}}


    }

