package io.keepcoding

import kotlin.random.Random

fun main() {
    val edad = Random.nextInt(0, 100)
    val zona = listOf("A", "B1", "B2", "B3").random()
    println(transporte(zona, edad))
}

fun transporte(zona: String, edad: Int): Int {
    return when {
        edad < 31 -> 200
        edad in 31..59 -> {
            when(zona) {
                "A"-> 546
                "B1" -> 637
                "B2"-> 720
                "B3" -> 820
                else -> 0
            }
        }
        else -> 0
    }
}