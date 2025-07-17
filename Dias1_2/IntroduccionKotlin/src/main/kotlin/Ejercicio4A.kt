package io.keepcoding

import kotlin.random.Random

fun main() {
    val listaAleatoria = crearLista()
    println("La lista aleatoria es: ")
    println(listaAleatoria)
    println("La lista de repeticiones es: ")
    println(obtenerListaDeRepeticionesCorto(listaAleatoria))
}

fun crearLista() = MutableList(100) {
    Random.nextInt(0, 10)
}

fun obtenerListaDeRepeticiones(listAleatoria: List<Int>) = MutableList(10) { posicionActual ->
    var numeroDeRepeticiones = 0
    listAleatoria.forEach { elemento ->
        if (elemento == posicionActual) numeroDeRepeticiones++
    }
    numeroDeRepeticiones
}

fun obtenerListaDeRepeticionesCorto(listAleatoria: List<Int>) = MutableList(10) { posicionActual ->
    listAleatoria.count { it == posicionActual }
}

