package EstruturaDeDados_Listas.Desafios


fun listFavoritos(lista: List<String>) {

    println("Lista de musicas FAVORITAS de Lizandra:\n ")

    //println("") //para não colocar esse print vazio, voce inclui o \n dentro da string e ele dara o espaço do titulo p/ baixo

    lista.forEach { println("Música:  $it ") }
    // ou
    //lista.forEach{ musica -> println("Musica: $musica)} da no mesmo de cima
    println("")

}

fun main() {
    val musicasFavoritas = listOf("Paradise", "Voyage, Voyage", "Dear God", "Only Exception")
    println(listFavoritos(musicasFavoritas))
}




