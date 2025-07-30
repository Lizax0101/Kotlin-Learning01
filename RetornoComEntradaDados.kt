fun retorno11(parametro: Int): Int {
    return parametro * 2
}

fun retorno12(multiplicar: Int): Int {
    val resultadoFuncao1 = retorno12(multiplicar)
    return resultadoFuncao1
}

fun main() {
    print("Informe um número para a multiplicação: ")
    val parametro = readln().toIntOrNull()
    if (parametro != null && parametro >= 0) {
        println(retorno12(parametro))
        return
    }
}