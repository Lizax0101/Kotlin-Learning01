package EstruturaDeDados_Listas

fun quando() {
    var continuar = true
    val menu = mutableListOf(
        "Dizer Olá",
        "Mensagem do dia",
        "Adicionar nova opção",
        "Encerrar Menu",

        )
    while (continuar) {

        menu.forEachIndexed {posicao, it -> println("${posicao+1} - $it ")}

        println("Digite aqui: ")
        val opcao = readln()
        when (opcao) {
            "1" -> println("Olá! tudo bem?\n")
            "2" -> println("Hoje é um otimo dia para aproveitar\n")

            "3" -> {
                println("Adicionar NOVA opção ao MENU:")// quero mostrar o menu atualizado com a nova opcao adicionada
                val addOpcao = readln().trim()
                if (addOpcao.isNotEmpty() && addOpcao !in menu) {
                    menu.add(addOpcao)
                  println("$addOpcao adicionado(o) com sucesso!\n")
                } else {
                    println("Mensagem vazia, voce não alterou nada.")
                }
            }

            "4" -> {
                println("Saindo..")
                continuar = false
            }

            else -> println("Opçao invalida!\n")
        }
    }
}

fun main() {
    quando()
}