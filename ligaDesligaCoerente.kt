package POO_2025

class Eletricidade(var energia: Boolean){

    fun ligarLuz(): String{
        if (energia) {
            return "A luz está ligada"
        }
        return "A luz está apagada"
    }

}

fun main() {

    val energia = Eletricidade(false)

    println(energia.ligarLuz())

}