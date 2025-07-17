package io.keepcoding

fun main() {
    println("Introduce el nombre del personaje")
    val nombre = readLine().orEmpty()
    println("El nombre introducido es $nombre")
    val vida = pedirVida()

    println(iniciarPersonaje(nombre, vida))
}

private fun pedirVida(): Int {
    var vida: Int?
    do {
        println("Introduce la vida")
        vida = readLine().orEmpty().toIntOrNull()
    } while (vida == null || vida !in 0.. 100)
    return vida
}