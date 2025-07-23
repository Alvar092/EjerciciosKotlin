package io.keepcoding

import kotlin.random.Random


private var heroe1: Heroe? = Heroe("Goku")

fun main() {
     val superVidaONull = heroe1?.run {
         // Ya vivo dentro de heroe1
         recibirGolpe()
         recibirCuracion()
         recibirCuracion()
         val superVida = vida * 2
         superVida // Devuelve la última línea que se ejecuta
    }

    val superVidaOCero = heroe1?.run {
        // Ya vivo dentro de heroe1
        recibirGolpe()
        recibirCuracion()
        recibirCuracion()
        val superVida = vida * 2
        superVida // Devuelve la última línea que se ejecuta
    } ?: 0

    val heroeGolpeadoONull = heroe1?.apply {
        // Ya vivo dentro de heroe1
        recibirGolpe()
        recibirCuracion()
        recibirCuracion()
        val superVida = vida * 2
        superVida // Devuelve la última línea que se ejecuta despues de recibir todos los cambios.
    }

    val heroeGolpeadoONuevo = heroe1?.apply {
        // Ya vivo dentro de heroe1
        recibirGolpe()
        recibirCuracion()
        recibirCuracion()
        val superVida = vida * 2
        superVida // No hace nada xq no devuelve nada
    } ?: Heroe("Sin nombre")


    val heroeGolpeadoONuevo2 = heroe1?.also {
        // Ya vivo dentro de heroe1
        it.recibirGolpe()
        it.recibirCuracion()
        it.recibirCuracion()
        val superVida = it.vida * 2
        superVida // No hace nada xq no devuelve nada
    } ?: Heroe("Sin nombre")


    val a = with(heroe1) {
        // Ya vivo dentro de heroe1
        this?.recibirGolpe()
        this?.recibirCuracion()
        this?.recibirCuracion()
        1 // Devuelve la última línea ejecutada
        // val superVida = this?.vida * 2
        // superVida // No hace nada xq no devuelve nada
    }


    run {
        // Ya vivo dentro de heroe1
        heroe1?.recibirGolpe()
        heroe1?.recibirCuracion()
        heroe1?.recibirCuracion()
        // val superVida = this?.vida * 2
        // superVida // No hace nada xq no devuelve nada
    }


}