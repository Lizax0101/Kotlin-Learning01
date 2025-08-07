package EstruturaDeDados_Listas.Desafios

fun pares(num: List<Int>, condicao: (Int) -> Boolean): Boolean {
    return num.all(condicao)
}

fun main() {
    val lisNum = listOf(0, -2, -6, -8, 10)
    println(pares(lisNum) { it > 9 })

    val menorQue = lisNum.any { it <= 0 }
    println(menorQue)

    val filtrando =
        lisNum.filter { it == 100 || it == -2 }
    println(filtrando)

    val contar = lisNum.count { it != 0 }
    println(contar)

    val nenhum = lisNum.none()//na lista nenhum numero é negativo? false
    println(nenhum)

    val mapPositivos = lisNum.map { if (it < 0) it }
    println(mapPositivos)


    }


//explicação
/**
 * fun pares(num: List<Int>, condicao: (Int) -> Boolean): Boolean {
 *     //fun com dois parametros, num recebe uma lista de inteiros
 *     //condicao recebe uma lambda do tipo int, e retorna um boolean.
 *     //return retorna a lista.all para verificar se todos os item da lista satisfazem a condicao
 *     return num.all(condicao)
 * }
 *
 * fun main() {
 *     val lisNum = listOf(0, -2, -6, -8, 10)
 *     println(pares(lisNum) { it > 9 })// todos os itens sao maiores que 9? false, mesmo com um positivo maior que 9 na lista ela permanece falsa pq all so retorna true se todos foram maiores.
 *
 *     val menorQue = lisNum.any { it <= 0 }// algum numero da lista é menor ou igual a zero? true.
 *     println(menorQue)
 *
 *     val filtrando =
 *         lisNum.filter { it == 100 || it == -2 }// filtre a lista se tiver algum item igual a 100 ou se item == -2// true
 *     println(filtrando)
 *
 *     val contar = lisNum.count { it != 0 }// conte quantos elementos são diferentes de zero? 4 itens
 *     println(contar)
 *
 *     val nenhum = lisNum.none()//na lista nenhum numero é negativo? false
 *     println(nenhum)
 *
 *     val mapPositivos = lisNum.map { if (it < 0) it }
 *     // map transforma cada item da lista original, o if verificando se o item é negativo. Se for, transforma em positivo it, senão it, mantem como esta se não for negativo.
 *     println(mapPositivos)
 *
 * }
 */
