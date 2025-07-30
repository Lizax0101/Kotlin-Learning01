data class Mensagem(val titulo: String, val conteudo: String, var lida: Boolean = false)

fun caixaDeMsg() {
    val mensagens = mutableListOf(
        Mensagem("[Adm-2.0]", "Olá, seja bem-vindo ao nosso time."),
        Mensagem("[Adm-3.0]", "Preciso desse retorno, ainda hoje ok?"),
        Mensagem("[Adm-4.0]", "Atualização disponível para download.")
    )
    while (true) {
        println("\n📥 Caixa de Entrada:")
        mensagens.forEachIndexed { index, msg ->
            val status = if (msg.lida) "✔ Lida" else "📨 Não lida"
            println("${index + 1} - ${msg.titulo} [$status]")
        }
        println("${mensagens.size + 1} - Sair da caixa")

        print("Escolha uma mensagem para abrir: ")
        val escolha = readln().toIntOrNull()

        if (escolha == null || escolha !in 1..(mensagens.size + 1)) {
            //Se o número digitado não está entre 1 e 4, mostre erro


            println("❌ Opção inválida, tente novamente.")
            continue
        }

        if (escolha == mensagens.size + 1) {
            println("Saindo da caixa de entrada...\n")
            break
        }

        val mensagem = mensagens[escolha - 1]
        println("\n📩 ${mensagem.titulo}")
        println(mensagem.conteudo)
        mensagem.lida = true

        println("\nPressione ENTER para voltar à caixa.")
        readln()
    }
}

fun umaMensagemm() {
    while (true) {
        println("Você tem uma nova mensagem! Digite 'open' para abrir:")
        val entrada = readln().trim().lowercase()

        if (entrada == "open") {
            println("Abrindo mensagem...\n")

            val mensagem = StringBuilder().apply {
                appendLine("Nova mensagem (1) ")
                appendLine("Enviado por: [Adm-1.0] ")
                append("Lizandra, conserta o código na linha 34.\n")
                append("Você tem até amanhã, para me entregar ok?")
            }.toString()

            println(mensagem)

            println("\nPressione ENTER para ir para sua Caixa de Entrada.")
            readln()

            caixaDeMsg() // <- Chamada da caixa de mensagens aqui
            break
        } else {
            println("Digite um comando válido... tente outra vez.\n")
        }
    }
}

fun main() {
    umaMensagemm()
}
