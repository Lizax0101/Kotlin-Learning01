package EstruturaDeDados_Listas

fun main() {

    val nomes = listOf("Rodrigo", "Lizandra", "Edjane")
    val iterar = nomes.iterator() // iterator() Cria um iterador para a coleção

    while (iterar.hasNext()){ // hasNext() Verifica se ainda há elementos a percorrer

        println(iterar.next()) // next() Retorna o próximo elemento e avança no iterador
    }

}

/*
Saída:
Rodrigo
Lizandra
Edjane
*/