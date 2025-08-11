class Produto(val nome: String, preco: Double) {
   // Você usa esse modelo (sem val/var no construtor) quando não precisa guardar esses valores na classe.
   // Ou seja, só vai usá-los para cálculos ou inicializações...

    var nomeUpper = ""
    var precoComDesconto = 0.0

    constructor(nome: String, preco: Double, desconto: Double) : this(nome, preco) {
        precoComDesconto = preco - desconto
        nomeUpper = nome.uppercase()
        println("Nome normal: $nome ")
    }
}

object PrecoFormatado {
    fun precoF(valor: Double): String{
        return "R$%.3f".format(valor)
    }
}


fun main() {
    val produto = Produto("Bolsa",2.00, 0.50)

    println("Produto:${produto.nome} ${produto.nomeUpper} preço: ${PrecoFormatado.precoF(produto.precoComDesconto)}")
}