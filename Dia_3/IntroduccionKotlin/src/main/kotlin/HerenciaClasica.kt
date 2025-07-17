package io.keepcoding

fun main() {
    val list = listOf(
        NamekianoConHerenciaClasica("Picolo", 100, 2, true),
        SaiyajinConHerenciaClasica("Goku", 100, true, 1, true),
        HumanoConHerenciaClasica("Krilin", 100, 2, 2),
    )

    list.forEach {
        println(it.obtenerNombre())
        println(it.obtenerVida())
    }
    var saijayin = 0
    var namekiano = 0
    var humano = 0

    list.forEach {
        when(it) {
            is NamekianoConHerenciaClasica -> namekiano++
            is SaiyajinConHerenciaClasica -> saijayin++
            is HumanoConHerenciaClasica -> humano++
        }
    }

    println("HAy $saijayin saiyans" )
    println("HAy $namekiano namekianos")
    println("HAy $humano humanos")

    val listaOrdenada = list.sortedBy { it.obtenerNombre() }
    list.forEach {
        println(it.obtenerNombre())
    }


}

open class PersonajeHeredable(
    val nombre: String,
    val vida: Int,
    ) {

    fun obtenerNombre(): String = nombre

    fun obtenerVida(): Int = vida

}

class NamekianoConHerenciaClasica(
    nombre: String,
    vida: Int,
    val numeroAntenas: Int,
    val vuela: Boolean,
): PersonajeHeredable(nombre, vida)

class SaiyajinConHerenciaClasica(
    nombre: String,
    vida: Int,
    val tieneCola: Boolean,
    val nivelEvolucion: Int,
    val vuela: Boolean,
): PersonajeHeredable(nombre, vida)

class HumanoConHerenciaClasica(
    nombre: String,
    vida: Int,
    val vecesResucitado: Int,
    val vecesMuerto: Int,
): PersonajeHeredable(nombre, vida)