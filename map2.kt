package EstruturaDeDados_Listas

fun main() {

    val objetos = mapOf("caneta" to 1, "lapis" to 2)

    val qual = objetos.any { it.key != "borracha" }
    println(qual)
    val temCaneta = objetos.values.any() { it == 1 }
    print(temCaneta)
}
