package AssuntosKT.RECE

class Pedido(val cliente: String = "Cliente Desconhecido") {//parametro padrão

    constructor(prato: String, temperatura: Int) : this() {
        println("Pedido só comida: $prato em temperatura:$temperatura°C")
    }

    constructor(prato: String, bebida: String) : this() {
        println("Pedido comida + bebida: $prato e $bebida")
    }
}

fun main() {
    Pedido("") // primário
    Pedido("\nHambúrguer", 12) // secundário
    Pedido("Pizza", "Refrigerante") // secundário
}
