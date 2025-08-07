package EstruturaDeDados_Listas.Desafios

val cardapio = listOf("Arroz", "Feijão", "Frango", "Suco de laranja")

fun exibirCardapio() {
    //cardapio.forEach { println("Cardápio do dia: - $it") }
    //dessa forma com a string"cardapiop do dia dentro do forEach, na hora de imprimir, o compilador vai imprimir três  vezes a frase com itens diferentes.


    println("Cardápio do Dia:") // → imprime uma vez só o título.
    cardapio.forEach { println(" - $it") }
    // para imprimir de forma organizada a frase em questão precisa ser impressa fora do forEach, então sera imprimido uma unica vez no topo.
}

fun main() {
    exibirCardapio()
}
