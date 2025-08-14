package AssuntosKT.RECE

abstract class Carro {
    abstract fun arrumaBanco(acao0: String)
    abstract fun colocaCinto(acao1: String)
    abstract fun arrumaRetrovisor(acao2: String)
    abstract fun peNoFreio(acao3: String)
    abstract fun embreagemAteFinal(acao4: String)
    abstract fun freioDmao(acao5: String)
    abstract fun ligarCarro(acao6: String)
    abstract fun primeiraMarcha(acao7: String)
}

class Dirigir : Carro() {
    override fun arrumaBanco(acao0: String) {
        println(acao0)
    }

    override fun colocaCinto(acao1: String) {
        println(acao1)
    }

    override fun arrumaRetrovisor(acao2: String) {
        println(acao2)
    }

    override fun peNoFreio(acao3: String) {
        println(acao3)
    }

    override fun embreagemAteFinal(acao4: String) {
        println(acao4)
    }

    override fun freioDmao(acao5: String) {
        println(acao5)
    }

    override fun ligarCarro(acao6: String) {
        println(acao6)
    }

    override fun primeiraMarcha(acao7: String) {
        println(acao7)
    }

    fun soltandoEmbreagem(acao8: String) {
        println(acao8)
    }
}

fun main() {
    println("Começe a dirigir seguindo esses 8 passos:\n".uppercase())
    val dirigir = Dirigir()
    dirigir.arrumaBanco("0 -Ajuste o banco.")
    dirigir.colocaCinto("1 -Coloque o cinto de segurança.")
    dirigir.arrumaRetrovisor("2 -Ajuste o retrovisor.")
    dirigir.peNoFreio("3 -Coloque o pé no freio.")
    dirigir.embreagemAteFinal("4 -Afunde o pé até o final na embreagem.")
    dirigir.freioDmao("5 -Abaixe o freio de mão.")
    dirigir.ligarCarro("6 -Vire a chave e ligue o carro.")
    dirigir.primeiraMarcha("7 -Passe a primeira marcha: puxe para a esquerda, depois empurre para frente.")
    dirigir.soltandoEmbreagem("8 -Vá soltando a embreagem devagar e pronto, você está dirigindo. PARABÉNS!")



}
