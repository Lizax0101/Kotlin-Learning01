fun main() {

    //Array

    val frutas = arrayOf(
        "Maça", "Banana", "Uva", "Kiwi",
        "Morango", "Jaca", "amora",
    )
    println(frutas[0]) // Maça no indice zero


    val frutas1 = mutableListOf(
        "Maça", "Banana", "Uva", "Kiwi",
        "Morango", "Jaca", "amora", "Malancia"
    )
    println(frutas1[7]) // Melancia no indice 7

    val nomes = listOf("Ana", "Maria", "Carlos")
    println(nomes[2])

    val numeros = mutableListOf(1, 2, 3, 4)
    numeros.add(5) // adicionando item
    numeros.remove(1) // removendo item
    println(numeros)// chamando a variavel

    val cores = setOf("Blue", "Red", "Purple", "Black", "Blue")
    println(cores)// não aparecerá Blue 2x

    val aluno = mapOf("nome" to "Lucas", "idade" to 22)
    println(aluno["nome"])


    val cadastro = mutableMapOf("email" to "meuemail@ema.com")
    cadastro["telefone"] = "9999-0000"
    // adiciona uma nova
    // entrada no Map com a chave
    // "telefone" e valor "9999-0000":
    println(cadastro)
}