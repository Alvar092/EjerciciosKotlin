import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import kotlin.random.Random

fun main() {

    var contador = 0
    runBlocking {
        launch{
            println("Inicio del 1 ")
            delay(1000)
            println("Fin del 1")
        }
        launch {
            println("Inicio del 2")
            delay(3000)
            println("Fin del 2")
            contador++
        }

        val job = launch {
            delay(500000)
        }

        val int = async {
            delay(2000)
            Random.nextInt()
        }
        println("El entero vale ${int.await()}")
        job.cancel()

    }


    GlobalScope.launch {
        delay(2000L)
        println("Fin del launch")
    }
}
