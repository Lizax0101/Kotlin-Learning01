package POO_2025

open class Loja(val nome: String) {
    open fun falando(nome: String, mensagem: String) {
        println("$nome: $mensagem")
    }

    open fun respondendo(nome: String, mensagem: String) {
        println("$nome: $mensagem")
    }

    open fun despedindo(nome: String, mensagem: String) {
        println("$nome: $mensagem")
    }
}

class Cliente(nome: String) : Loja(nome) {
    override fun respondendo(nome: String, mensagem: String) {
        println("$nome (cliente): $mensagem ")
    }

}

fun main() {
    val cliente: Loja = Cliente("Pink")
    val loja = Loja("Loja de dez")


    loja.falando(loja.nome, "Olá, como posso ajudar?\n")
    cliente.respondendo(cliente.nome, "Gostaria de uma batata frita com bacon.\n")
    loja.despedindo(loja.nome, "Agradecemos o pedido, está em preparo. Sai em 10m...\n")

}