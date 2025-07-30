package EstruturaDeDados_Listas

fun testeElseIf() {
    println("Escolha uma opção:")
    println("1 - Depositar")
    println("2 - Sacar")
    println("3 - Sair")

    val opcao = readln()

    if (opcao == "1") {
        val dep = readln()
        val dep1 = dep.toInt()

        println("Depósito selecionado.")
    } else if (opcao == "2") {
        println("Saque selecionado.")
    } else if (opcao == "3") {
        println("Saindo...")
    } else {
        println("Opção inválida.")
    }
}

fun main() {
    testeElseIf()
}