package AssuntosKT.RECE.incremento


class Contador1(val cliente: String) {
    init {
        // println("cliente criado: ${quantidade++ }")//


        quantidade++ // sempre que criar um novo cliente, incrementa

    }

    companion object {
        var quantidade = 0
        fun contador2(cliente: String): Contador1 = Contador1(cliente)
        // função de expressão única ou em inglês single-expression function
        //Não precisa de return porque o valor da expressão depois do = já é o retorno...
    }
}

fun main() {

    val cont0 = Contador1.contador2("Maria")
    val cont1 = Contador1.contador2("João")
    val cont2 = Contador1.contador2("Ana")
    println("Cliente: ${cont0.cliente}")
    println("Cliente: ${cont1.cliente}")
    println("Cliente: ${cont2.cliente}")
    println("Total de clientes cadastrados: ${Contador1.quantidade}")
}

/**
 * ✅ O que é o init em Kotlin?
 * O bloco init em uma classe Kotlin é executado automaticamente toda vez que você cria uma nova instância (objeto) da classe.
 *
 * Ou seja:
 *
 * Você chama Contadorr("Maria")
 *
 * O construtor roda
 *
 * E o que estiver dentro do init será executado imediatamente após o construtor.
 *
 * 🧠 Por que usamos o init no seu caso?
 * Você quer fazer o seguinte:
 *
 * "Toda vez que alguém usar a função contador(cliente), eu quero contar quantos clientes já foram criados."
 *
 * A variável quantidade está no companion object, ou seja, ela é compartilhada por todos os objetos da classe.
 *
 * E o init é a melhor forma de dizer:
 *
 * "Sempre que qualquer novo cliente for criado, aumente esse número em 1."
 *
 *
 */