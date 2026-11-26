package com.example.examen_preparacion_2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaFormulario(modifier: Modifier = Modifier, onNavigateTo: (String) -> Unit) {

    var nombre by rememberSaveable { mutableStateOf("") }
    var acepto by rememberSaveable { mutableStateOf(false) }
    var talla by rememberSaveable { mutableStateOf("") }
    var mostrar by rememberSaveable { mutableStateOf(false) }


    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(R.string.pantallaFormulario_titulo),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text(stringResource(R.string.pantallaFormulario_TextField_nombre)) }
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val talla41 = stringResource(R.string.pantallaFormulario_talla_41)
            val talla42 = stringResource(R.string.pantallaFormulario_talla_42)
            val talla43 = stringResource(R.string.pantallaFormulario_talla_43)

            RadioButton(
                selected = talla == talla41,
                onClick = { talla = talla41 }
            )
            Text(talla41)
            RadioButton(
                selected = talla == talla42,
                onClick = { talla = talla42 }
            )
            Text(talla42)
            RadioButton(
                selected = talla == talla43,
                onClick = { talla = talla43 }
            )
            Text(talla43)
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Checkbox(
                checked = acepto,
                onCheckedChange = { acepto = it },

                )
            Text(
                if (acepto) (stringResource(R.string.pantallaFormulario_acepto)) else (stringResource(
                    R.string.pantallaFormulario_NOacepto
                ))
            )

        }

        Button(onClick = {
            onNavigateTo(Rutas.PantallaLista.route)
        }) {
            Text(stringResource(R.string.pantallaFormulario_navegar))
        }

        Button(onClick = { mostrar = true }) {
            Text(stringResource(R.string.pantallaFormulario_enviar))
        }

        if (mostrar) {
            AlertDialog(
                onDismissRequest = { mostrar = false },
                confirmButton = {
                    TextButton(onClick = {
                        mostrar = false
                    }) { Text(stringResource(R.string.pantallaFormulario_cerrar)) }
                },
                title = { Text(stringResource(R.string.pantallaFormulario_Alerta)) },
                        text = {
                    Column {
                        Text(nombre)
                        Text(talla)
                    }
                }
            )
        }
    }
}


@Composable
@Preview(showBackground = true)
fun PantallaFormularioPreview() {

    PantallaFormulario(onNavigateTo = {})
}

