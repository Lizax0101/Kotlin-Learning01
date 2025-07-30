package EstruturaDeDados_Listas

data class Mensagem(val titulo: String, val texto: String, var lida: Boolean = false)

fun caixaSimples() {
    val mensagens = mutableListOf(
        Mensagem("Mensagem 1", "Bem-vinda ao sistema."),
        Mensagem("Mensagem 2", "Você tem um compromisso amanhã.")
    )

    while (true) {
        println("\nMinhas Mensagens:")
        mensagens.forEachIndexed { i, msg ->
            val status = if (msg.lida) "✔" else "❗"
            println("${i + 1} - ${msg.titulo} [$status]")
        }
        println("3 - Sair")

        print("Escolha uma opção: ")
        val opcao = readln().toIntOrNull()

        if (opcao == 3) {
            println("Saindo...")
            break
        }

        if (opcao in 1..2) {
            val msgg = mensagens[opcao!! -1]
            println("\n📩 ${msgg.titulo}:")
            println(msgg.texto)
            msgg.lida = true
            println("\n(Pressione ENTER para voltar)")
            readln()
        } else {
            println("Opção inválida.")
        }
    }
}

fun main() {
    caixaSimples()
}
