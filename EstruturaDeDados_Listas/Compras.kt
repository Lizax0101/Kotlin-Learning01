package EstruturaDeDados_Listas


fun todaLoja() {
    val carrinho = mutableListOf<Pair<String, Double>>() // Carrinho vazio

    val eletronicosDisponiveis = mapOf(
        "NOTEBOOK DELL" to 3000.00,
        "CELULAR G17" to 1900.00,
        "CAMERA SONY" to 2500.00,
        "TV PHILCO" to 3000.00,
        "CAMERA DE SEGURANÇA" to 100.00,
        "IPAD MINI2" to 200.00
    )

    while (true) {
        println(
            """
            Escolha uma das opções a seguir:
            1 - Produtos em estoque
            2 - Carrinho
            3 - Sair
        """.trimIndent()
        )

        print("Opção: ")
        when (readln().trim()) {

            "1" -> {
                println("\nProdutos em estoque:")
                eletronicosDisponiveis.forEach { (nome, preco) ->
                    println("${nome.padEnd(30, '.')} R$ %.2f".format(preco))
                }

                while (true) {
                    println("\nDigite o nome do produto para adicionar ao carrinho (ou 'sair' para voltar):")
                    val escolha = readln().uppercase()
                    if (escolha == "SAIR") break

                    val preco = eletronicosDisponiveis[escolha]
                    if (preco != null) {
                        carrinho.add(escolha to preco)
                        println("$escolha adicionado ao carrinho.")
                    } else {
                        println("Produto não encontrado.")
                    }
                }
            }

            "2" -> {
                if (carrinho.isEmpty()) {
                    println("Carrinho vazio.")
                } else {
                    println("\nItens no carrinho:")
                    carrinho.forEach { (nome, preco) ->
                        println("${nome.padEnd(30, '.')} R$ %.2f".format(preco))

                    }
                }
            }

            "3" -> {
                println("Saindo... ")
                break
            }

        }
    }
}

fun main() {
    todaLoja()
}
