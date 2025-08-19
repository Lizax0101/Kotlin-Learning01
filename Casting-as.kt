package AssuntosKT.RECE

open class Ppessoa(val nome: String)
class Motoristaa(nome: String, val carro: String) : Ppessoa(nome)
class Ppassageiro(nome: String, val destino: String) : Ppessoa(nome)

fun main() {
    val pessoa: Ppessoa = Motoristaa("Carlos", "Fiat Uno")
    val pessoa2: Ppessoa = Ppassageiro("Passageiro teste", "Endereço teste")

    val motorista = pessoa as Motoristaa // forçado
    println("Motorista: ${motorista.nome}, Carro: ${motorista.carro}")

    val passageiro = pessoa2 as Ppassageiro
    println("Passageiro: ${passageiro.nome}, Destino: ${passageiro.destino}")


    /**
     * Forçado (as)
     * Eu TENHO CERTEZA que essa Pessoa é um Motorista

     * val pessoa: Ppessoa = Motoristaa("Carlos", "Fiat Uno")
     * val passageiro = pessoa as Ppassageiro
     *
     * pessoa é do tipo motorista então não é possivel enxergar ela como passageiro
     *
     * Este elenco nunca terá sucesso.
     * O elenco sempre falhará, A variável pessoa é do tipo Pessoa, mas o objeto real dentro dela é Motorista.
     */
}
