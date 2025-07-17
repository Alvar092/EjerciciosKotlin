package io.keepcoding

fun main() {
    println("La sumaStrings ha sido ${sumaStrings("1", "2")}")
    saluda("Carlos", "de Tena Bellmont")
    println(sumarToString(1,1))
}

private fun sumaStrings(num1: String, num2: String) = (num1.toInt() + num2.toInt()).toDouble()

private fun saluda(nombre: String, apellido: String) = println("Soy $nombre y me apellido $apellido")

private fun sumarToString(num1: Int, num2: Int) = (num1 + num2).toString()