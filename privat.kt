package Assuntos

open class Casa private constructor() {
    object Dentro {
        val nome = "estou dentro do object"
        val idade = 17
    }
    companion object{
        open fun metodo(){
            println("Metodo dentro do companion object")
        }
        open fun metodo2(){
            println("Metodo 2 dentro do companion object")
        }

    }
}