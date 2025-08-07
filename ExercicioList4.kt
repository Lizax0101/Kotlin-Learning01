package EstruturaDeDados_Listas.Desafios

val paises = listOf("Japão", "China", "Coreia")

                                         //posição do país
fun exibirPais() { paises.forEachIndexed { indice, país -> println("[$indice] Nome: $país") }
}

fun main() {
    exibirPais()
}

/**
 * É uma função que percorre (itera) uma lista e fornece duas coisas ao mesmo tempo:
 * O índice (posição) do item.
 * O valor (o item da lista).
 */


