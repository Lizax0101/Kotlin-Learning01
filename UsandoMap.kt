package EstruturaDeDados_Listas

fun main() {
    val nome = listOf("Lizandra", "Sam", "Clover") //lista de strings

    val mensagens = nome.map { nome -> "Bem-vindoa, $nome!" } //guarda a lista modificada

    println(mensagens)// chamando a variavel mensagens dentro do print,aqui sera exibido a lista transformada pelo map.

}
//06/2025