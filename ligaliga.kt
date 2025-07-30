package POO_2025

class Interruptor(var comodo: String, var energia: Boolean) {

    fun luz(): String {
        if (energia) {
            return "A luz da $comodo está Ligada"
        }
        return "A luz da ${comodo} está desligada"
    }

}

fun main() {

    val interruptor = Interruptor("Sala", false)
    val interruptor2 = Interruptor("Cozinha", true)

    println(interruptor.luz())
    println(interruptor2.luz())
}