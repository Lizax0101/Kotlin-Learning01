package AssuntosKT.RECE

class Aprovados(val nome: String, val pontuacao: Int) {
    init {
        println("Classificado: $nome\nPontuação: $pontuacao")
    }// roda sempre que o contrutor primario é chamado
}

fun main() {
    val lista = Aprovados("Lizandra", 1000)

}

