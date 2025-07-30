fun main() {
    val lista = listOf(1,2,3)

    val result = lista.run {

        val soma = lista.sum()

        if (soma > 7){
            "É maior"

        } else
            "É menor"

    }

    println(result)

}