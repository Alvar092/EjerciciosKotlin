package io.keepcoding


fun main() {
    val lista = listOf<Any>("H", 1, 2, "o", 0.2, "l", 1.0, "a", 0.3, "!")
    val palabra = obtenerPalabra(lista)
    println("La palabra encontrada es $palabra")
    val numero = obtenerNumero(lista)
    println("El número encontrado es $numero")
    ejemploFilter(lista)
    ejemploMap(lista)
}

fun obtenerNumero(lista: List<Any>): Double {
    var out = 0.0
    lista.forEach {
        when {
            it is Double -> out += it
            it is Int -> out += it
        }
    }
    return out
}

fun obtenerPalabra(lista: List<Any>): String {
    var out = ""
    lista.forEach { if (it is String) out += it }
    return out
}


fun ejemploFilter(lista: List<Any>) {
    /*val listaString = lista.filter { it is String }
    listaString.forEach { print("$it") }*/
    lista.filter { it is String }.forEach { print("$it") }
}

fun ejemploMap(lista: List<Any>) {
    val listaTransformada = lista.map {
        it.toString()
    }
    println(listaTransformada)
}
