package Assuntos

class Aniversario private constructor(val data: Int) {

    companion object {
        fun parabens(data: Int): Aniversario {
            println("Completei $data anos de idade.")
            return Aniversario(data)
        }

    }
}
fun main() {
    //val aniversario = Aniversario() // Não pode

    val aniversario= Aniversario.parabens(30)

    println("Meu nome é Rodrigo e hoje é meu aniversaio de ${aniversario.data} anos")
}