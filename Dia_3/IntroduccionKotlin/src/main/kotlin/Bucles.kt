package io.keepcoding

import kotlin.random.Random


fun main() {
    //funcionRepeat()
    funcionWhile()

    Random.nextInt()
}

private fun funcionRepeat() {
    repeat(
        times = 10,
        action = { repeticionActual ->
            println("Estamos en la repeticón número = $repeticionActual")
        }
    )
}
private fun funcionRepeatUnPocoSimplificada() {
    repeat(
        times = 10,
        action = {
            println("Estamos en la repeticón número = $it")
        }
    )
}

private fun funcionRepeatSimplificada() {
    repeat(10) {
        println("Estamos en la repeticón número = $it")
    }
}

private fun funcionWhile() {
    var numeroAleatorio = Random.nextInt(0, 10)
    while (numeroAleatorio != 9) {
        println("numeroAleatorio = $numeroAleatorio")
        numeroAleatorio = Random.nextInt(0, 10)
        println("nuevo numeroAleatorio = $numeroAleatorio")
    }
}


private fun funcionDoWhile() {
    var numeroAleatorio = Random.nextInt(0, 10)
    do {
        println("numeroAleatorio = $numeroAleatorio")
        numeroAleatorio = Random.nextInt(0, 10)
        println("nuevo numeroAleatorio = $numeroAleatorio")
    } while (numeroAleatorio != 9)
}



