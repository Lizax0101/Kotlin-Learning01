package EstruturaDeDados_Listas


fun main() {
    listaa()
}

fun listaa() {
    val pendentes = mutableMapOf<Int, String>()

    println("Deseja reservar números? (s/n)")
    val resposta = readln().trim()

    if (resposta == "s") {
        println("Digite seu nome:")
        val nome = readln().trim()

        println("Escolha seu número:")
        val meuNum = readln().toInt()

        if (nome == "rodrigo" || meuNum == 5) {
            pendentes[meuNum] = nome
           println(pendentes)
        }

    } else {
        println("Erro, tente novamente.")
    }
}
