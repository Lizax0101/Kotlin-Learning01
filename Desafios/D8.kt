package EstruturaDeDados_Listas.Desafios

fun listarFilmes(filmes: List<String>) {

    filmes.forEachIndexed { posicao, filme ->
        println("\uD83C\uDF7F ${posicao + 1}. $filme")
    }
}

fun main() {

    println(" \uD83C\uDFAC Filmes Favoritos Studio Ghibli:\n")
    val meusFilmes = listOf("Castelo animado", "A viagem de chihiro", "O ceu dos vagalumes")
    listarFilmes(meusFilmes)

    print("\n Digite o nome do filme, para verificar se está na lista: ")
    val nomeFilme = readLine()?.trim()

    if (nomeFilme != null && nomeFilme in meusFilmes) {
        println("✅ O filme \"$nomeFilme\" está na lista! Muito bom gosto!")
    } else {
        println("❌ O filme \"$nomeFilme\" NÃO esta na lista. ")
    }


}
