package EstruturaDeDados_Listas.Desafios

fun main() {

    val motos = mutableListOf("POP 110i", "Fan 150", "Start 160")
    var continuar = true

    while (continuar){
        println("""
            
            Escolha uma das opções a seguir:
            1 - Listar motos
            2 - Adicionar motos
            3 - Remover motos
            4 - Sair
        """.trimIndent())

        print("Opção: ")
        val opcao = readln()

        when(opcao) {

            "1" -> {
                println("Motos disponíveis:")
                motos.forEachIndexed { it, item -> println("${it + 1} - $item") }
            }

            "2" -> {
                do {

                    println("Digite o nome da moto Honda que deseja adicionar: ")
                    val motoAdd = readln().trim()
                    if (motoAdd in motos){
                        println("A moto já existe ")

                    } else{
                        motos.add(motoAdd)
                        println("$motoAdd Adcionada com sucesso")
                        break //Sai do SEGUNDO looping para o priemiro no do while
                    }
                } while (true)
            }

            "3" -> {// se não houver nada na lista pra remover ele ignora todo esse bloco e volta pro while inicial.
                if (motos.isEmpty()){
                    println("Não há motos para remover.")
                    continue
                }

                println("Digite o número da moto que deseja remover: ")
                motos.forEachIndexed { it, item -> println("${it + 1} - $item") }
                print("Opção: ")
                val numeroMoto = readln().toIntOrNull()
                if (numeroMoto != null && numeroMoto > 0 && numeroMoto <= motos.size ){
                    val removida = motos.removeAt(numeroMoto -1)
                    println("$removida removida com sucesso.")
                } else
                    println("Número inválido, tente novamente...")
            }

            "4" -> {
                println("Encerrando...")
                continuar = false
            }
        }
    }
}

/**
 * "Quando você tem um valor sendo testado contra várias possibilidades fixas (como strings de menu), use when.
 * Ele é como um switch-case mais moderno, mais limpo, mais poderoso, e sem necessidade de break.
 * Isso evita erros e te força a escrever código mais legível. Além disso,
 * se amanhã você quiser tratar o caso '5', basta adicionar um novo bloco ali."
 */