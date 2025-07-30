package POO_2025

class Cozinha(var pedido: Boolean) {

    fun compra1(): String {
        if (pedido) {
            return "pediu $pedido, para viagem"
        }
        return "pediu $pedido para comer no local."
    }
}
fun main() {

    val compra1 = Cozinha(true)
    println(compra1.pedido)
}