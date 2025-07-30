package POO_2025

open class Correio {
    open fun perguntaCliente(nome: String, cidade: String) {
        println("Cliente: Olá, meu nome é $nome. Preciso enviar uma encomenda para $cidade.\n")
    }

    open fun respostaAtendente(nome: String, idade: Int, cpf: String) {
        println("Atendente: Olá $nome. Tudo certo! Registrando seu envio.")
    }

    class EnvioExpresso : Correio() {
        override fun respostaAtendente(nome: String, idade: Int, cpf: String) {
            println("Atendente:\nNome-> $nome \nIdade-> $idade\n \nVERIFICADOS.\n")
            println("CPF: $cpf verificado. Fechando pedido...\n")
        }

        open class Sair {
            fun encerrarOperacao() {
                while (true) {
                    println("Para encerrar a operação: Qual a raiz quadrada de 144? ")
                    val sair = readln()
                    if (sair.lowercase() == "12") {
                        println("Operação encerrada. Parabéns")
                        break
                    } else {
                        println("Dígito incorreto.")
                    }
                }
            }
        }
    }
}

fun main() {
    val clienteNome = "João"
    val cidadeDest = "João Pessoa"
    val idadeCliente = 28
    val cpfCliente = "102.208.369-73"

    val atendimento = Correio.EnvioExpresso()

   // Cria uma instância da classe filha, EnvioExpresso.

    atendimento.perguntaCliente(clienteNome, cidadeDest) //
    atendimento.respostaAtendente(clienteNome, idadeCliente, cpfCliente)

    val sair = Correio.EnvioExpresso.Sair()
    sair.encerrarOperacao()

}
