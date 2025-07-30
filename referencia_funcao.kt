package EstruturaDeDados_Listas

fun carros(nome: String, situacao: () -> String) {

    println("Nome: $nome PARAMETRO NORMAL, ${situacao()} PARAMETRO LAMBDA")
}

fun main() {
    carros("Gol") { "Novo" }
}

