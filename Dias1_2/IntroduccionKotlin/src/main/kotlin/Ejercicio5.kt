package io.keepcoding

fun main() {
    val lista = listOf<Any>("H", 1, 2, "o", 0.2, "I", 1.0, "a", 0.3, "!")

    println(arrejuntar(list= lista))


}

fun arrejuntar(list: List<Any>): List<Any> {
    var sumaNumeros = 0.0
    var sumaLetras = ""
    list.forEach { elemento ->
    when(elemento) {
        is String -> sumaLetras += elemento
        is Int -> sumaNumeros += elemento.toDouble()
        is Double -> sumaNumeros += elemento
    }
    }
    return listOf(sumaNumeros, sumaLetras)
}