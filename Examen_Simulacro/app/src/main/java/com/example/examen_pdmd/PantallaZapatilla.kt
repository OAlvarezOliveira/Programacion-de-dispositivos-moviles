package com.example.examen_pdmd

// PASO 3 (vacía) y PASO 7 (rellenar).
// QUÉ: Box con la imagen (ContentScale.Crop, clip redondeado, 250.dp) y un Icon encima con align(BottomEnd).
// RECURSOS: imagen en res/drawable (minúsculas, sin espacios). El Box se cierra DESPUÉS del Icon.

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


@Composable
fun PantallaZapatilla(modifier: Modifier = Modifier,onNavigateTo: (String) -> Unit) {




    Column(modifier = Modifier.background(colorResource(R.color.fondo_login)).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(stringResource(R.string.zapatilla_titulo))
        Box(
            modifier = Modifier.fillMaxWidth().height(250.dp).clip(RoundedCornerShape(15.dp))
        ) {

            Image(
                painter = painterResource(R.drawable.zapatilla),
                contentDescription = stringResource(R.string.zapatilla_descripcion),
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = stringResource(R.string.zapatilla_favorito),
            modifier = Modifier.align(Alignment.BottomEnd).padding(12.dp)
            )

        }

        Button(onClick = { onNavigateTo(Rutas.PantallaFormulario.route) }) {  Text(stringResource(R.string.zapatilla_siguiente))}}

}
