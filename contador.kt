package AssuntosKT.RECE.incremento

class Contador(val cliente: String) {
    var quantidade = 0

    fun contador(cliente: String): Contador {
        quantidade++
        return Contador(cliente)


    }
}

fun main() {
    val cont = Contador("")
    val client1 = cont.contador("-Eu")
    val client2 = cont.contador("-Tu")
    val client3 = cont.contador("-Nós")
    println(client1.cliente)
    println(client2.cliente)
    println(client3.cliente)
    println("Todos clientes do dia: ${cont.quantidade}")
}