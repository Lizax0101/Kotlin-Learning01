package EstruturaDeDados_Listas

fun classificacao1() {
    val item = listOf(1, 2, 3, 4, 5)

    val iteracao = item.listIterator()


    while (iteracao.hasNext()) {
        iteracao.next()
    }
    println("Andei para até o final da lista\n")


    while (iteracao.hasPrevious()) {
        println("Andei para trás")
        println(
            "Posição de cada item: ${iteracao.previousIndex()}\n " +
                    "Numero retornado: ${iteracao.previous()}\n"
        )
    }

}
fun main() {
    classificacao1()
}





/**
 * // colocando so esse while com hasNext, dessa forma ele não entra no loop porque
 * o iterador procura se há algo antes do primeiro elemento e como não há nada então
 * while não entra em loop, porque ele so roda enquanto a condição for verdadeira nesse caso é false
 * ex: listOf(..0,1,2,3) antes do primeiro elemento não há nada então nem entra em loop porque ja inicia em false
 */