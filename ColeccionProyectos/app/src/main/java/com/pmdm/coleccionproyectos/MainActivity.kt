package com.pmdm.coleccionproyectos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pmdm.coleccionproyectos.ui.theme.ColeccionProyectosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColeccionProyectosTheme() {
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
        startDestination = ListaProyectos.Inicio.route
    ) {
        // Ruta 1: Pantalla de Inicio (Índice)
        composable(ListaProyectos.Inicio.route) {
            PantallaInicio(onNavigateTo = {ruta -> navController.navigate(ruta)})
        }
        // Ruta 2: Pantalla del Ejercicio_Alineaciones
        composable(ListaProyectos.Ejercicio_Alineaciones.route) {
            Ejercicio_Alineaciones(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
        // Ruta 2: Pantalla del Ejercicio_Audio
        composable(ListaProyectos.Ejercicio_Audio.route) {
            Ejercicio_Audio(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
        // Ruta 2: Pantalla del Ejercicio_Bandera
        composable(ListaProyectos.Ejercicio_Bandera.route) {
            Ejercicio_Bandera(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
        // Ruta 2: Pantalla del Ejercicio_Calculadora
        composable(ListaProyectos.Ejercicio_Calculadora.route) {
            Ejercicio_Calculadora(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
        // Ruta 2: Pantalla del Ejercicio_Encuesta
        composable(ListaProyectos.Ejercicio_Encuesta.route) {
            Ejercicio_Encuesta(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
        // Ruta 2: Pantalla del Ejercicio_HTML5
        composable(ListaProyectos.Ejercicio_HTML5.route) {
            Ejercicio_HTML5(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
        // Ruta 2: Pantalla del Ejercicio A
        composable(ListaProyectos.Ejercicio_Login.route) {
            Ejercicio_Login(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
        // Ruta 2: Pantalla del Ejercicio A
        composable(ListaProyectos.Ejercicio_Mondraid.route) {
            Ejercicio_Mondraid(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
        // Ruta 2: Pantalla del Ejercicio A
        composable(ListaProyectos.Ejercicio_Preferencias.route) {
            Ejercicio_Preferencias(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
        // Ruta 2: Pantalla del Ejercicio A
        composable(ListaProyectos.Ejercicio_Tarjeta.route) {
            Ejercicio_Tarjeta(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}



