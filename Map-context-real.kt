package EstruturaDeDados_Listas


fun main() {
    comprador1()
}

//codigo asci mudar cor das letras na saida
val RED = "\u001B[31m"
val GREEN = "\u001B[32m"
val RESET = "\u001B[0m"

val precos = listOf(500.00, 350.00, 10.00, 67.95)// variável global


fun loja() {

    println("Digite um dos valores da lista:")
    val pComDesconto = precos.map { it - 10.0 }// nova lista cada item com 10% desconto
    pComDesconto.forEach { println("R$${it}") }
}

fun comprador1() {


    while (true) {// en
        println("Digite o valor da compra sem virgula ou ponto: ")
        val compra1 = readln()
        val digitado = compra1.toDouble()

        if (digitado in precos) {
            println("${GREEN}Valor:$digitado.p já com desconto aplicado.${RESET}")
            break
        } else {
            println("${RED}Preço invalido, tente novamente...${RESET}")
        }
    }
}
