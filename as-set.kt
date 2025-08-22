package AssuntosKT.RECE

open class Produto(val nome: String)
class Fruta(nome: String, val vitamina: String) : Produto(nome)//NOME HERDANDO DE PRODUTO

fun main() {
    val itens: List<Produto> = listOf(
        Fruta("Laranja", "C"),
        Produto("Vitamina C")
    )
    println("DEBUG--Lista de itens criada: $itens")

    //produto parametro da lambda do map
    val descricoes = itens.map { produto ->
        println("DEBUG--processando produto: ${produto.nome}")
        val fruta = produto as? Fruta
        println("DEBUG-- Tentativa de cast(conversão) para Fruta(superclasse): $fruta")
        fruta?.let {
           println("DEBUG--Entrou no bloco do let com fruta usando it: ${it.nome}")

            "Fruta: ${it.nome}, Vitamina: ${it.vitamina}" }

            ?: "Produto comum: ${produto.nome}"

    }
    println("Saida final para cada item, printando o item: $descricoes")
    descricoes.forEach { println(it) }
}

/***
 * sobre o bloco do let{...}
 * fruta?.let { ... } ?: ...
 *
 * Se o cast funcionou (fruta não é nulo), executa o bloco do let.
 *
 * Se for null, cai no ?: (operador Elvis) e retorna o “Produto comum”.
 */
