package meuapp

class Produto(val nome: String, val preco: Double) {
    fun exibirInfo() {
        println("Exibindo Informações - >\nProduto: $nome \nPreço: R$$preco")
    }
}

fun main() {
    val item = Produto("Tênis Nike", 199.99)

    // Aqui, estamos criando um objeto a partir da classe Produto, passando os valores "Tênis Nike" e 199.99 para o construtor.

    item.exibirInfo()// Chama um método da instância
}

/***
 * 🔹 Entidade → Produto ( a coisa do mundo real )
 *
 * 🔹 Classe → Define nome e preço do produto ( classe esta representando a nossa entidade - Produto )
 *
 * 🔹 Comportamento → Exibir informações do produto ( metodo )
 */


/**
 * 🔹 Resumo:
 * Produto("Tênis Nike", 199.99) → Cria uma instância da classe Produto.
 *
 * val item = Produto(...) → Guarda essa instância na variável item.
 * 
 * item.exibirInfo() → Usa a instância para chamar um método. 🚀
 */

