package AssuntosKT.RECE

class Closett(val roupa: String, val cores: String, val quant: Int) {

    fun info() {
        "Receiver da lambda".apply {
            println(this)               // a string receiver
           // println(this@Closet.roupa)// acessa o campo da instância de Closet
            //println(this@Closet.cores)// acessa o campo da instância de Closet
           // println(this@Closet.quant)// acessa o campo da instância de Closet

        }
    }
}

fun main() {
    val closet = Closet("Vestido", "Vermelho", 4)
    closet.info()
}