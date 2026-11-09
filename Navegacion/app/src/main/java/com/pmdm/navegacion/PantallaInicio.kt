package com.pmdm.navegacion

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaInicio(onNavigateTo: (String) -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Ejercicio de navegación") }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Selecciona un ejercicio:",
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(16.dp))
            // Botón que ejecuta la lambda para navegar al Ejercicio A
            Button(onClick = { onNavigateTo(AppScreen.EjercicioA.route) }) {
                Text("Ir al Ejercicio A ")
            }

            Spacer(modifier = Modifier.height(16.dp))
            // Botón que ejecuta la lambda para navegar al Ejercicio B
            Button(onClick = { onNavigateTo(AppScreen.EjercicioB.route) }) {
                Text("Ir al Ejercicio B")
            }

            Spacer(modifier = Modifier.height(16.dp))
            // Botón que ejecuta la lambda para navegar al Ejercicio B
            Button(onClick = { onNavigateTo(AppScreen.EjercicioC.route) }) {
                Text("Ir al Ejercicio C")
            }

        }
    }
}
