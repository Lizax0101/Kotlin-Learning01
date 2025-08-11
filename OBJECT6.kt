package AssuntosKT.RECE

class Carro(val modelo: String){

    var total = 0
    fun carro(modelo: String): Carro{
        total++
        return Carro(modelo)
    }
}

fun main() {

    //CLASSE NORMAL SEM OBJECT, PRECISANDO INSTANCIAR P TER ACESSO AO METODO E A PROPRIEDADE DO METODO

    val c1= Carro("")
    val gol = c1.carro("Gol Quadrado")
    val fiatUno = c1.carro("Fiat Uno Fire Mille")
    println(gol.modelo)
    println(fiatUno.modelo)
    println("Numero de carros: ${c1.total}")
}