/**
 * Katas de arranque — 5-10 min diarios.
 *
 * Regla: implementa la función, ejecuta `primerosPasos.main()` (botón ▶ en Android Studio)
 * y comprueba que todos los `check` pasan. Rota: cada día añade o modifica
 * una kata, no las borres.
 */

fun invertirCadena(s: String): String {
    // TODO: implementa (sin usar s.reversed() la primera vez)
    return s
}

fun contarVocales(s: String): Int {
    // TODO: implementa
    return 0
}

fun main() {
    check(invertirCadena("hola") == "aloh")
    check(contarVocales("Kotlin") == 1)
    println("Katas OK")
}
