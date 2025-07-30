fun retornoSoma(s: Int):Int{
    return  s + 10
}

fun calcularSoma(somaP: Int): Int{
    val resultSoma = retornoSoma(somaP)//chamada da funcao retornoSoma
    //valor de soma sendo ar
    return resultSoma
}

fun main() {

    val soma = 20

    println(calcularSoma(soma))
}