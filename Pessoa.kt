package POO_2025

class CadastroSuss {
    //molde p criar os objetos, 6 atributos
    var nome = ""
    var medEspecialista = ""
    var status = ""
    var data = ""
    var idade = 0
    var horario = 0


    fun acaoDoDia() {// metodo imprimindo a msg
        val vermelho = "\u001B[31m"
        val verde = "\u001B[32m"
        val reset = "\u001B[0m"

        println("FICHA CADASTRAL------------------------")
        println("Nome : $nome")
        println("Idade: $idade anos")
        println("Médico Especialista : $medEspecialista")
        println("Data: $data ")
        println("Horário: $horario h")
        println("Status Consulta:${verde}$status$reset")
        println("---------------------------------------")
    }
    fun dirigir() {
        if (idade >= 18) {
            println("Apta, para dirigir -> $nome maior de idade.")
        } else
            println("$nome, é menor de idade.")
    }

    fun comprar() {
        val listRemedios = listOf("Diazepam", "Buscopam", "Benegripe")
        println("\"Escolha uma das opções disponiveis: Diazepam,Buscopam, Benegripe")
        val entrada = readln()
        if (entrada in listRemedios) {
            println("Voce comprou: $entrada.")
        } else {
            println("$entrada sem estoque.")
        }
    }
}

fun main() {
    //instancia da classe
    val cadastroSus = CadastroSuss()
    cadastroSus.nome = "Gabriela"
    cadastroSus.idade = 18
    cadastroSus.medEspecialista = "Dermatologista"
    cadastroSus.data = "12/08/2025"
    cadastroSus.horario = 13
    cadastroSus.status = "Marcado"

    cadastroSus.acaoDoDia()
    cadastroSus.dirigir()
    cadastroSus.comprar()
}


/**
 * // chamando o metodo, o comportamento, que imprime a msg + os metodos usados com os dados especificos  da pessoa
 * O reset (código ANSI \u001B[0m) serve para encerrar o efeito
 * da cor (ou de qualquer estilo ANSI, como negrito ou sublinhado)
 * e voltar ao estilo normal do terminal.
 *
 * É como usar uma caneta marca-texto:
 *
 * Você começa a marcar (com ${verde})
 *
 * E só para de destacar quando fecha a tampa (com $reset)
 *
 * val vermelho = "\u001B[31m"
 *         val verde = "\u001B[32m"
 *         val azul = "\u001B[34m"
 *         val amarelo = "\u001B[33m"
 *         val reset = "\u001B[0m"
 */