package EstruturaDeDados_Listas

fun motos() {
    val lista = mutableListOf("POP 110i 2025","Start 160","Fan 150")


    while (true) {

        println(println("Digite o número da moto que deseja remover:\n"))
        lista.forEachIndexed { index, item -> println("${index + 1} - $item") }

        print("Opção: ")
        val opcao = readln()
        val entrada = opcao.toIntOrNull()


        if (lista.isEmpty()) {

            println("Não há item para remover")
            break
        }

            if (entrada != null && entrada in 1..lista.size) {
                val remover = lista.removeAt(entrada - 1)
                println("${remover} removido com sucesso")

            } else (println("Opção inválida, tente novamente..."))

        }
    }


fun main() {
    motos()
}

