package com.example.examen_pdmd

// PASO 4 · El archivo más importante: aquí se monta todo.
// QUÉ: rememberNavController + Scaffold (con BarraSuperior en topBar, PASO 8) + NavHost con un composable(...) por pantalla.
// OJO: NavHost con modifier.padding(innerPadding); cada composable(...) DENTRO de las llaves del NavHost.
// onNavigateTo = { ruta -> navController.navigate(ruta) } es la función genérica de navegación.

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavegacionApp(modifier: Modifier = Modifier) {
    var navController = rememberNavController()

    Scaffold(
        topBar = { BarraSuperior(onNavigateTo = { ruta -> navController.navigate(ruta) }) },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Rutas.PantallaLogin.route,
            modifier = modifier.padding(innerPadding)
        ) {
            composable(Rutas.PantallaLogin.route) {
                PantallaLogin(onNavigateTo = { ruta ->
                    navController.navigate(
                        ruta
                    )
                })
            }
            composable(Rutas.PantallaZapatilla.route) {
                PantallaZapatilla(onNavigateTo = { ruta ->
                    navController.navigate(
                        ruta
                    )
                })
            }
            composable(Rutas.PantallaFormulario.route) {
                PantallaFormulario(onNavigateTo = { ruta ->
                    navController.navigate(
                        ruta
                    )
                })
            }
            composable(Rutas.PantallaLista.route) {
                PantallaLista(onNavigateTo = { ruta ->
                    navController.navigate(
                        ruta
                    )
                })
            }
        }

    }

}