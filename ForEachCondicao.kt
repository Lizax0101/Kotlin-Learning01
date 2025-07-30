package EstruturaDeDados_Listas

fun main() {
    val numero = listOf(0, 1, 2, 3) // atribuindo uma lista a variavel numero

   numero.forEach { it -> if (it % 2 == 1) { println("$it é impar") } else { println("$it é par") } // acessando a variavel numero com forEach
        //condição se o resto da divisao do item por 2 for igual a 1, exibe impar. Senão exibe par
    }
}

/**
 * Tambem pode ser escrito assim para otimizar:
 *
 * val tipo = if(item % 2 == 0) "par" else "impar"
 * println($item, $tipo)
 */
