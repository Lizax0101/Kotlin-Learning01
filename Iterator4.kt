package EstruturaDeDados_Listas

fun classificacao() {
    val item = listOf(1, 2, 3, 4, 5)
    val iteracao = item.listIterator()

    while (iteracao.hasNext()){
        println("Posição de cada item: ${iteracao.nextIndex()}\n " +
                "Numero retornado: ${iteracao.next()}\n")
    }
    println("Aqui já não mais há iterações, então hasNext == a false")
}
fun main(){
    classificacao()
}