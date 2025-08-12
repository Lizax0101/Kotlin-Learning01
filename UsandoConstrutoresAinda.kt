package AssuntosKT.RECE


class Pedidoo(val cliente: String) { //pedido0 sem itens

    private val lanches = mutableListOf<String>()//inicializada

    constructor(cliente: String, prato: String) : this(cliente) {// pedido1 com 1 item
        lanches.add(prato)// prato adc a list
    }

    constructor(cliente: String, prato: String, bedida: String) : this(cliente, prato) {// pedido 2 com 2 itens
        lanches.add(bedida)// bebida adc a list
    }


    fun pedidoCompleto() {
        println("Cliente: $cliente, seus itens são: ${lanches.joinToString(",")}")
    }// metodo que mostra as propriedades dentro de uma string separada por virgula.
    // executa cada construtor
}

fun main() {
    val pedido0 = Pedidoo("Samara")
    pedido0.pedidoCompleto()

    val pedido1 = Pedidoo("Kee", "Batata Frita")
    pedido1.pedidoCompleto()

    val pedido2 = Pedidoo("Samy", "Casquinha Baunilha", "Suco Limão(obs: FORTE)")
    pedido2.pedidoCompleto()
}

/**
 * ordem execução: classe, inicializadores e cosntrutores
 * parametro cliente é obrigatorio passar nos demais contrutores para que eles sejam inicializados corretamente, no primeiro construtor apos a classe
 * temos um parametro obrigatorio+ um local
 * no segundo cosntrutor temos um parametro obrigatorio, um que herda do primeiro construtor e um local, todos passando this com cliente parametro obrigatorio da superclasse
 *
 * o metodo abaixo serve para mostrar a as propriedades dos construtores em ação
 */