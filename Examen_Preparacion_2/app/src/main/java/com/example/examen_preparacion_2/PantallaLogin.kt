package com.example.examen_preparacion_2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PantallaLogin(modifier: Modifier = Modifier, onNavigateTo: (String) -> Unit) {


    Column(modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource(R.string.pantallaLogin_Titulo), fontSize = 32.sp, fontWeight = FontWeight.Bold)

        var usuario by rememberSaveable() { mutableStateOf("") }
        var password by rememberSaveable() { mutableStateOf("") }


        OutlinedTextField(value = usuario,
            onValueChange = { usuario = it},
            label= {Text(stringResource(R.string.pantallaLogin_TextField_usuario))}
        )
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(value = password,
            onValueChange = { password = it},
            visualTransformation = PasswordVisualTransformation(),
            label= {Text(stringResource(R.string.pantallaLogin_TextField_password),fontSize = 18.sp, fontWeight = FontWeight.Light)}
        )
        Spacer(Modifier.height(16.dp))

        Button(onClick = {
            onNavigateTo(Rutas.PantallaZapatilla.route)
        }) {
            Text(stringResource(R.string.pantallaLogin_navegar))
        }

    }

}
@Composable
@Preview(showBackground = true)
fun PantallaLoginPreview(){

    PantallaLogin(onNavigateTo = {})
}