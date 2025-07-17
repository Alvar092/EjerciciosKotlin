package io.keepcoding

fun main() {
presentate(nombre = "Alvaro", apellido = "Entrena")

    sumaInt(1, 2)


}

fun presentate(nombre: String, apellido: String) {
    println("Hola, soy $nombre y mi apellido es $apellido")
}

fun sumaInt(num1: Int, num2: Int) = (num1 + num2).toString()



