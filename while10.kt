package EstruturaDeDados_Listas

import kotlin.math.log

fun loguinn() {
    val alunos = mutableListOf<String>("Jose", "Joao", "Jeferson", "jitsu")

    var vdd = true

    while (vdd) {
        println("Digite um nome com J: ")
        val nomes = readln()

        if (nomes in alunos) {
            println("$nomes aceitavel!")
            vdd = false

        } else {
            println("$nomes ignorado!")
        }

    }
}

fun main() {
    loguinn()

}