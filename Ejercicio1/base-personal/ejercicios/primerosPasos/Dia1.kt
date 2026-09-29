package primerosPasos// Día 1 — Hello World, variables, tipos básicos (Kotlin Koans: introduction)
import kotlin.random.Random

fun main() {
    // 1. El programa elige un número secreto entre 1 y 10
    val numeroSecreto = Random.nextInt(1, 11)
    var adivinado = false
    var intentos = 0

    println("¡Bienvenido al juego de adivinanzas!")
    println("He pensado un número entre el 1 y el 10. ¿Puedes adivinarlo?")

    // 2. Este bucle se repetirá MIENTRAS 'adivinado' sea falso
    while (!adivinado) {
        print("Introduce tu número: ")

        // Lee lo que escribes en la consola y lo convierte a número entero
        val entradaUsuario = readlnOrNull()?.toIntOrNull()

        // Validamos que el usuario haya ingresado un número real
        if (entradaUsuario == null) {
            println("Por favor, introduce un número válido.")
            continue // Salta al siguiente turno del bucle
        }

        intentos++ // Sumamos un intento

        // 3. Comparamos el número del usuario con el número secreto
        when {
            entradaUsuario == numeroSecreto -> {
                println("¡Felicidades! Has acertado. El número era el $numeroSecreto.")
                println("Lo lograste en $intentos intentos.")
                adivinado = true // Esto rompe el bucle y termina el juego
            }
            entradaUsuario < numeroSecreto -> println("Demasiado bajo. ¡Intenta otra vez!")
            else -> println("Demasiado alto. ¡Intenta otra vez!")
        }
    }
}

