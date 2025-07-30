package EstruturaDeDados_Listas.Desafios

fun exibirCardapio(nomes: List<String>) {
    nomes.forEachIndexed{ index, cardapio ->
        println("${index + 1} - $cardapio")
    }

}

fun main() {
    val cardapio = listOf("Arroz", "Feijão", "Frango", "Suco de laranja")

    exibirCardapio(cardapio)
}

