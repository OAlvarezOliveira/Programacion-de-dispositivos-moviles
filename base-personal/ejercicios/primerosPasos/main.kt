package com.example.myapplication

import kotlin.random.Random

fun main() {
    val numeroSecreto = Random.nextInt(1, 11)
    var adivinado = false
    var intentos = 0
    val maxIntentos = 3 // Definimos el límite de vidas (intentos < 4)

    println("¡Bienvenido al juego de adivinanzas!")
    println("He pensado un número entre el 1 y el 10. ¡Tienes solo $maxIntentos intentos!")

    // El juego sigue MIENTRAS no se adivine Y los intentos sean menores que 3
    while (!adivinado && intentos < maxIntentos) {
        print("\n[Intento ${intentos + 1}/$maxIntentos] Introduce tu número: ")
        val entradaUsuario = readlnOrNull()?.toIntOrNull()

        if (entradaUsuario == null) {
            println("Por favor, introduce un número válido.")
            continue
        }

        intentos++ // Sumamos el intento válido

        when {
            entradaUsuario == numeroSecreto -> {
                println("¡Felicidades! Has acertado. El número era el $numeroSecreto.")
                println("Lo lograste en $intentos intentos.")
                adivinado = true
            }
            entradaUsuario < numeroSecreto -> println("Demasiado bajo.")
            else -> println("Demasiado alto.")
        }
    }

    // COMPROBACIÓN FUERA DEL WHILE:
    // Si el bucle terminó pero 'adivinado' sigue siendo falso, el jugador perdió
    if (!adivinado) {
        println("\n¡Game Over! Te has quedado sin intentos.")
        println("El número secreto era el $numeroSecreto. ¡Suerte la próxima vez!")
    }
}


