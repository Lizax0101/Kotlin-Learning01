fun main() {

    println("Jogada 1: ")
    val jogada1 = readlnOrNull()?.toIntOrNull()

    println("Jogada 2: ")
    val jogada2 = readlnOrNull()?.toIntOrNull()

    if (jogada1 != null && jogada1 >= 0 && jogada2 != null && jogada2 >= 0) {
// aqui estamos tratando valores negativos, valores nulos
        if (jogada1 != jogada2) {
            println("Não somos iguais")
        } else {
            println("Somos iguais")
            // else dentro do bloco do primeiro if
        }
    } else {
        println("Os valores digitados são incorretos!")
        return
    }
}
