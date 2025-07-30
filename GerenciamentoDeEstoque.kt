//Classe de Produtos
data class Produto1(
    val id: Int,
    val nome: String,
    val categoria: String,
    var quantidade: Int,
    val preco: Double,
    var localizacao: String
)

//Movimento para entrada de dados
data class Movimento(
    val produtoId: Int,
    val tipo: String, // entrar ou sair
    val quantidade: Int,
    val data: String
)

//função paracadastrar os produtos
fun cadastrarProduto(produtos: MutableList<Produto>, produto: Produto) {
    produtos.add(produto)
    println("Produto cadastrado: ${produto.nome}")
}
//função para registrar as movimentações
fun registrarMovimento(produtos: MutableList<Produto>, movimentos: MutableList<Movimento>, movimento: Movimento) {
    val produto = produtos.find { it.id == movimento.produtoId }
    if (produto != null) {
        if (movimento.tipo == "Entrada") {
            produto.quantidade += movimento.quantidade
        } else if (movimento.tipo == " Saida" && produto.quantidade >= movimento.quantidade) {
            produto.quantidade -= movimento.quantidade
        } else {
            println("Movimentação invalida. ")
        }
        movimentos.add(movimento)
    }
}
fun gerarRelatorio(produtos: List<Produto>){
    println("Relatorio de Estoque: ")
    produtos.forEach { produto: Produto ->
        println("Produto: ${produto.nome}, Quantidade: ${produto.quantidade}, Localização: ${produto.localizacao}")
    }
}
