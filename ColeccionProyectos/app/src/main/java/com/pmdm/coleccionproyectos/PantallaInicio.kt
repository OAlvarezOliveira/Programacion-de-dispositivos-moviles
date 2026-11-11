package com.pmdm.coleccionproyectos


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
            // Botón que ejecuta la lambda para navegar al Ejercicio_Alineaciones
            Button(onClick = { onNavigateTo(ListaProyectos.Ejercicio_Alineaciones.route) }) {
                Text("Ir al Ejercicio_Alineaciones")
            }

            Spacer(modifier = Modifier.height(16.dp))
            // Botón que ejecuta la lambda para navegar al Ejercicio_Audio
            Button(onClick = { onNavigateTo(ListaProyectos.Ejercicio_Audio.route) }) {
                Text("Ir al  Ejercicio_Audio")
            }

            Spacer(modifier = Modifier.height(16.dp))
            // Botón que ejecuta la lambda para navegar al Ejercicio_Bandera
            Button(onClick = { onNavigateTo(ListaProyectos.Ejercicio_Bandera.route) }) {
                Text("Ir al Ejercicio_Bandera")
            }
            Spacer(modifier = Modifier.height(16.dp))
            // Botón que ejecuta la lambda para navegar al Ejercicio_Calculadora
            Button(onClick = { onNavigateTo(ListaProyectos.Ejercicio_Calculadora.route) }) {
                Text("Ir al Ejercicio_Calculadora")
            }

            Spacer(modifier = Modifier.height(16.dp))
            // Botón que ejecuta la lambda para navegar al Ejercicio_Encuesta
            Button(onClick = { onNavigateTo(ListaProyectos.Ejercicio_Encuesta.route) }) {
                Text("Ir al Ejercicio_Encuesta")
            }

            Spacer(modifier = Modifier.height(16.dp))
            // Botón que ejecuta la lambda para navegar al Ejercicio_HTML5
            Button(onClick = { onNavigateTo(ListaProyectos.Ejercicio_HTML5.route) }) {
                Text("Ir al Ejercicio_HTML5")
            }

            Spacer(modifier = Modifier.height(16.dp))
            // Botón que ejecuta la lambda para navegar al Ejercicio_Login
            Button(onClick = { onNavigateTo(ListaProyectos.Ejercicio_Login.route) }) {
                Text("Ir al Ejercicio_Login")
            }

            Spacer(modifier = Modifier.height(16.dp))
            // Botón que ejecuta la lambda para navegar al Ejercicio_Mondrain
            Button(onClick = { onNavigateTo(ListaProyectos.Ejercicio_Mondrain.route) }) {
                Text("Ir al Ejercicio_Mondrain")
            }

            Spacer(modifier = Modifier.height(16.dp))
            // Botón que ejecuta la lambda para navegar al Ejercicio_Preferencias
            Button(onClick = { onNavigateTo(ListaProyectos.Ejercicio_Preferencias.route) }) {
                Text("Ir al Ejercicio_Preferencias")
            }

            Spacer(modifier = Modifier.height(16.dp))
            // Botón que ejecuta la lambda para navegar al Ejercicio_Tarjeta
            Button(onClick = { onNavigateTo(ListaProyectos.Ejercicio_Tarjeta.route) }) {
                Text("Ir al Ejercicio_Tarjeta")
            }


        }
    }
}
