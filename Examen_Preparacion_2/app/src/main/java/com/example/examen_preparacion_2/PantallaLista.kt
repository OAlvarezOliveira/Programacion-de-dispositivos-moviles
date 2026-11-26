package com.example.examen_preparacion_2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PantallaLista(modifier: Modifier = Modifier, onNavigateTo: (String) -> Unit) {

    LazyColumn(
        modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(stringResource(R.string.pantallaLista_titulo), fontSize = 32.sp, fontWeight = FontWeight.Bold)
        }                                   // cierra item (cabecera)

        items(productos) { producto ->
            Card(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        stringResource(producto.nombre),
                        modifier = Modifier.weight(1f),
                        fontSize = 18.sp
                    )
                    Text("${producto.precio} €", fontWeight = FontWeight.Bold)
                }                           // cierra Row
            }                               // cierra Card
        }                                   // cierra items

        item {
            Button(onClick = {
                onNavigateTo(Rutas.PantallaLogin.route)
            }) {
                Text(stringResource(R.string.pantallaLista_navegar))
            }
        }                                   // cierra item (botón)
    }                                       // cierra LazyColumn
}

@Composable
@Preview(showBackground = true)
fun PantallaListaPreview(){

    PantallaLista(onNavigateTo = {})
}
