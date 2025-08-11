package AssuntosKT.RECE.incremento

fun cofrinho() {
    var valorAtual = 0.00
    var contador = 0

    while (true) {
        println("Deseja depositar R$1,00? (s/n):")
        val digitado = readln().lowercase().trim()
        if (digitado == "s") {
            valorAtual++
            contador++
            println("${"R$ %.2f".format(valorAtual)} adicionado ao seu cofrinho")
        } else {
            println("Deposito encerrado, verifique agora seu saldo...\n")
            break
        }
        println("Contador atual: $contador") // dentro do while( checando em tempo real a contagem de depoisito )
    }

    println("Você depositou $contador vezes.") // fora do loop sempre é executado.
    println("Total no cofrinho: ${"R$ %.2f".format(valorAtual)}")//fora do loop sempre é executado.
}

fun main() {
    cofrinho()
}
