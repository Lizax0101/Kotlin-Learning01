package EstruturaDeDados_Listas

fun loguinnn() {
    val alunos = mutableListOf("Jose", "Joao", "Jeferson", "Jitsu")

    var vdd = true

    while (vdd) {
        println("Digite um nome com J: ")
        val nome = readln().trim()

        if (nome.startsWith("J") && nome in alunos) {
            println("$nome aceitável!")
            vdd = false
        } else {
            println("$nome ignorado!")
        }
    }
}

fun main() {
    loguinnn()
}