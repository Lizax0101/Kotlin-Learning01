package EstruturaDeDados_Listas

fun main() {
    val mensagens = listOf("msg1", "Msg2", "Msg3")
    val ultimaOpcao = mensagens.size + 1 // tamanho da msg +1 que é a opção sair

    println("Digite de 1 até $ultimaOpcao")

    for (i in 1..ultimaOpcao) {
        if (i <= mensagens.size) {
            println("$i = ${mensagens[i - 1]}")

        } else {
            println("$i - Sair")
        }
    }
}