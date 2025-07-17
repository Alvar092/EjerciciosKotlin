package io.keepcoding

fun main() {
    val boolean1 = true
    val boolean2: Boolean = true
    val boolean3 = false
    println("boolean1 = $boolean1")
    println("boolean2 = $boolean2")
    println("boolean3 = $boolean3")

    var boolean4 = true
    println("boolean4 = $boolean4")
    boolean4 = false
    println("boolean4 = $boolean4")


    val integer1 = 1
    val integer2: Int = 2
    val double1 = 1.0
    val double2: Double = 1.0
    val float1 = 1.0f
    val float2: Float = 1.0f

    val short1: Short = 1 // Estaríamos ahorrando varios bits al usar short en vez de Int

    println("El Int más pequeño es ${Int.MIN_VALUE} y el más grande ${Int.MAX_VALUE}")
    println("El Short más pequeño es ${Short.MIN_VALUE} y el más grande ${Short.MAX_VALUE}")

    val string1 = "hola"
    val string2: String = "adios"
    println(string2)
    println("$string1 y $string2")

    val char1 = 'a'
    val char2: Char = 'a'

    val number1: Number = 1.0f

    // Para crearlo vacio
    val array1 = arrayOf<Int>()
    val array2 = emptyArray<Int>()

    // Para crearlo con contenido del mismo tipo
    val array3 = arrayOf("H", "o", "l", "a")
    println(array3.toList())
    println("La posición 0 del array3 es ${array3[0]}")

    val array4 = arrayOf(1,2,3,4.0)
    println(array4.toList())

    val list1 = listOf("H", "o", "l", "a")
    println(list1)
    println("La posición 0 de la list1 es ${list1[0]}")


    val mutableList1 = mutableListOf("H", "o", "l", "a")
    println(mutableList1)
    println("La posición 0 de la mutableList1 es ${mutableList1[0]}")
    mutableList1[0] = "G"
    println(mutableList1)
    println("La posición 0 de la mutableList1 es ${mutableList1[0]}")
    mutableList1.add("!")
    mutableList1.add(0, "!" )
    println(mutableList1)

    val mutableList2 = array4.toMutableList()
    mutableList2.add(1)
    println("mutableList2 = $mutableList2")
    println("array4 = ${array4.toList()}")

    var list2 = listOf<Int>()
    list2 = listOf(1,2,3)


    println("Es la list2 un entero? ${list2 is Int}")
    println("Es la list2 una lista? ${list2 is List<Int>}")
    println("A que la list2 no es un entero? ${list2 !is Int}")
    println("A que la list2 no es una lista? ${list2 !is List<Int>}")

    number1 as Float // A partir de este momento number1 se considera como un float.
    // number1 as String // Si esto no estuviera comentado, daría una exception de casteo de clases

}

