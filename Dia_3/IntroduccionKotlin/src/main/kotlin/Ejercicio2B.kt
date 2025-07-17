package io.keepcoding

import kotlin.random.Random

fun main() {
    val nombre = listOf("Goku", "Vegeta").random()
    val vida = Random.nextInt(0, 100)
    println(iniciarPersonaje(vida, nombre))

}

fun iniciarPersonaje(vida: Int, nombre: String): String {
    return when {
        vida <= 20 -> "Precaución, $nombre está bajo de vida"
        vida > 20 && vida <= 80  -> "$nombre está algo herido"
        else -> "$nombre está perfecto"
    }
}
