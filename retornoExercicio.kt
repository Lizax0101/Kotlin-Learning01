fun saudar(nome: String, idade: Int): String {
    return """
        Olá, meu nome é $nome! E tenho $idade anos de idade
        Ano que vem farei ${idade + 1}!
    """.trimIndent()

}

fun main() {
    val mensagem = saudar("José", 27)
    print(mensagem)
}