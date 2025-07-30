package POO_2025

// essa superclasse digamos que é apenas um modelo que sera executado tudo que há nela em outras classes seja como conteudo principal ou complementar
open class Pergunta(val texto: String) {
    open fun fazerPergunta() {
        println("Pergunta: $texto")
    }

    open fun verificarResposta(resposta: String) {
        println("Verificando resposta...")
    }


    class PerguntaExatas(texto: String, val respostaCorreta: Int) : Pergunta(texto) {

        override fun fazerPergunta() {
            super.fazerPergunta() // chamando o println da superclasse
            println("Digite sua resposta em formato numérico: ")
        }

        override fun verificarResposta(resposta: String) {
            super.verificarResposta(resposta)
            val respNum = resposta.toIntOrNull()
            if (respNum == respostaCorreta) {
                println("Você é realmente bom(a)!")
            } else {
                println("Precisa estudar mais... A resposta certa era $respostaCorreta")
            }
        }
    }
}

fun main() {
    val perguntas = listOf(
        Pergunta.PerguntaExatas("Qual a soma de -5+8 ?", 3)
    )

    for (i in perguntas) {
        i.fazerPergunta()
        val resposta = readln()// readln() — espera o usuário digitar uma resposta.
        i.verificarResposta(resposta)//Usa verificarResposta() — verifica se a resposta está certa ou errada.
        println("--------------------------\n")
    }
}


/**
 * DOCUMENTAÇÃO DO MEU CODIGO
 *
 * classe pergunta, esta aberta para ser herdada com open, a mesma recebe uma propriedade chamada texto do tipo string.
 * dentro dessa superclasse temos um metodo que tambem poderá ser sustituido em outras classes.
 *
 * ainda dentro da superclasse, criei um metodo chamado verificar resposta com uma propriedade do tipo string, que ira receber essa respota
 *
 * variavel sem val, só existe dentro do construtor, se quiser usar em algum lugar ela não ficará visivel. Com val ela se torna uma propriedade da classe.
 *
 *O metodo verificar resposta serve apenas de status para o usuario saber que esta sendo verificada a resposta dele
 *
 * A subclasse perguntaExtas, recebe por herança a propriedade texto por isso :pergunta(texto) + uma propriedade unica criada exclusivamente nesta classe que sera usada na instancia ,
 *
 * dentro dela acessei o metodo original da classe mae com o super, e sobrescrevi o comportamento desse metodo.
 *
 * abaixo, sobrescrevi o segundo metodo verificar resposta e dentro dele fiz uma verificação
 *
 * No main:
 *  criei a instancia da classe pergunta passando uma lista de onde a superclasseacessa pergunta acessa a subclasse  perguntaExata, passando a string herdada da superclasse e passando o inteiro que criei dentro da subclasse.
 *
 *  abaixo temos um for que vai iterar sobre essa instacia pergunta, para pergunta na lista perguntas faça pergunta(classe). fazerPerguntas
 *
 *  O nome Pergunta.PerguntaExatas indica:
 * Que PerguntaExatas está definida dentro da classe Pergunta, como uma classe interna (nested class)
 */


/**
 * DOCUMENTAÇÃO MAIS TECNICA COMO CHAT ORGANIZOU
 *
 * // A classe Pergunta está marcada como `open`, permitindo que outras classes a herdem.
 * // Ela recebe uma propriedade chamada `texto` do tipo String, que será usada para exibir a pergunta.
 * O método fazerPergunta()` também é `open`, permitindo ser sobrescrito nas subclasses.
 * // O método `verificarResposta(resposta: String)` serve como base genérica para exibir um status de verificação.
 * // Ele pode ser sobrescrito para implementar a lógica de verificação específica.
 *  // Em Kotlin, um parâmetro declarado sem `val` ou `var` só existe dentro do construtor.
 * // Ao usar `val`, ele se torna uma propriedade da classe e pode ser acessado em outros métodos da classe.
 *  // A subclasse `PerguntaExatas` herda a classe `Pergunta`.
 * // O construtor chama `: Pergunta(texto)` para passar o valor ao construtor da superclasse.
 * // Além disso, define uma nova propriedade `respostaCorreta`, exclusiva desta subclasse.
 *  // O método `fazerPergunta()` foi sobrescrito com `override`.
 * // Dentro dele, foi usado `super.fazerPergunta()` para reaproveitar o comportamento da superclasse antes de adicionar instruções personalizadas.
 *  // O método `verificarResposta()` foi sobrescrito para incluir uma verificação matemática.
 * // A resposta do usuário é convertida para Int com `toIntOrNull()` e comparada à resposta correta.
 * // A verificação mostra mensagens diferentes conforme o resultado.
 *  // No `main()`, foi criada uma lista chamada `perguntas` que contém objetos da subclasse `PerguntaExatas`.
 * // Essa subclasse está definida como uma nested class (classe interna) dentro de `Pergunta`.
 * // Um laço `for` percorre cada item da lista `perguntas`, chamando os métodos `fazerPergunta()` e `verificarResposta()` para cada pergunta.
 * // Isso permite aplicar polimorfismo: mesmo sendo uma lista de `Pergunta`, os métodos da subclasse são chamados dinamicamente.
 *
 */