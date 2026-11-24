package com.example.examen_pdmd

// PASO 3 (vacía) y PASO 7 (rellenar), después de crear Elemento.kt.
// QUÉ: LazyColumn con item { título } e items(lista) { Card clickable }; el AlertDialog va FUERA de la LazyColumn.
// DATOS: cargarElementos() devuelve la lista (función normal, no @Composable). Los textos son R.string.lista_item_N.

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaLista(modifier: Modifier = Modifier, onNavigateTo: (String) -> Unit) {

    var mostrarDialogo by rememberSaveable { mutableStateOf(false) }
    var elegido by rememberSaveable { mutableStateOf(0) }


    val lista = cargarElementos()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)


    ) {
        item {
            Text(stringResource(R.string.lista_titulo))
        }
        items(lista) { elemento ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { mostrarDialogo = true; elegido = elemento.titulo }) {
                Text(stringResource(elemento.titulo), Modifier.padding(16.dp))
            }
        }
    }

    if (mostrarDialogo) {
        AlertDialog(
            onDismissRequest = { mostrarDialogo = false },
            title = { Text(stringResource(elegido)) },
            confirmButton = {
                TextButton(onClick = { mostrarDialogo = false })
                { Text(stringResource(R.string.lista_dialogo_cerrar)) }
            }
        )

    }

}

fun cargarElementos(): List<Elemento> {
    return listOf(
        Elemento(R.string.lista_item_1),
        Elemento(R.string.lista_item_2),
        Elemento(R.string.lista_item_3),
        Elemento(R.string.lista_item_4),
        Elemento(R.string.lista_item_5),
        Elemento(R.string.lista_item_6),
        Elemento(R.string.lista_item_7),
        Elemento(R.string.lista_item_8),
        Elemento(R.string.lista_item_9),
        Elemento(R.string.lista_item_10),
        Elemento(R.string.lista_item_11),
        Elemento(R.string.lista_item_12),
        Elemento(R.string.lista_item_13),
    )
}