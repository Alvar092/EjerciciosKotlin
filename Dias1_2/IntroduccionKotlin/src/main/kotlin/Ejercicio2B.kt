package io.keepcoding

import kotlin.random.Random

fun main() {
    val nombre1 = "Alvaro"
    val vidaActual = Random.nextInt(0, 100)

    println(iniciarPersonaje(nombre1, vidaActual))
}

fun iniciarPersonaje(nombre: String, vida: Int): String {
    return when {
        vida < 20 -> "Precaucion $nombre, estas bajo de vida"
        vida > 20 && vida < 81 -> "Precaucion $nombre, estas algo herido"
        else -> "$nombre estas en perfectas condiciones"
    }
}