package io.keepcoding

fun main() {
    val personaDataClass1 = PersonaDataClass(nombre = "Carlos", apellido = "de Tena")

    // persona1.nombre = ""
    personaDataClass1.apellido = "asdfasdf"
    personaDataClass1.esMayorDeEdad
    personaDataClass1.nombreCompleto()
    println(personaDataClass1)

    val persona1 = Persona(nombre = "Carlos", apellido = "de Tena")
    val persona2 = Persona(nombre = "Carlos", apellido = "de Tena")
    if (persona2 == persona1) {
        println("Son iguales")
    } else {
        println("Son distintas")
    }
    // copy no existe en las clases normales.
    // val persona3 = persona2.copy()

    val personaDataClass2 = PersonaDataClass(nombre = "Carlos", apellido = "de Tena")
    val personaDataClass3 = PersonaDataClass(nombre = "Carlos", apellido = "de Tena")
    if (personaDataClass2 == personaDataClass3) {
        println("Son iguales")
    } else {
        println("Son distintas")
    }
    val personaDataClass4 = personaDataClass3.copy(
        edad = 18
    )
    personaDataClass4
}


private data class PersonaDataClass(
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

}