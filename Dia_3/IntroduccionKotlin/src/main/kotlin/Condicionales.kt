package io.keepcoding

import kotlin.random.Random

fun main() {
    val esPar = esPar(Random.nextInt())

    val a = whenConParentesis(Random.nextInt(0, 10))
    esParSimplificada(Random.nextInt())
    whenConParentesisImprimiendolo(Random.nextInt(0, 10))
    whenConParentesisImprimiendoloLargo(Random.nextInt(0, 10))
    whenSinParentesis(Random.nextInt(0, 10))
    whenSinParentesis(Random.nextInt(0, 10), Random.nextInt(0, 10))
}

private fun condicionalIfSimple() {
    val num1 = Random.nextInt(0,20)
    if (num1 in 0..9) {
        println("El número está entre 0  9")
    } else {
        println("El número no está entre 0  9")
    }
}

private fun esPar(num: Int) = if (num.rem(2) == 0) true else false

private fun esParSimplificada(num: Int) = num.rem(2) == 0

private fun whenConParentesis(num: Int) = when(num) {
    0,1,2,3,4 -> "Suspenso"
    5 -> "Aprobado"
    6 -> "Bien"
    7, 8 -> "Notable"
    9, 10 -> "Sobresaliente"
    else -> "Nota inválida"
}

private fun whenConParentesisImprimiendolo(num: Int) = when(num) {
    in 0..4 -> println("Suspenso")
    5 ->  println("Aprobado")
    6 ->  println("Bien")
    7, 8 ->  println("Notable")
    9, 10 ->  println("Sobresaliente")
    else ->  println("Nota inválida")
}

private fun whenConParentesisImprimiendoloLargo(num: Int) {
    when (num) {
        in 0..4 -> println("Suspenso")
        5 -> println("Aprobado")
        6 -> println("Bien")
        7, 8 -> println("Notable")
        9, 10 -> println("Sobresaliente")
    }
}

private fun whenSinParentesis(num: Int) = when {
    num in 0..4 -> "Suspenso"
    num == 5 -> "Aprobado"
    num == 6 -> "Bien"
    num == 7 || num == 8 -> "Notable"
    num in 9..10 -> "Sobresaliente"
    else -> "Nota inválida"
}


private fun whenSinParentesis(num1: Int, num2: Int) = when {
    num1 in 0..4 -> "Suspenso"
    num1 == 5 && num2 > 5-> "Aprobado"
    num1 == 6 && num2 > 5-> "Bien"
    (num1 == 7 || num1 == 8) && num2 > 5-> "Notable"
    num1 in 9..10 && num2 > 5 -> "Sobresaliente"
    else -> "Nota inválida"
}
