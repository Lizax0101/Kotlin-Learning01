package EstruturaDeDados_Listas

val usuarios = mapOf(
    "joao" to 18,
    "maria" to 22,
    "ana" to 17,
    "rodrigo" to 30
)

fun main() {
    val todosMaiores = usuarios.all { it.value > 18 }
    println(todosMaiores) // false (porque Ana e João têm <= 18)

}