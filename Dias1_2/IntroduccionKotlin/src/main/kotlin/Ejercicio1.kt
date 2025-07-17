package io.keepcoding

fun main() {
    println("La sumaStrings ha sido ${sumaStrings("1", "2")}")
}

fun sumaStrings(num1: String, num2: String) = (num1.toInt() + num2.toInt()).toDouble()

