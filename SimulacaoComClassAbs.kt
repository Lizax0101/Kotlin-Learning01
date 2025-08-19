package AssuntosKT.RECE

abstract class APessoa(val nome: String) {
    abstract fun exibirInfo()// metodo abstrato sem corpo
}

class Passageiro(nome: String, val seuEndereco: String, val destino: String) : APessoa(nome) {
    override fun exibirInfo() {// implementação obrigatoria por conta da superclass, os demais tambem precisam implementar
        println("Passageiro: $nome")
        println("Local Atual: $seuEndereco ➝ Destino: $destino ")
    }
}

class Motorista(nome: String, private val carro: String) : APessoa(nome) {
    override fun exibirInfo() {
        println("Motorista: $nome  ➝ Carro: $carro ")
    }
}

class Corrida(
    private val passageiro: Passageiro,
    private val motorista: Motorista,
    private val km: Double
) {
    private val precokm = 2.5
    private val valor = km * precokm

    fun detalhesCorrida() {
        println("====== Corrida criada ======")
        passageiro.exibirInfo()
        motorista.exibirInfo()
        println("Distância: $km")
        println("Valor total: R$$valor")
        println("===========================\n")
    }
}

fun main() {
    val passageiro1 = Passageiro("Lyz", "Shopping Interlagos", "Vila Maria,n°1001")
    val motorista1 = Motorista("Santos", "Argo-P0EY")
    val corrida1 = Corrida(passageiro1, motorista1, 10.0)
    corrida1.detalhesCorrida()
}