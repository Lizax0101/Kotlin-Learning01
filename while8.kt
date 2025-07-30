package EstruturaDeDados_Listas


fun comprass() {

    val lista = listOf("feijao", "arroz", "açucar")

    while (true) {
        println("Digite um produto: ")
        val produto = readln()

        if (produto in lista) {
            println("$produto na lista")
            break
        } else {
            println("$produto não está na lista, tente novamente...")

        }
    }
}

fun main() {
    comprass()
}