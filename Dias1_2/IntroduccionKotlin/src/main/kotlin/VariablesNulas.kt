package io.keepcoding

fun main() {

    var integer1: Int? = 1
    integer1 = null


    var string1 = "Hola"

    var stringNulo1: String? = "Hola"
    stringNulo1 = null

    println(string1.uppercase())
    println(stringNulo1?.uppercase()) // Si stringNulo1 no tiene el valor nulo, entonces ejecuto uppercase.
    // En caso de que tenga valor, nulo, devuelvo nulo
    // println(stringNulo1!!.uppercase()) // No poner nunca

    val string2 = stringNulo1.orEmpty()

    val string3 = stringNulo1 ?: "Es nulo"

    /* Este método es muy útil pero lo veremos mas adelante. */
    stringNulo1?.let { text ->
        println(text)
    } ?: "Es nulo"
}