package com.pmdm.navegacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pmdm.navegacion.ui.theme.NavegacionTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavegacionTheme() {
                NavegacionApp()
            }
        }
    }
}
@Composable
fun NavegacionApp() {
    // 1. Creamos el GPS de navegación
    var navController = rememberNavController()
    // 2. Montamos el mapa de rutas (NavHost)
    NavHost(
        navController = navController,
        startDestination = AppScreen.Inicio.route
    ) {
        // Ruta 1: Pantalla de Inicio (Índice)
        composable(AppScreen.Inicio.route) {
            PantallaInicio(onNavigateTo = {ruta -> navController.navigate(ruta)})
        }
        // Ruta 2: Pantalla del Ejercicio A
        composable(AppScreen.EjercicioA.route) {
            PantallaEjercicioA(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}