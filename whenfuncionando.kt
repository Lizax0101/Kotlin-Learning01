package EstruturaDeDados_Listas

fun novaOpcao(){
    val listaOpcoes = mutableListOf<String>()
    var continuar = true

    while (continuar) {

        println("""
            
        "Escolha uma opção:"
        1 - Dizer Olá"
        2 - Mensagem do dia
        3 - Adicionar nova opção
        4 - Encerrar Menu
        """.trimIndent())

        if (listaOpcoes.isNotEmpty()){
            listaOpcoes.forEachIndexed { index, item ->
                println("${index+5} - $item")
            }
        }
        print("Digite aqui: ")
        val opcao = readln().trim()


        when(opcao) {

            "1" -> println("Olá")
            "2" -> println("Tenha um excelente dia.")
            "3" -> {
                println("Digite a nova opção: ")
                val novaOpcao = readln().trim()
                if (novaOpcao.isNotEmpty()){
                    listaOpcoes.add(novaOpcao)
                    println("$novaOpcao Adicionada com sucesso.")

                } else println("Opção inválida, tente novamente.")
            }
            "4" ->{
                println("Saindo...")
                continuar = false
            }
            else ->  println("Opção Inválida")
        }
    }

}

fun main() {
    novaOpcao()

}