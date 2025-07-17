package io.keepcoding

fun main() {
    println("Introduce el nombre del personaje")
    val nombre = readLine().orEmpty()
    println("El nombre que has introducido es: $nombre")
    val vida = pedirVida()
    println(iniciarPersonaje(vida, nombre))
}

private fun pedirVida(): Int {
    var vida: Int? = null
    do {
        println("Introduce la vida del personaje. Es un número entero del 0 al 100")
        vida = readLine().orEmpty().toIntOrNull()
        if (vida == null || vida !in 0..100) println("El valor introducido es inválido. Por favor prueba otra vez")
    } while (vida == null || vida !in 0..100)
    return vida
}