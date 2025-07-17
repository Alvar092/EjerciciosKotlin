/* package io.keepcoding

fun main() {
    val persona1 = PersonaDataClass(nombre = "Carlos", apellido = "de Tena")
    // persona1.nombre = ""
    persona1.apellido = "asdfasdf"
    persona1.esMayorDeEdad
    persona1.nombreCompleto()
    println(persona1)
}

private data class PersonaDataClass: Any (
    val nombre: String,
    var apellido: String = "",
    val edad: Int = 0,
) {

    var esMayorDeEdad = false

    init {
        esMayorDeEdad = edad > 18
    }

    fun nombreCompleto(): String = "$nombre $apellido"

    fun nombreCompletoYEdad(): String = "$nombre $apellido esMayorDeEdad = $esMayorDeEdad"

    override fun toString(): String {
        return nombreCompletoYEdad()
    }
}
 */