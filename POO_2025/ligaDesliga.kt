package POO_2025

class Interruptorr(var luzSala: Boolean, var luzQuarto: Boolean) {

    fun ligaDesliga() {
        if (luzSala)
            return println("$luzSala ligada ")
        return println("$luzQuarto desligada ")
    }
}


fun main() {

    val interruptor = Interruptorr(true, false)
    interruptor.ligaDesliga()

}