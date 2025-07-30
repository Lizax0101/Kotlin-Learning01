package EstruturaDeDados_Listas.Desafios

fun listCores() {
    val cores = listOf("Azul", "Preto", "Verde")

    while (!cores.contains("Amarelo")) {

        println("A cor não está na lista.")
        break
    }

}

fun main() {
    listCores()
}