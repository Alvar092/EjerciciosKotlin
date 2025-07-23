
fun main() {
    val text = "hola"
    text.dimeCuantosCaracteresTiene()

    val lista = listOf("1", "a", "b", "asdfdfg")
    // println("hola".contarVocales())
}

fun String.dimeCuantosCaracteresTiene() {
    println("Tengo $length caracteres")
}

fun List<String>.dimeCuantosElementosTienenMasDe1Caracter(): Int {
    return count { it.length > 1 }
}

fun Int.EsPar(): Boolean {
    return mod(2) == 0
}

fun Int.EsImpar(): Boolean {
    return mod( 3) == 0
}

/*
fun String.contarVocales(): Int {
    val vowels = listOf("a", "e", "i", "o", "u")
    return count { vowels.contains(it) }
}

 */