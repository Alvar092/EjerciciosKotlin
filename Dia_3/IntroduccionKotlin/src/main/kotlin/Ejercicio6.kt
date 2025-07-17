package io.keepcoding

import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random

fun main() {
    val heroe1 = Heroe("Goku")
    heroe1.recibirGolpe()
    heroe1.recibirGolpe()
    heroe1.recibirCuracion()
}

class Heroe(
    val nombre: String,
    var vida: Int = Random.nextInt(0, 100),
) {

    init {
        mostrarEstado()
    }

    val historico = mutableListOf<Int>()

    fun recibirGolpe() {
        val dano = Random.nextInt(0,60)
        vida = max(0, vida - dano)
        historico.add(-dano)
        mostrarEstado()
    }

    fun recibirCuracion() {
        vida = min(100,vida + 20)
        historico.add(20)
        mostrarEstado()
    }

    fun mostrarEstado() {
        println("Soy $nombre y tengo estos puntos de vida $vida")
    }
}