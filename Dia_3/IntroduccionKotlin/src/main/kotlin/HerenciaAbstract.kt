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
            is NamekianoConHerenciaAbstracta -> namekiano++
            is SaiyajinConHerenciaAbstracta -> saijayin++
            is HumanoConHerenciaAbstracta -> humano++
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

abstract class PersonajeAbstracto(
    val nombre: String,
    val vida: Int
) {

    open fun obtenerNombre(): String = nombre

    abstract fun obtenerVida(): Int = vida

}

class NamekianoConHerenciaAbstracta(
    nombre: String,
    vida: Int,
    val numeroAntenas: Int,
    val vuela: Boolean,
): PersonajeAbstracto(nombre, vida) {
    override fun obtenerVida(): Int = vida
}

class SaiyajinConHerenciaAbstracta(
    nombre: String,
    vida: Int,
    val tieneCola: Boolean,
    val nivelEvolucion: Int,
    val vuela: Boolean,
): PersonajeAbstracto(nombre, vida) {
    override fun obtenerVida(): Int = vida
}

class HumanoConHerenciaAbstracta(
    nombre: String,
    vida: Int,
    val vecesResucitado: Int,
    val vecesMuerto: Int,
): PersonajeAbstracto(nombre, vida) {
    override fun obtenerNombre(): String = "No te digo mi nombre "
    override fun obtenerVida(): Int = vida
}