package EstruturaDeDados_Listas.Desafios

fun listarFilmes1(filmes: List<String>) {

    val maiusculo = filmes.map { it.lowercase() }
    maiusculo.forEach { println(it) }

}
    fun main() {

        println(" \uD83C\uDFAC Filmes Favoritos Studio Ghibli:\n")
        val meusFilmes = listOf("Castelo animado", "A viagem de chihiro", "O ceu dos vagalumes")
        listarFilmes1(meusFilmes)
    }
