package com.pmdm.coleccionproyectos

sealed class ListaProyectos(val route: String) {

    object Inicio : ListaProyectos("ListaProyectos")

    object Ejercicio_Alineaciones : ListaProyectos("Ejercicio_Alineaciones")

    object Ejercicio_Audio : ListaProyectos("Ejercicio_Audio")

    object Ejercicio_Bandera : ListaProyectos("Ejercicio_Bandera")

    object Ejercicio_Calculadora : ListaProyectos("Ejercicio_Calculadora")

    object Ejercicio_Encuesta : ListaProyectos("Ejercicio_Encuesta")

    object Ejercicio_HTML5 : ListaProyectos("Ejercicio_HTML5")

    object Ejercicio_Login : ListaProyectos("Ejercicio_Login")

    object Ejercicio_Mondrain : ListaProyectos("Ejercicio_Mondrain")

    object Ejercicio_Preferencias : ListaProyectos("Ejercicio_Preferencias")

    object Ejercicio_Tarjeta : ListaProyectos("Ejercicio_Tarjeta")

    object Ejercicio_Perfil : ListaProyectos("Ejercicio_Perfil")
}
