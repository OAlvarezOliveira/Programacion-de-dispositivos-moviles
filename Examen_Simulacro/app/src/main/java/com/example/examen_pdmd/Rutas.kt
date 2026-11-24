package com.example.examen_pdmd

// PASO 2 · Crear este archivo (File, no Class) justo después de añadir la dependencia.
// QUÉ: una sealed class con un object por pantalla. El texto entre comillas es el nombre de la ruta.
// SI FALTA UNA PANTALLA: añadir aquí su object Y su composable(...) en NavegacionApp.kt.

sealed class Rutas(val route: String) {
    object PantallaLogin : Rutas(route = "PantallaLogin")
    object PantallaZapatilla : Rutas("PantallaZapatilla")
    object PantallaFormulario : Rutas("PantallaFormulario")
    object PantallaLista : Rutas("PantallaLista")

}