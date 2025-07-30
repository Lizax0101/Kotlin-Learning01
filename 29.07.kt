// Superclasse Produto
open class Produt(val nome: String, val preco: Double) {
    open fun mostrarInformacao() {
        println("Produto: $nome - Preço: R$ $preco")
    }
}
// Lista de compras
class ListaCompras {

    val listaProdutos = mutableListOf<Produt>()

    fun adicionar(produto: Produt) {
        listaProdutos.add(produto)
        println("${produto.nome}, adicionado à lista.")
    }

    fun mostrarLista() {
        println("\nProdutos na sua lista de compras:")
        listaProdutos.forEach { it.mostrarInformacao() }// para cada item da lista it(obj).mostrarInformacao() mostra nome do produto e preço
    }

    fun calcularCompras(): Double {//retorna esse total.
        return listaProdutos.sumOf { it.preco }//  percorre a lista e soma os preços.
    }
}

fun main() {
    val lista = ListaCompras()
    println("SUCOS DISPONIVEIS\n")
    lista.adicionar(Produt("Suco de Tamarindo", 9.00)) // polimorfismo
    lista.adicionar(Produt("Suco de Graviola", 10.00)) // polimorfismo
    lista.adicionar(Produt("Água de Coco", 10.00))

    println("\nConsulte seus produtos aqui:")
    lista.mostrarLista()

    println("\nTotal da compra: R$ ${lista.calcularCompras()}")
}

/**
 * metodo calcularCompras
 *
 *
 * fun calcularCompras(): Double {
 *       ->  return listaProdutos.sumOf { it.preco } <-
 *     }
 *
 * "Retorne a soma dos valores da propriedade preco de todos os itens da lista listaProdutos."
 *
 * Este método percorre todos os objetos da lista listaProdutos (cada objeto sendo um produto, por exemplo), e soma o valor da propriedade preco de cada um.
 * O método sumOf é uma função Kotlin muito prática que faz exatamente isso: soma um campo numérico de cada item da lista.
 *
 *
 * 🔹 listaProdutos
 * → É uma lista que contém objetos (provavelmente do tipo Produto, por exemplo).
 * Cada objeto tem propriedades, como nome e preco.
 *
 * 🔹 .sumOf { it.preco }
 * → Este é um método que percorre a lista (listaProdutos) e soma o valor de preco de cada item.
 * → A palavra it representa cada item individual da lista durante o loop.
 *
 * Lê-se como:
 * "Some o valor do campo preco de cada item da lista."
 *
 * 🔹 return
 * → Significa que o valor total da soma será retornado pelo método calcularCompras().
 *
 * sumOf não é um Iterable — ele é um método de extensão usado em coleções como
 * List, Set, Array, etc., ou seja, em tipos que implementam Iterable.
 */
