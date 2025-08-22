package AssuntosKT.RECE

open class Produto(val nome: String)
class Fruta(nome: String, val vitamina: String) : Produto(nome)//NOME HERDANDO DE PRODUTO

fun main() {
    val itens: List<Produto> = listOf(
        Fruta("Laranja", "C"),
        Produto("Vitamina C")
    )

    //produto parametro da lambda do map
    val descricoes = itens.map { produto ->
        val fruta = produto as? Fruta
        fruta?.let { "Fruta: ${it.nome}, Vitamina: ${it.vitamina}" }
            ?: "Produto comum: ${produto.nome}"
    }

    descricoes.forEach { println(it) }
}
