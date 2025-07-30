package EstruturaDeDados_Listas

fun dobrarNumeros() {
    val list = setOf(1, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10)
    val dobrar = list.map { it * 2 }
    println(dobrar)
    println()


    println("Posição + resultado do resto da divisão de cada item por 3 igual a 0:\n ")
    val filtrar =
        dobrar.filter { it % 3 == 0 }.forEachIndexed { posicao, numero -> println("${posicao + 1} - $numero") }


}

fun main() {

    dobrarNumeros()

}