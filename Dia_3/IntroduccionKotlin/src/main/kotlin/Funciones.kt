package io.keepcoding

import kotlin.random.Random

fun main() {
    funcionSinArgumentos()
    funcionConArgumentos(1)
    funcionConArgumentosPorDefecto(1)
    funcionConArgumentosPorDefecto()
    funcionConVariosArgumentos(1,2, "Hola")
    funcionConVariosArgumentosYValoresPorDefecto(num1 = 1, text = "Hola")
    val resultado1 = funcionConRetornoFacil()
    println("el resutlado de funcionConRetornoFacil = $resultado1")
    val resultado2 = funcionConRetornoCompleja()
    println("el resultado2 de funcionConRetornoFacil = $resultado2")
    val resultado3 = funcionConRetornoFacilSimplificada()
    println("el resultado3 de funcionConRetornoFacilSimplificada = $resultado3")
    val resultado4 = funcionConRetornoComplejaSimplificada()
    println("el resultado4 de funcionConRetornoComplejaSimplificada = $resultado4")
}

private fun funcionSinArgumentos() {
    println("Soy la funcionSinArgumentos")
}

private fun funcionConArgumentos(num: Int) {
    println("Soy la funcionConArgumentos")
    println("El argumento es $num")
}

private fun funcionConArgumentosPorDefecto(num: Int = 0) {
    println("Soy la funcionConArgumentosPorDefecto")
    println("El argumento es $num")
}

private fun funcionConVariosArgumentos(num1: Int, num2: Int, text: String) {
    println("Soy la funcionConVariosArgumentos")
    println("El argumento es $num1")
    println("El argumento es $num2")
    println("El argumento es $text")
}

private fun funcionConVariosArgumentosYValoresPorDefecto(num1: Int = 0, num2: Int = 0, text: String) {
    println("Soy la funcionConVariosArgumentosYValoresPorDefect")
    println("El argumento es $num1")
    println("El argumento es $num2")
    println("El argumento es $text")
}

private fun funcionConRetornoFacil(): Int {
    return Random.nextInt()
}

private fun funcionConRetornoCompleja(): Int {
    if(Random.nextBoolean()) {
        return Random.nextInt()
    }
    return 0
}

private fun funcionConRetornoFacilSimplificada() = Random.nextInt()

private fun funcionConRetornoComplejaSimplificada() = if (Random.nextBoolean()) Random.nextInt() else 0

