// Estruturas de Dados
data class Produto(
    val id: Int,
    val nome: String,
    val categoria: String,
    var quantidade: Int,
    val preco: Double,
    val localizacao: String
)

val estoque = mutableMapOf<Int, Produto>()
val movimentacoes = mutableListOf<Triple<Int, String, Int>>() // (ID do Produto, Tipo de Movimentação, Quantidade)

// Função para cadastrar um novo produto
fun cadastrarProduto(id: Int, nome: String, categoria: String, quantidade: Int, preco: Double, localizacao: String) {
    if (id !in estoque) {
        val novoProduto = Produto(id, nome, categoria, quantidade, preco, localizacao)
        estoque[id] = novoProduto
        println("Produto '$nome' cadastrado com sucesso.")
    } else {
        println("Produto com ID '$id' já existe.")
    }
}

// Função para consultar um produto pelo ID, pode ser um numero aleatorio
fun consultarProduto(id: Int) {
    val produto = estoque[id]
    if (produto != null) {
        println("\nID: ${produto.id}")
        println("Nome: ${produto.nome}")
        println("Categoria: ${produto.categoria}")
        println("Quantidade em Estoque: ${produto.quantidade}")
        println("Preço: ${produto.preco}")
        println("Localização: ${produto.localizacao}")
    } else {
        println("\nProduto com ID '$id' não encontrado.")
    }
}

// Função para atualizar o estoque (entrada/saída de produtos)
fun atualizarEstoque(id: Int, quantidade: Int, tipo: String) {
    val produto = estoque[id]
    if (produto != null) {
        when (tipo) {
            "entrada" -> {
                produto.quantidade += quantidade
                movimentacoes.add(Triple(id, "entrada", quantidade))
                println("Entrada de $quantidade unidades no produto ID '$id' registrada.")
            }
            "saida" -> {
                if (produto.quantidade >= quantidade) {
                    produto.quantidade -= quantidade
                    movimentacoes.add(Triple(id, "saida", quantidade))
                    println("Saída de $quantidade unidades do produto ID '$id' registrada.")
                } else {
                    println("Quantidade insuficiente no estoque para realizar a saída.")
                }
            }
            else -> println("Tipo de movimentação inválido.")
        }
    } else {
        println("Produto com ID '$id' não encontrado.")
    }
}

// Função para gerar relatórios
fun gerarRelatorio() {
    println("\nRelatório de Estoque:")
    println("====================")

    // Produtos com estoque baixo (menos de 5 unidades)
    println("\nProdutos com Estoque Baixo:")
    estoque.values.filter { it.quantidade < 5 }.forEach {
        println("ID: ${it.id} - Nome: ${it.nome} - Quantidade: ${it.quantidade}")
    }

    // Produtos com excesso de estoque (mais de 50 unidades)
    println("\nProdutos com Excesso de Estoque:")
    estoque.values.filter { it.quantidade > 50 }.forEach {
        println("ID: ${it.id} - Nome: ${it.nome} - Quantidade: ${it.quantidade}")
    }

    // Histórico de movimentações
    println("\nHistórico de Movimentações:")
    movimentacoes.forEach { (id, tipo, quantidade) ->
        println("Produto ID: $id, Tipo: $tipo, Quantidade: $quantidade")
    }
}

// Função principal para executar o sistema de gerenciamento de estoque
fun main() {
    while (true) {
        println("\nSistema de Gerenciamento de Estoque")
        println("===================================")
        println("1. Cadastrar Produto")
        println("2. Consultar Produto")
        println("3. Atualizar Estoque")
        println("4. Gerar Relatório")
        println("5. Sair")

        print("Escolha uma opção (1-5): ")
        when (readLine()?.toIntOrNull()) {
            1 -> {
                // Cadastrar Produto
                print("Digite o ID do Produto: ")
                val id = readLine()?.toIntOrNull() ?: -1
                print("Digite o Nome do Produto: ")
                val nome = readLine() ?: ""
                print("Digite a Categoria do Produto: ")
                val categoria = readLine() ?: ""
                print("Digite a Quantidade em Estoque: ")
                val quantidade = readLine()?.toIntOrNull() ?: 0
                print("Digite o Preço do Produto: ")
                val preco = readLine()?.toDoubleOrNull() ?: 0.0
                print("Digite a Localização no Depósito: ")
                val localizacao = readLine() ?: ""

                cadastrarProduto(id, nome, categoria, quantidade, preco, localizacao)
            }

            2 -> {
                // Consultar Produto
                print("Digite o ID do Produto para consulta: ")
                val id = readLine()?.toIntOrNull() ?: -1
                consultarProduto(id)
            }

            3 -> {
                // Atualizar Estoque
                print("Digite o ID do Produto: ")
                val id = readLine()?.toIntOrNull() ?: -1
                print("Digite o tipo de movimentação (entrada/saida): ")
                val tipo = readLine() ?: ""
                print("Digite a quantidade: ")
                val quantidade = readLine()?.toIntOrNull() ?: 0

                atualizarEstoque(id, quantidade, tipo)
            }

            4 -> {
                // Gerar Relatório
                gerarRelatorio()
            }

            5 -> {
                // Sair do Sistema
                println("Saindo do sistema. Até logo!")
                break
            }

            else -> println("Opção inválida. Tente novamente.")
        }
    }
}
