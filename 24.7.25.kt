open class Veiculo {
    open val tipo = "Desconhecido"
}

class Moto : Veiculo() {
    override val tipo = "Moto"

    fun mostrarTipo() {
        println("Tipo atual: $tipo")
        println("Tipo da superclasse: ${super.tipo}")
    }
}

fun main() {
    val veiculo = Moto()
    veiculo.mostrarTipo()

    val veiculoPoli: Veiculo = Moto()
    println(veiculoPoli.tipo)
}