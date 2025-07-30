package EstruturaDeDados_Listas

fun livros() {
    val lista = listOf("Livro1", "Livro2", "Livro3")

    var verdadeiro = true

    while (verdadeiro) {//aqui

        //pergunta ao usuario
        println("Digite um livro: ")
        val usuarioLivro = readln() // entrada de dados

        if (usuarioLivro in lista) { // se o que ele digitar estiver na lista
            println("$usuarioLivro está na lista") // mostra
            verdadeiro = false // se o item estiver na lista, mudamos o valor da variavel para false, e o loop é interrompido

        } else {
            println("$usuarioLivro, tente novamente...")
        }

    }
}
    fun main() {
        livros()
    }