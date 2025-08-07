package EstruturaDeDados_Listas.Desafios

fun imparParr(num: List<Int>, condicao: (Int) -> Boolean): Boolean {
    return num.all(condicao)
}

fun main() {
    val impar = listOf(1,3,5,6)
    val par = listOf(2,4,6,5)

    val impares = imparParr(impar){it % 2 != 0}

    val pares = imparParr(par){it % 2 == 0}

    if (pares) {
        println("Todos números são pares.")

    }else println("Números não conferem.")

    if (impares){
        println("Todos números são Ímpares.")

    }else println("Números não conferem.")

}
