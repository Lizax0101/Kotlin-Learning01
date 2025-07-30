package EstruturaDeDados_Listas

fun novasFrutas(listaDe: Collection<String>) {// usando collection porque so quero mostrar uma lista sem nenhma modificação
    for (fruta in listaDe) {

    //println(fruta) // com esse println foi exibido a lista duas vezes, uma daqui do for e outra do forEachIndexed
    }
    println("Lista 01:\n")
    val acessando = listaDe.forEachIndexed { posicao, minhasFrutas -> println("${posicao + 1}.$minhasFrutas") }


   // coloquei esse trecho de codigo dentro do for para testar, mas ele imprimiu 5 vezes a mesma lista,
  // porque para cada fruta na lista ele vai printar o que colocamos abaixo no for.

    println("Contém Cacau na lista?")
    println("${listaDe.contains("Cacau")}")
}
fun main() {
    val frutinhas = listOf("Cacau", "Acerola", "Acerola", "Manga", "Morango\n")
    novasFrutas(frutinhas)

    val frutinhas1 = setOf(frutinhas)// dessa forma temos um setOf que contem um Lista dentro dele como UM UNICO ELEMENTO
    // e não os elementos individualmente então a duplicata sera exibida na forma de baixo não.
    println(frutinhas1)

    println(frutinhas.toSet())// Cria um Set com os elementos únicos da lista
}