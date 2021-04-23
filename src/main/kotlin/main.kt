fun main() {
    //Lista de participantes
    val listaParticipantes = mutableListOf<Participante>()
    var rellenar = 0
    for(i in 0..5){
        when (rellenar) {
            0 -> {
                val esgrimista = Esgrimista("Esgrimista n:$i")
                listaParticipantes.add(esgrimista)
                rellenar++
            }
            1 -> {
                val corredor = Corredor("Corredor n:$i")
                listaParticipantes.add(corredor)
                rellenar++
            }
            else -> {
                val nadador = Nadador("Nadador n:$i")
                listaParticipantes.add(nadador)
                rellenar = 0
            }
        }
    }

    listaParticipantes.forEach { println("${it.nombre} ${it.saludar()}, ${it.decirFrase()}") }
}

open class Participante(var nombre : String, var saludo :String, var frase: String){
    fun saludar() : String { return saludo }
    fun decirFrase() : String { return frase }
}
class Esgrimista(nombreEsgrimista: String) : Participante(nombreEsgrimista, "soy esgrimista", "yo pego espadazos")
class Corredor(nombreCorredor : String) : Participante(nombreCorredor, "soy corredor", "yo corro durante mucho tiempo")
class Nadador(nombreNadador : String): Participante(nombreNadador, "soy nadador", "chof, chof, chof")

