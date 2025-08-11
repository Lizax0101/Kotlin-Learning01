package AssuntosKT.RECE

interface Teste {
    fun falar(nome: String)

    fun despedida() {
        println("Ultimo contato: Até outro dia!")
    }
}

class Pessoa : Teste {
    override fun falar(nome: String) {
        println("Primeiro contato: Olá, $nome já vou indo")

    }

    override fun despedida() {
        super.despedida() // chama o metodo padrão
        println("Qualquer coisa me chama no whatsapp!") // se quiser adicionar algo mais na msg
    }
}

fun main() {
    val p = Pessoa()
    p.falar("Liza")
    p.despedida()

}