package EstruturaDeDados_Listas.Desafios

import kotlin.math.min

fun listaDeFrutas( lista1: Collection<String>){

    println("Contem elementos com a letra A ?:\n")
    val contem = lista1.any{ it.contains("a")}
    println(contem)

    val quantosElementosComA = lista1.count{ it.contains("a") }
    println("Quantidade de itens com a letra 'a': $quantosElementosComA")
}

fun main(){

    val minhaLista = setOf("banana", "maça", "pera", "Kiwi", "goiaba", "banana", "maça")
    listaDeFrutas(minhaLista)
}