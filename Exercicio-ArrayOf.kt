fun main(){

val list = listOf(1, 2, 3)
    val listAtualizada = list.map { it * 5 } // vai retornar uma lista atualizada com cada item multiplicado por 5.

    println(listAtualizada[2])// acesso a posição 2 que é o numero 3 multiplicado por 5 = 15

    //println(listAtualizada[3])
}

/**
 * Detalhe: Se tentarmos acessar a posição 3, recebemos como saida uma exception, pois estamos tentando acessar uma posição na lista que não existe
 * temos 3 posições nessa lista posição 0 = 1, posição 1 = 2, posição 2 = 3.
 * Então só conseguimos acessar a posição [0], [1], [2] .
 *
 * Índice 3 fora dos limites para comprimento
 */
