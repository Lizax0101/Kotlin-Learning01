package EstruturaDeDados_Listas

fun novasFrutas1(listaDe: Collection<String>) {
    for (fruta in listaDe) {
    }
    println("Lista 01:\n")
    val acessando = listaDe.forEachIndexed { posicao, minhasFrutas -> println("${posicao + 1}.$minhasFrutas") }

    println("Contém Cacau na lista?")
    println("${listaDe.contains("Cacau")}")
}

fun main() {
    val frutinhas = listOf("Cacau", "Acerola", "Acerola", "Manga", "Morango\n")
    novasFrutas(frutinhas)

    val frutinhas1 = setOf(frutinhas)
    println(frutinhas1)

    println(frutinhas.toSet())

}