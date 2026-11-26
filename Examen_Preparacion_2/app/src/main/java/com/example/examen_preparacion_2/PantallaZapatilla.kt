package com.example.examen_preparacion_2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder

import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PantallaZapatilla(modifier: Modifier = Modifier, onNavigateTo: (String) -> Unit) {
    var favorito by rememberSaveable { mutableStateOf(false) }

    Column(modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource(R.string.pantallaZapatilla_titulo), fontSize = 32.sp, fontWeight = FontWeight.Bold)

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .clip(RoundedCornerShape(15.dp))
        ) {
            Image(
                painter = painterResource(R.drawable.zapatilla),
                contentDescription = stringResource(R.string.pantallaZapatilla_zapatilla_descripcion),
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )                       // cierra Image
            IconButton(
                onClick = { favorito = !favorito },
                modifier = Modifier.align(Alignment.BottomEnd).padding(12.dp)
            ) {
                Icon(
                    imageVector = if (favorito) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                    contentDescription = stringResource(R.string.pantallaZapatilla_zapatilla_favorito),
                    tint = colorResource(if (favorito) R.color.purple_700 else R.color.black)                )                   // cierra Icon
            }                       // cierra IconButton
        }                           // cierra Box


        Button(onClick = {
            onNavigateTo(Rutas.PantallaFormulario.route)
        }) {
            Text(stringResource(R.string.pantallaZapatilla_navegar))
        }
    }



}

@Composable
@Preview(showBackground = true)
fun PantallaZapatillaPreview(){

    PantallaZapatilla(onNavigateTo = {})
}