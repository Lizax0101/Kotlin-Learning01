package EstruturaDeDados_Listas

fun imparPar(num: List<Int>, condicao: (Int) -> Boolean): Boolean {
    return num.all(condicao)
}
fun imparPar1(num: List<Int>, condicao: (Int) -> Boolean): Boolean {
    return num.all(condicao)
}

fun main() {
    val impar = listOf(1, 3, 5)
    val par = listOf(2, 4, 6)

    val impares = imparPar1(impar) { it % 2 != 0 }
    println(impares)

    val pares = imparPar1(par) { it % 2 == 0 }
    println(pares)
}