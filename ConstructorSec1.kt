package AssuntosKT.RECE

class Calculadora {

    constructor(a: Int, b: Int) { // serve apenas p executar a soma
        println("Somando:${a + b}")
    }

    constructor(a: Double, b: Double) { // serve apenas p multiplicar sem guardar nenhum valor
        println("Multiplicando: ${a * b}")
    }
}

fun main() {
    Calculadora(3, 5)
    Calculadora(3.20, 7.50)
}