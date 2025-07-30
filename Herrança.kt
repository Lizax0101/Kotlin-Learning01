open class Eletronico(var marca: String) {
    
    private fun ativarCorrente() {}

    fun ligar() {
        ativarCorrente()
    }

    fun desligar() {}

}

class Computador(marca: String) : Eletronico(marca) {
    fun instalarSoft() {}
    fun processar() {} // comportamento dferente


}

fun main() {
    var a: Computador = Computador("Mac")
    a.ligar()
    a.desligar()
}