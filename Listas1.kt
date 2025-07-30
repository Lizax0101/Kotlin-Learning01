package EstruturaDeDados_Listas

fun exibirCardapio(nomes: List<String>) {
    nomes.forEach {
        println(" -$it")
    }
}

fun main() {
    println("Escolha seu acompanhamento: ")
    val cardapio = listOf("Arroz", "Feijao", "Purê de batata")

    exibirCardapio(cardapio)
}