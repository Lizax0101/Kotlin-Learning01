package EstruturaDeDados_Listas.Desafios

fun animal1() {
    val especie = mutableListOf<Pair<String, Int?>>()

    val lista = mutableMapOf(
        "onça pintada" to 6,
        "leao" to 10,
        "tigre" to 12,
        "jaguatirica" to null,
        "gato" to 2
    )
    println("LISTA DE FELINOS\n")
    lista.forEach { chave, valor -> println("Chave: ${chave.padEnd(30, '.')} Valor Associado: $valor") }
    println("\nMencione um felino: ")
    val digitado = readln().trim()

    if (!lista.containsKey(digitado)) {// verifica uma chave especifica que sera digitada por entrada de dados
        val idade = lista[digitado]
        println("${digitado.uppercase()},não existe!")
    } else if (lista[digitado] == null) {
        println("Chave: $digitado existe mas o valor não.")
// valor nulo tratado aqui
    } else {
        val idade = lista[digitado]!!
        especie.add(digitado to idade)
        println("${digitado.uppercase()} adicionado.")
    }

    especie.forEach {
        println("Nome:${it.first.padEnd(20, '.')} Idade:${it.second} anos")
    }

}

fun main() {
    animal1()
}