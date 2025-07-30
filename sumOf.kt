package POO_2025

class SomaEmprestimo(val nome: String, val valor: Double)

val listaClientes =
    listOf(SomaEmprestimo("Liza", 500.00), SomaEmprestimo("Adele", 300.00), SomaEmprestimo("Ariana", 1000.00))

fun calcular(): Double {
    return listaClientes.sumOf { it.valor }// soma a propriedade valor de todos os elementos(obj da superclasse) da lista, q são obj da classe SomaEmprestimo

}
fun main() {

    // pesquisei uma formatação interessante para saida,“Repita o caractere = 40 vezes.”
    println("Lista de clientes devedores:\n")
    listaClientes.forEachIndexed { indice, cliente ->
        println("Cliente ${indice+1}: Nome=${cliente.nome}, Valor=R$ ${"%.2f".format(cliente.valor)}")
    }
    println("=".repeat(40))


    val total = calcular()
    println("\nValor total empréstimos: R$ ${"%.2f".format(total)}")

}


/**
 * ✅ Repetição de string ou Multiplicação de string
 * Em Kotlin, o método .repeat(n: Int) é um:
 *
 * 🔹 método de extensão da classe String
 * 🔹 que retorna a mesma string repetida n vezes
 */
