package io.keepcoding

import kotlin.random.Random

fun main() {
    { println("Hola, soy una Lambda") } // Defino una lambda que no asigno a nada, y no ejecuto. Como si no estuviera
    { println("Hola, soy una Lambda") }.invoke() // Defino una lambda que no asigno a nada,pero si la ejecuto
    val lambda1 = { println("Hola, soy una Lambda") }
    lambda1()
    val lambda2: () -> Unit = { println("Hola, soy una Lambda") }

    val lambda3: () -> Int = { Random.nextInt() }
    val lambda4 = { Random.nextInt() }

    val lambda5: (texto: String) -> Unit = { texto ->
        println("Hola, soy una Lambda y el valor de entrada es $texto")
    }
    lambda5("Hola")

    val lambda6: (String, String) -> Unit = { texto1, texto2 ->
        println("Hola, soy una Lambda y el valor de entrada es $texto1, $texto2")
    }
    lambda6("Hola", "Adios")

    val lambda7: (Int) -> Unit = { num ->
        println("Hola, el número recibido es $num")
    }
    repeat(
        times = 10,
        action = lambda7
    )

}