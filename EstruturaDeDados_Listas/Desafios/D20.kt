package EstruturaDeDados_Listas.Desafios

fun animal() {
    val especie = mutableListOf<Pair<String, Int?>>()

    val lista = mutableMapOf(
        "onça pintada" to 6,
        "leao" to 10,
        "tigre" to 12,
        "jaguatirica" to null
    )
    println("LISTA DE FELINOS\n")
    lista.forEach { chave, valor -> println("Chave: ${chave.padEnd(30, '.')} Valor Associado: $valor") }
    println("\nMencione um felino: ")
    val digitado = readln().trim()

    if (lista[digitado] != null) {
        val idade = lista[digitado]
        especie.add(digitado to idade)
        println("${digitado.uppercase()}, adicionado a lista ESPECIE.")

        especie.forEach {
            println("Nome:${it.first}, Idade:${it.second} anos")
        }

    } else {
        println("Chave invalida ou valor nulo...")
    }
}
fun main() {
    animal()
}