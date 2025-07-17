package io.keepcoding



fun main() {
    // fun lambda1() { println("Esta Lambda escribe: Hola") }
    val lambda1 = { println("Esta Lambda escribe: Hola") }
    lambda1()
    // fun lambda2(integer : Int) {  println("Esta Lambda recibe un Int y lo escribe: $integer") }
    val lambda2: (Int) -> Unit = { integer -> println("Esta Lambda recibe un Int y lo escribe: $integer") }
    lambda2(1)
    // fun ejercicio3(posicion : Int, list : List<Any>) { println("Esta Lambda recibe un Int y una Lista. Escribe al elemento que haya en la posición ${ list[posicion]}") }
    val lambda3: (Int, List<Any>) -> Unit = { posicion, list ->
        println("Esta Lambda recibe un Int y una Lista. Escribe al elemento que haya en la posición ${ list[posicion]}")
    }
    lambda3(1, listOf("1", 1, 0.5f))
}

