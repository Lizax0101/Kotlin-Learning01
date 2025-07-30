package EstruturaDeDados_Listas.Desafios

fun listFavoritos(lista: MutableList<String>) {

    println("Lista de musicas FAVORITAS de Lizandra:\n ")

    lista.forEachIndexed { posicao, cadaMusica -> println("${posicao + 1}. $cadaMusica") }

}

fun main() {
    val musicasFavoritas = mutableListOf("Paradise", "Voyage, Voyage", "Dear God", "Only Exception")
    println(listFavoritos(musicasFavoritas))
}
