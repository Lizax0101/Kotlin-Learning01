class ListaProdutividade(var nome: String, var status: Boolean)

fun acao() {
    val lista = mutableListOf<ListaProdutividade>()

    println("Quantas pessoas deseja adicionar?")
    val quant = readlnOrNull()?.toIntOrNull() ?: 0

    for (i in 1..quant) {
        var nome: String

        // Validação do nome
        while (true) {
            println("Digite seu nome:")
            val entrada = readlnOrNull()
            if (!entrada.isNullOrBlank()) {
                nome = entrada
                break
            }
            println("⚠ Nome inválido! Tente novamente.")
        }// aind não funciona como esperado, com lacuna aberta, corrigir

        // Validação da atividade
        val atividFeita = run {
            var resposta: String?
            while (true) {
                println("Concluiu sua atividade? (s/n)")
                resposta = readlnOrNull()?.lowercase()

                if (resposta == "s" || resposta == "n") break
                println("⚠️ Resposta inválida! Digite apenas 's' ou 'n'.")
            }
            resposta == "s"
        }

        val pessoa = ListaProdutividade(nome, atividFeita).apply {
            println("Checklist registrado para $nome: ${if (status) "Fez!" else "Não fez!"}")
        }
        lista.add(pessoa)

        println("\n----LISTA ATUALIZADA----")
        lista.mapIndexed { index, pessoa ->
            println("${index + 1} - ${pessoa.nome}: ${if (pessoa.status) "Fez!" else "Não fez!"}")
        }
    }
}

fun main() {
    acao()
}
