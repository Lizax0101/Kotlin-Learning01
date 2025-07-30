package EstruturaDeDados_Listas

fun main() {
    var continuar = true

    val lista =  mutableListOf("Arroz", "Feijão", "Leite")

    while (continuar) {

        println(
            """
        Digite uma das opções a seguir:
        1 - Listar produtos
        2 - Remover Produtos
        sair
    """.trimIndent()
        )

        print("Opção: ")
        val opcao = readln().trim()

        when (opcao){
            "1" -> {
                println("Listando os Produtos")
                lista.forEachIndexed { index, item -> println("${index + 1} - $item") }}

            "2" -> {
                if (lista.isEmpty()){
                    println("Não a nada para remover.")
                }
                println("Listando os Produtos.")
                lista.forEachIndexed { index, item -> println("${index+1} - $item") }
                println("Escolha qual produto remover: ")
                val entrada = readln()
                val indice = entrada.toIntOrNull()
                if (indice != null && indice in 1..lista.size){
                    val removido = lista.removeAt(indice -1)
                    println("$removido removido com sucesso.")
                } else println("Número é inválido")
            }

            "sair" -> {
                println("Saindo...")
                continuar = false
            }
        }

        println()

    }
}