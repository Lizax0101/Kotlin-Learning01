package EstruturaDeDados_Listas

fun cidades() {
    val bairros = mutableListOf("boa viagem", "piedade", "prazeres", "centro", "iputinga")

    while (true) {
        println("Qual seu bairro: ".uppercase())
        bairros.forEachIndexed { posicao, doBairro -> println("${posicao + 1} - $doBairro") }

        println("Digite um numero de 1 á 5: ")
        val digitado = readln()
        val converter = digitado.toIntOrNull()

        if (converter != null && converter in 1..bairros.size) {
            println("Bairro $converter cadastrado. ")
        } else {
            println("Número digitado não está na lista.\n")
        }

      // valida se a entrada esta vazia ou o que foi digitado não esta na lista
        if (digitado.isBlank() || digitado !in bairros) {
            println("Adicione seu bairro, caso não esteja na lista: ")
            val adicionar = readln()
            val adicionado = bairros.add(adicionar)
            println("Adicionado com sucesso!\n ")

            //exibição nova lista
            println("Lista de bairros atualizada:\n ")
            bairros.forEachIndexed { index, bairro -> println("${index + 1} - $bairro") }
        }
        // voce pode sair digitando zero ou apartar qualquer outra coisa e consultar a lista novamente
        println("Para sair digite '0(zero)' e pressione ENTER: ")
        val sair = readln()
        val conversao = sair.toIntOrNull()
        if (conversao == 0) {
            println("Você digitou $sair Saindo...")
            break
        }
    }
}

fun main() {
    cidades()
}