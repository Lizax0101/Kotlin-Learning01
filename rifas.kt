package EstruturaDeDados_Listas

fun main() {

    val numeros = 0..99

    println("Números da Rifa:")


    val numerosRifa =  StringBuilder().apply {
        numeros.map { n ->
            append(n.toString().padStart(2, '0')).append(" ")
            if ((n + 1) % 10 == 0) appendLine()
        }
    }.toString()

    println(numerosRifa)
}