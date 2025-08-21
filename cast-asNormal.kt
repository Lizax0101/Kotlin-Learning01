package AssuntosKT.RECE

open class SerHumano
class Menino(val nome: String) : SerHumano()
class Menina(val nome: String) : SerHumano()
class Fantasma(val nome: String) : SerHumano()


fun main() {

    val instanciaMenino: SerHumano = Menino("Joe")
    val instanciaMenina: SerHumano = Menina("Ary")
    val instanciaFantasma: SerHumano = Fantasma("Gaspazinho")

    val menino = instanciaMenino as? Menino
    println("Resultado: Dentro de mim realmente existe um MENINO: ${menino?.nome}")

    val menina = instanciaMenina as? Menina
    println("Resultado: Sim por dentro sou uma MENINA: ${menina?.nome}")

    try {
        val fantasma = instanciaFantasma as Fantasma
        println("Resultado: Cast correto, aparece o nome: ${fantasma.nome}")
    } catch (e: Exception) {
        println("Resultado: Agora quebrou, mostra a excepcion: ${e.message} ")
    }

    if(instanciaFantasma is Fantasma){
        println("Resultado: Verificação esta ok: ${instanciaFantasma.nome}")
    }

}





