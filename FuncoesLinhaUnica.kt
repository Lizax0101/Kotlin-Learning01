fun main() {
    helloWorld()
    println("A soma de 10 6 5 é: ${soma(10, 5)}")
    println(divisao(2.5f, 5.2f))

}

fun soma(a: Int, b: Int): Int {
    return (a + b)

}

fun soma2(a: Int, b: Int) = (a + b)

//essa função esta simplicada, é a mesma que soma.

fun helloWorld() = println("Ola Mundo, Good Morning")
//funcao ja inicializada

fun divisao(a: Float, b: Float) = (a / b)
//funcao sem retorno explicito