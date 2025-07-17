package io.keepcoding

private var heroe1: Heroe? = Heroe("Goku")

fun main() {

    /* Este no se puede, ya que por concurrencia nos podrçian cambaiar el valor del heroe mientras estamos en el let
    if (heroe1 != null) {
        heroe1.recibirGolpe()
        heroe1.recibirGolpe()
        heroe1.recibirCuracion()
        val superVida = heroe1.vida * 2
    }
    */

    heroe1?.let {
        it.recibirGolpe()
        it.recibirGolpe()
        it.recibirCuracion()
        val superVida = it.vida * 2
    }

    heroe1?.let { heroeNoNulo ->
        heroeNoNulo.recibirGolpe()
        heroeNoNulo.recibirGolpe()
        heroeNoNulo.recibirCuracion()
        val superVida = heroeNoNulo.vida * 2
        recibirMuchosGolpes(heroeNoNulo)
    }

    heroe1?.let { heroeNoNulo ->
        recibirMuchosGolpes(heroeNoNulo)
    }


    /* Este no se puede, ya que por concurrencia nos podrçian cambaiar el valor del heroe mientras estamos en el let
    heroe1?.let {
        heroe1.recibirGolpe()
        heroe1.recibirGolpe()
        heroe1.recibirCuracion()
        val superVida = heroe1.vida * 2
    } */

    // Ambos let hacen lo mismo

}

private fun recibirMuchosGolpes(heroe: Heroe) {
    heroe.recibirGolpe()
    heroe.recibirGolpe()
    heroe.recibirCuracion()
    val superVida = heroe.vida * 2
}