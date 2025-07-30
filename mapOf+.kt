package EstruturaDeDados_Listas

val usuarios1 = mapOf(
    "joao" to 18,
    "maria" to 22,
    "ana" to 17,
    "rodrigo" to 30
)
fun main() {
    val todosMaiores = usuarios1.all { it.key != "joao" }
    println(todosMaiores) // false (porque todos são diferentes de joao)

    val tem18 = usuarios1.values.any() {it == 18}
    println(tem18) // true joão tem 18 anos

    val maiorQ3 = usuarios1.keys.all { it.length > 3 }
    println(maiorQ3) // False ana tem 3 letras

    val numeroDeUsers = usuarios1.keys.size
    println(numeroDeUsers) // 4
}