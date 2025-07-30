package EstruturaDeDados_Listas

fun loja1() {
    var continuar = true

    while (continuar) {

        val cupons = listOf("VALE10", "VALE20", "VALE30")

        val produtos = mapOf(
            "Camisa:" to 80.99,
            "Blusa:" to 70.99,
            "Calça:" to 60.99
        )
        println(
            """
            
            Escolha uma das opções a seguir:
            1 - Lista de produtos
            2 - Cupons disponíveis
            3 - Sair
        """.trimIndent()
        )

        print("Opcão: ")
        val opcao = readln().trim()


        when (opcao) {
            "1" -> {
                println("\nProdutos disponíveis:")
                produtos.forEach {
                    println(String.format("%s R$%.2f", it.key, it.value))
                }
                println("Deseja adicionar cupom de desconto? (s/n)")
                val confirmacao = readln().uppercase()

                if (confirmacao == "S") {
                    print("Cupom:")
                    val cupom = readln().uppercase()

                    if (cupom in cupons) {
                        when (cupom) {
                            "VALE10" -> {
                                println("\n10% de desconto adicionado aos produtos.\n")
                                produtos.forEach { println(String.format("%s R$%.2f", it.key, it.value - 10)) }
                            }

                            "VALE20" -> {
                                println("\n20% de desconto adicionado aos produtos.\n")
                                produtos.forEach { println(String.format("%s R$%.2f", it.key, it.value - 20)) }
                            }

                            "VALE30" -> {
                                println("\n30% de desconto adicionado aos produtos.\n")
                                produtos.forEach { println(String.format("%s R$%.2f", it.key, it.value - 30)) }
                            }
                        }
                    } else println("\nCupom inválido, tente novamente...\n")

                } else if (confirmacao == "N") {
                    println("Cupons de desconto não adicionados.")
                    

                } else println("Opção invalida.")
            }

            "2" -> {
                cupons.forEach { println("Cupons Disponiveis: $it") }
            }

            "3" -> {
                println("Saindo...")
                continuar = false
            }
        }
    }
}

fun main() {
    loja1()
}