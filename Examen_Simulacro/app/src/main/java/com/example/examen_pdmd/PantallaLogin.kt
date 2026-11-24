package com.example.examen_pdmd

// PASO 3 (vacía: solo Text) y PASO 7 (rellenar).
// QUÉ: dos OutlinedTextField (usuario y contraseña con PasswordVisualTransformation) y un Button que navega.
// ESTADO: una variable por campo con rememberSaveable. Textos y color: stringResource / colorResource.

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation

@Composable
fun PantallaLogin(modifier: Modifier = Modifier,onNavigateTo: (String) -> Unit) {
    var usuario by rememberSaveable { mutableStateOf("") }
    var contrasenha by rememberSaveable { mutableStateOf("") }


    Column(modifier = Modifier.background(colorResource(R.color.fondo_login)).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(stringResource(R.string.login_titulo))
        OutlinedTextField(
            value = usuario,
            onValueChange = {usuario = it},
            label = {Text(stringResource(R.string.login_usuario))}
        )
        OutlinedTextField(
            value = contrasenha,
            onValueChange = {contrasenha = it},
            label = {Text(stringResource(R.string.login_password))},
            visualTransformation = PasswordVisualTransformation()
        )

        Button(onClick = { onNavigateTo(Rutas.PantallaZapatilla.route) }) {  Text(stringResource(R.string.login_entrar))}}
}
