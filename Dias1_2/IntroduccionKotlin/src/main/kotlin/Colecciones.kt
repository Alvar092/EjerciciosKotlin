package io.keepcoding

fun main() {
    val array1 = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val array2 = Array(10) { it + 1 }
    val array3 = Array(
        size = 10,
        init = { posicion -> posicion + 1 }
    )

    val list1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val list2 = List(10) { it + 1}
    val list3 = List(
        size = 10,
        init = { posicion -> posicion + 1 }
    )

    val list4 = listOf("A", "B")

    array1.forEach { println("El elemento recibido es $it") }
    array1.forEach(action = { elemento -> println("El elemento recibido es $elemento") })

    list4.forEachIndexed { posicion, elemento -> println("El elemento recibido es $elemento y  esta en la posicion $posicion")}
    list4.forEachIndexed(action = { posicion, elemento -> println("El elemento recibido es $elemento y  esta en la posicion $posicion")})
}