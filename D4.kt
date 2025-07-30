package EstruturaDeDados_Listas.Desafios

fun todosNomes(lista: List<String>) {
                                               // duas condições sendo true
    val novaLista = lista.filter { it == "Rodrigo" || it == "Lizandra" }
    novaLista.map { println("Salvo Na Nova Lista: $it") }
}

fun main() {
    val nomes = listOf("Joao", "Jose", "Rodrigo", "Lizandra")
    println(todosNomes(nomes))
}