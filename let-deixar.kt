package EstruturaDeDados_Listas

fun digaSeuNome(nome: String?) {
    if (nome == null) {
        println("Nome não foi informado")
        return
    }
    println("Ola, $nome")
}

fun main() {
    digaSeuNome("Samy")
}
