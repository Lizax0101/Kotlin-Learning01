fun tudoMaiusculo(nome: String): String {
    return nome.uppercase()
}

fun main() {
    val nomes = listOf("lua", "sol", "estrelas", "planetas")
    val resultado = nomes.map(::tudoMaiusculo)
    println(resultado)
}