package com.pmdm.navegacion

    sealed class AppScreen(val route: String) {
        object Inicio : AppScreen("pantalla_inicio")
        object EjercicioA : AppScreen("ejercicio_a")

        object EjercicioB : AppScreen("ejercicio_b")

        object EjercicioC : AppScreen("ejercicio_c")
    }
