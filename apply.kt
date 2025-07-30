package EstruturaDeDados_Listas

fun main() {

    data class Pessoa( var nome: String = "" , var idade: Int = 0)

    val pessoas = listOf(

        Pessoa().apply {
            nome = "Rodrigo"
            idade = 30
        },

        Pessoa().apply {
            nome = "Liza"
            idade = 28
        },

        Pessoa().apply {
            nome = "Edjane"
            idade = 50
        }
    )

    pessoas.forEachIndexed { index, nomeIdade ->
        println("${index+1}: ${nomeIdade.nome}, ${nomeIdade.idade} anos")
    }
    /*
    Saida:
    1: Rodrigo, 30 anos
    2: Liza, 28 anos
    3: Edjane, 50 anos
    */
}