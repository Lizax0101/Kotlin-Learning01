package EstruturaDeDados_Listas

fun compras() {

    val lista = listOf("Feijao", "arroz", "açucar")

    println("Digite um produto: ")
    val produto = readln().lowercase()

    if (lista.contains(produto)) {
        println(" $produto na lista")
    } else {
        println(" $produto não esta na lista ")
    }

}

fun main() {
    compras()
}