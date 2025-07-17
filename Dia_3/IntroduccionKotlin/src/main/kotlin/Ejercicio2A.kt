package io.keepcoding

import kotlin.random.Random

fun main() {
    val edad = Random.nextInt(0, 100)
    val zona = listOf("A", "B1", "B2", "B3").random()
    val precio = calcularPrecioAbonoWhenSimple(edad, zona)

    println("Tu edad es $edad y quieres ir a la zona $zona. El precio es $precio")
}

private fun calcularPrecioAbonoWhenSimple(edad: Int, zona: String): String {
    return when {
        edad < 30 -> "200"
        edad > 65 -> "Gratis"
        zona == "A" -> "546"
        zona == "B1" -> "637"
        zona == "B2" -> "720"
        zona == "B3" -> "820"
        else -> "Otras"
    }
}

private fun calcularPrecioAbonoWhenSimpleSimplificado(edad: Int, zona: String) =
    when {
        edad < 30 -> "200"
        edad > 65 -> "Gratis"
        zona == "A" -> "546"
        zona == "B1" -> "637"
        zona == "B2" -> "720"
        zona == "B3" -> "820"
        else -> "Otras"
    }



private fun calcularPrecioAbonoWhenAnidado(edad: Int, zona: String): String {
    return when {
        edad < 30 -> "200"
        edad > 65 -> "Gratis"
        else -> when(zona) {
            "A" -> "546"
            "B1" -> "637"
            "B2" -> "720"
            "B3" -> "820"
            else -> "Otras"
        }
    }
}

private fun calcularPrecioAbonoWhenAnidadoSimplificado(edad: Int, zona: String) =
    when {
        edad < 30 -> "200"
        edad > 65 -> "Gratis"
        else -> when(zona) {
            "A" -> "546"
            "B1" -> "637"
            "B2" -> "720"
            "B3" -> "820"
            else -> "Otras"
        }
    }

