package io.keepcoding

fun main() {

    val list = listOf(
        NamekianoSinHerencia("a", 100, 2, true),
        SaiyajinSinHerencia("b", 100, true, 1, true),
        HumanoSinHerencia("c", 100, 2, 2),
    )
    // Aqui mostramos los nombres
    list.forEach {
        when(it) {
            is NamekianoSinHerencia -> println(it.nombre)
            is SaiyajinSinHerencia -> println(it.nombre)
            is HumanoSinHerencia -> println(it.nombre)
        }
    }
    // Aqui contamos los que hay de cada tipo
    list.forEach {
        var saijayin = 0
        var namekiano = 0
        var humano = 0

        when(it) {
            is NamekianoSinHerencia -> namekiano++
            is SaiyajinSinHerencia -> saijayin++
            is HumanoSinHerencia -> humano++
        }
    }

    list.forEach {
        when(it) {
            is NamekianoSinHerencia -> println(it.vida)
            is SaiyajinSinHerencia -> println(it.vida)
            is HumanoSinHerencia -> println(it.vida)
        }
    }

    list.forEach {
        var saijayinConVida = 0
        var namekianoConVida = 0
        var humanoConVida = 0

        when(it) {
            is NamekianoSinHerencia -> if (it.vida > 50) namekianoConVida++
            is SaiyajinSinHerencia -> if (it.vida > 50) saijayinConVida++
            is HumanoSinHerencia -> if (it.vida > 50) humanoConVida++
        }
    }

}

class NamekianoSinHerencia(
    val nombre: String,
    val vida: Int,
    val numeroAntenas: Int,
    val vuela: Boolean,
)

class SaiyajinSinHerencia(
    val nombre: String,
    val vida: Int,
    val tieneCola: Boolean,
    val nivelEvolucion: Int,
    val vuela: Boolean,
)

class HumanoSinHerencia(
    val nombre: String,
    val vida: Int,
    val vecesResucitado: Int,
    val vecesMuerto: Int,
)