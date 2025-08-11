package AssuntosKT.RECE

class Closet(val roupa: String, val cores: String, val quant: Int) {

    fun info() { // lambda função anonima(sem nome)
        val recebeLambda: String.() -> Unit = {
            println(this)
            println(this@Closet.roupa)
            println(this@Closet.cores)
            println(this@Closet.quant)
        }
        "Receiver da lambda".recebeLambda()//aqui, é que a lambda é executada, com a String como receiver
    }
}

fun main() {
    val closet = Closet("Vestido", "Vermelho", 4)

    closet.info()
}