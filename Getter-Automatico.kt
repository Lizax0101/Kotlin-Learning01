package Assuntos

class Conta {
    var saldo: Double = 0.00
        private set

    fun deposito(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Depósito de R$ %.2f realizado com sucesso".format(valor))
        } else {
            println("Desposito mal sucedido!")
        }
    }

    fun sacar(valor: Double) {
        if (valor > 0 && valor <= saldo) {
            println("\nSaque de R$ %.2f realizado com sucesso".format(valor))
            saldo -= valor
        } else {
            println("Saldo insuficiente")
        }
    }
}

fun main() {
    val conta = Conta()
    conta.deposito(100000.000)
    println("Saldo atual:R$ %.2f".format(conta.saldo))

    conta.sacar(1059.00)
    println("Saldo após saque:R$ %.2f".format(conta.saldo))
}


/**
 *
 * class Conta {
 *     var saldo: Double = 0.0
 *         private set
 *
 *     fun deposito(valor: Double) {
 *         if (valor > 0) {
 *             saldo += valor
 *         } else {
 *             println("Desposito mal sucedido!")
 *         }
 *     }
 *
 *     fun sacar(valor: Double) {
 *         if (valor > 0 && valor <= saldo) {
 *             saldo -= valor
 *         } else {
 *             println("Saldo insuficiente")
 *         }
 *     }
 * }
 *
 * fun main() {
 *     val conta = Conta() - Criando um objeto da classe Conta, nesse momento, a propriedade saldo já começa com 0.0
 *     conta.deposito(600.00) - quando chamo depositar, saldo estava em 0.0 então o getter pega 0.0 e faz 0.0 + 600,00 que é o valor que defini para depoisitar, o setter privado grava 100.0 no field(campo onde havia 0.0
 *     - quando faço println(conta.saldo) o getter retorna o valor atual 600.0
 *     println("Valor depósito:R$ %.2f".format(conta.saldo))
 *
 *     conta.sacar(100.00) - aqui em sacar o getter pega o valor atual do saldo que agora é 600.0 e subtrai 100 do saldo. O setter privado grava 500
 *     println("Saldo após saque:R$ %.2f".format(conta.saldo)) quando chamo no print o getter retorna 500 coo saldo restante apos saque .
 * }
 */
