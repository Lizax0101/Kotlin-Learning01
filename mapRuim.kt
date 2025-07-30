package EstruturaDeDados_Listas

fun rifaa() {
    var numeros = mutableListOf<Int>()
    val pendentes = mutableMapOf<Int, String>()
    val pagos = mutableMapOf<Int, String>()

    while (true) {
        println(
            """
        1- Criar rifa.
        2- Números livres
        3- Números pendentes
        4- Números pagos
        5- Sair
    """.trimIndent()
        )
        print("Opção: ")
        val escolha = readln().toIntOrNull()

        if (escolha != null && escolha < 5) {
            when (escolha) {

                1 -> {
                    // criação da rifa
                    println("Digite o tamanho da rifa: ")
                    val tan = readln().toIntOrNull()
                    if (tan != null && tan <= 1000) {
                        numeros = MutableList(tan) { it }
                        println("Rifa com $tan números criada com sucesso.")

                        println("Deseja reservar números?")
                        val resposta = readln()

                        if (resposta == "s"){

                            println("Digite seu nome: ")
                            val nome = readlnOrNull()

                            println("Digite o número para reserva.")
                            val numero = readln().toIntOrNull()

                            if (nome != null && numero != null && numero < numeros.size){
                                pendentes[numero]=nome

                                val livres = numeros.filter { it != numero }

                                livres.forEach { livre ->
                                    print("${livre.toString().padStart(2, '0')} ")
                                    if ((livre + 1) % 10 == 0) println()
                                }

                            }

                        } else println("Erro, tente novamente.")

                    } else println("Valor máximo excedido.\n")

                }

                2 -> {
                    if (numeros.isEmpty()) {
                        println("A rifa ainda não foi criada.\n")
                        continue
                    }

                    println("Números da rifa:")
                    val numeros = StringBuilder().apply {
                        numeros.map { numero ->
                            append(numero.toString().padStart(2, '0')).append(" ")
                            if ((numero + 1) % 10 == 0) appendLine()

                        }.toString()
                    }
                    println(numeros)
                }

                4 -> {

                }


            }
        } else println("Valor digitado é invalido, tente novamente.")

    }

}

fun main() {

    rifaa()

}