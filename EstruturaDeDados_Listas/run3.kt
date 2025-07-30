fun main() {
    val nomes = listOf("Rodrigo", "Liza", "Lucas", "Edjane")

    val resultado = nomes.run {


        val comL = filter { it.startsWith("L") } //1°


        val maiorQ5 = filter { it.length > 5 } //2°


        val primeiroOuNulo = firstOrNull{ //3°
            it.startsWith("L")

        }?:"Não tem L"

        "${comL.joinToString()}: ${maiorQ5.joinToString()} : $primeiroOuNulo" //retornos

    }

    println(resultado)

}