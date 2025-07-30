package EstruturaDeDados_Listas.Desafios

fun imparPar(num: List<Int>, condicao: (Int) -> Boolean): Boolean {
    return num.all(condicao)
}

fun main() {
    val impar = listOf(1,3,5)
    val par = listOf(2,4,6,-1)

    val impares = imparPar(impar){it % 2 != 0}

    val pares = imparPar(par){it % 2 == 0}

    if (pares) {
        println("Todos números são pares.")
    }

    if (impares){
        println("Todos números são Ímpares.")

    }

}