class Carro(val modelo: String) {
    fun carro(modelo: String): Carro {
        return Carro(modelo)
    }
}

fun main() {

// c1 é um objeto da classe Carro
    // val c1 = Carro("")
    // acima está criando um objeto (instância)
    // da classe Carro com o construtor que recebe uma String.

    val c1 = Carro("gol10")
    val c2 = c1.carro("Gol")

    c1.modelo
    c2.modelo
    println(c1.modelo)
    println(c2.modelo)
}