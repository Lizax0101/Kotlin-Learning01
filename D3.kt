package EstruturaDeDados_Listas.Desafios

val pratosDia = listOf("Lasanha", "Escondidinho", "Camarão Empanado")

fun exibirPratos() {
    println("Pratos do Dia: ")
    pratosDia.forEachIndexed { posicao, pratos ->
        println(" ${posicao}.$pratos")
        //para a posição iniciar em 1 -> ${posicao + 1}
    }
    println("\n Escolha sua bebida favorita! \n Aqui!")
}


fun main() {
    exibirPratos()
}