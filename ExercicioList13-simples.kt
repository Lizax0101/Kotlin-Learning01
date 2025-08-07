package EstruturaDeDados_Listas

import kotlin.text.padStart

fun main() {
    lista()
}

fun lista() {
    var numeros = mutableListOf<Int>()
    val pendentes = mutableMapOf<Int, String>()
    val pagos = mutableMapOf<Int, String>()

    println("Deseja reservar números?")
    val resposta = readln().trim()

    if (resposta == "s") {
        println("Digite seu nome,precisa ter no min(3)letras:\")")
        val nome = readlnOrNull()
        if (nome != null && nome.length >= 3) {//definindo tamanho minimo da string de entrada p nome
            println("Bem vindo ao  sistema, $nome ")

        } else {
            println("O nome é muito curto, min(3) letras.")
            //else nome
        }
        for (i in 1..10) {
            print("Digite o $i° número: ")
            val numero = readln().toIntOrNull()

            if (numero != null && numero !in pendentes) {
                pendentes[numero] = nome!!

            } else {
                println("Número inválido ou já reservado!")
            }
        }
        println("Números reservados para $nome:")
        pendentes.forEach { numero, nome -> println(numero.toString().padEnd(10,'.') + nome.padEnd(10)) }

    } else {
        println("Opção inválida, tente novamente...")
        //else primeiro if
    }
}
