fun main() {

    val pessoaIdade = mutableListOf<Pair<String, Int>>()
    val nomeIdade = mutableMapOf(
        "RODRIGO" to null,
        "LIZA" to 28,
        "EDJANE" to 50
    )

    println("Digite o nome da chave: ")
    val chave = readln().uppercase()

    if (nomeIdade[chave] != null) {
        val idade = nomeIdade[chave]!!

        println(idade)

        pessoaIdade.add(chave to idade)
    }

    println(pessoaIdade)
}