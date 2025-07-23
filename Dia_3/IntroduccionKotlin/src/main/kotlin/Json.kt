import com.google.gson.Gson

fun main(){
    val personaJson = PersonaJson("Paco", "Perez")
    println(personaJson.toJson())
    val string = "{\"nombre\":\"Paco\",\"apellido\":\"Perez\", \"otracosa\":\"AAA\"}"

    val personaJson2 = Gson().fromJson(string, PersonaJson::class.java)
    println(personaJson2)
}

class PersonaJson(
    val nombre: String,
    var apellido: String = "" ,
    edad: Int = 0
) {
    fun toJson():String = Gson().toJson(this)
}

