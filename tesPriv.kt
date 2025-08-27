package Assuntos

class Pergunta private constructor(
    val questao: String,
    val resposta: Int
) {
    //metodo1: é uma factory → cria uma Pergunta sem expor o constructor.
    /**
     * você esconde o constructor da classe (deixa ele private) para que ninguém de fora consiga chamar Pergunta(...) diretamente
     * ex: val p = Pergunta("sua pergunta aqui", 2) instancia direta que o companion nao permite.
     * Qualquer parte do código pode instanciar Pergunta livremente se o contructor fosse public.
     */
    companion object {
        /**
         * require faz uma validação previa, se false retorna uma excepition, se true continua normal o programa
         */
        fun metodo1(questao: String, resposta: Int): Pergunta {
            require(resposta >= 0) { "A resposta não pode ser menor que zero, se liga!" }
            return Pergunta(questao, resposta)
        }

        fun metodo2(): List<Pergunta> {
            return listOf(

                //  metodo1("\n-1 + 5 = ?", -4), // ao rodar o programa  error: IllegalArgumentException, devido a validação com require no metodo
                metodo1("\n50 + 5 = ?", 55),
                metodo1("\n5 * 3 = ?", 15),
                metodo1("\n5 * 8 = ?", 40),
                metodo1("\n551 + 5 = ?", 556)// lista de perguntas fixas

            )
        }
    }
}

fun main() {
    val perguntas = Pergunta.metodo2()

    println("Começando o jogo das operações!\n".uppercase())

    var pontos = 0 // contador de pontuação do jogador, toda Vez que ele acerta, soma mais 1 a var pontos.

    perguntas.forEachIndexed { posicao, pergunta ->
        //iniciando a pergunta em 1 - primeiro println + a questao(pergunta)
        println("Pergunta ${posicao + 1}: ${pergunta.questao}")
        print("Sua resposta: ")

        val entrada = readLine()  
        val respJogador = entrada?.toIntOrNull()  // tenta converter para Int

        if (respJogador == pergunta.resposta) {
            println("✅ Show muito boom!\n")
            pontos++
        } else {
            println("Errou! A resposta correta era: ${pergunta.resposta}\n")
        }
    }

    println("Fim de jogo! Você fez $pontos pontos de ${perguntas.size}".uppercase())
}
