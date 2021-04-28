fun main() {
    //Lista de participantes
    val listaParticipantes = mutableListOf<Participante>()
    for(i in 1..10){
        when (i) {
            in 1..3 -> {
                val esgrimista = Esgrimista("Esgrimista${i}")
                listaParticipantes.add(esgrimista)
            }
            in 4..6 -> {
                val corredor = Corredor("Corredor$i")
                listaParticipantes.add(corredor)
            }
            else -> {
                val nadador = Nadador("Nadador$i")
                listaParticipantes.add(nadador)
            }
        }
    }
    listaParticipantes.forEach { println("${it.nombre} ${it.saludar()}, ${it.decirFrase()}") }
}

open class Participante(var nombre : String, private var saludo :String, private var frase: String){
    fun saludar() : String { return saludo }
    fun decirFrase() : String { return frase }
}
class Esgrimista(nombreEsgrimista: String) : Participante(nombreEsgrimista, "soy esgrimista", "yo pego espadazos")
class Corredor(nombreCorredor : String) : Participante(nombreCorredor, "soy corredor", "yo corro durante mucho tiempo")
class Nadador(nombreNadador : String): Participante(nombreNadador, "soy nadador", "chof, chof, chof")

