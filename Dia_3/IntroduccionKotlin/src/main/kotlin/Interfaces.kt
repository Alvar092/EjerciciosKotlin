package io.keepcoding

fun main() {
    val list = listOf(
        NamekianoConInterfaz("Picolo", 100, 2, true),
        SaiyajinConInterfaz("Goku", 100, true, 1, true),
        HumanoConInterfaz("Krilin", 100, 2, 2),
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
            is NamekianoConInterfaz -> namekiano++
            is SaiyajinConInterfaz -> saijayin++
            is HumanoConInterfaz -> humano++
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

interface Personaje {

    fun obtenerNombre(): String

    fun obtenerVida(): Int

}



class NamekianoConInterfaz(
    val nombre: String,
    val vida: Int,
    val numeroAntenas: Int,
    val vuela: Boolean,
): Personaje {
    override fun obtenerNombre(): String = nombre

    override fun obtenerVida(): Int = vida
}

class SaiyajinConInterfaz(
    val nombre: String,
    val vida: Int,
    val tieneCola: Boolean,
    val nivelEvolucion: Int,
    val vuela: Boolean,
) : Personaje {
    override fun obtenerNombre(): String = nombre

    override fun obtenerVida(): Int = vida
}

class HumanoConInterfaz(
    val nombre: String,
    val vida: Int,
    val vecesResucitado: Int,
    val vecesMuerto: Int,
) : Personaje{
    override fun obtenerNombre(): String = nombre

    override fun obtenerVida(): Int = vida
}