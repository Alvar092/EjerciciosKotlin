package io.keepcoding

import kotlin.random.Random

fun main() {

    val response = obtenerDatosDeInternet()
    when(response) {
        is Response.Persona -> exito(response)
        is Response.Fallo -> fracaso(response)
    }
}

fun exito(persona: Response.Persona) {
    println("Ha sido un exito. Se llama ${persona.nombre}")
}

fun fracaso(fallo: Response.Fallo) {
    println("Ha sido un fracaso de tipo ${fallo.errorCode}")
}

sealed class  Response {
    class Persona(val nombre: String): Response()
    class Fallo(val errorCode: Int): Response()
}


fun obtenerDatosDeInternet() = if (Random.nextBoolean()) Response.Persona("carlos") else Response.Fallo(500)

