fun divisao(a: Int, b: Int): Int {
    return a / b

}

fun triplicandoSoma(a: Int, b: Int): Int {
    val resultadoSoma = divisao(a, b)
    return resultadoSoma * 3
}
fun triplicandoSoma1(a: Int, b: Int): String {
    val resultadoSoma = divisao(a, b)
    return "Resultado: ${resultadoSoma * 3}"
}

fun main(){
    println(triplicandoSoma(1, 1))
    println(triplicandoSoma1(1, 1))
}