package EstruturaDeDados_Listas

fun rifa() {
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

                    } else println("Valor máximo excedido.\n")

                    println("Deseja reservar números?")
                    val resposta = readln().trim()

                    println("Digite seu nome: ")
                    val nome = readln().trim()

                    if (resposta == "s" || nome == "rodrigo") {
                        pendentes.map { "${resposta}, ${nome} " }
                        println(pendentes)

                    }

                }

                2 -> {
                    if (numeros.isEmpty()) {
                        println("A rifa ainda não foi criada.\n")
                        continue
                    }

                    println("Números da rifa:")
                    val numeros = StringBuilder().apply {
                        numeros.map { numero ->
                            append(numero.toString().padStart(2, '0')).append(" ")//espaço
                            if ((numero + 1) % 10 == 0) appendLine()

                        }.toString()
                    }
                    println(numeros)
                }

                5 -> {
                    //val pendentes = mutableMapOf<Int, String>()
                }
            }
        } else println("Valor digitado é invalido, tente novamente.")

    }

}

fun main() {

    rifa()

}