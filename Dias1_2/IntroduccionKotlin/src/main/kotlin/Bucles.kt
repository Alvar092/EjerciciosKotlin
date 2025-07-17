package io.keepcoding

import kotlin.random.Random

fun main() {
    // funcionRepeat()
    // funcionRepeatUnPocoSimplificada()
    // funcionRepeatSimplificada()
}

private fun funcionRepeat() {
    repeat(
        times = 10,
        action = { repeticionActual ->
            println("Estamos en la repeticion numero = $repeticionActual")

        }
    )
}

private fun funcionRepeatUnPocoSimplificada() {
    repeat(
        times = 10,
        action = {
            println("Estamos en la repeticion numero = $it")

        }
    )
}

private fun funcionRepeatSimplificada() {
    repeat(times = 10) {
        println("Estamos en la repeticion numero = $it")
    }
}

private fun funcionWhile() {
    var numeroAleatorio = Random.nextInt(0, 10)
    while (numeroAleatorio != 9 ) {
        println("numero aleatorio = $numeroAleatorio")
        numeroAleatorio = Random.nextInt(0, 10)
        println("nuevo numero = $numeroAleatorio")

    }
}

private fun funcionDoWhile() {
    var numeroAleatorio = Random.nextInt(0, 10)
    do {
        println("numero aleatorio = $numeroAleatorio")
        numeroAleatorio = Random.nextInt(0, 10)
        println("nuevo numero = $numeroAleatorio")
    } while (numeroAleatorio != 9)
}