package com.example.examen_preparacion_2

sealed class Rutas (val route : String ){

    object PantallaLogin : Rutas ("PantallaLogin")
    object PantallaZapatilla : Rutas ("PantallaZapatilla")
    object PantallaFormulario : Rutas ("PantallaFormulario")
    object PantallaLista : Rutas ("PantallaLista")

}