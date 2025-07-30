package EstruturaDeDados_Listas.Desafios

fun referencia(a: MutableList<String>, lambda: (String) -> Boolean): Boolean {
    return a.any(lambda)
}


fun naoTemGato(it: String): Boolean {
    return (it != "gato" && it == "girafa")// vai retornar true p qualquer string diferente de gato
//se o item não for gato E for girafa -> retorne true


}

fun main() {
    val b = mutableListOf("cachorro", "girafa", "leao")
    println(referencia(b, ::naoTemGato))
}


/**
 * p lembrar ->  return (it != "gato" && it == "girafa")
 *
 *  naoTemGato("girafa")   // true  ✅ (não é "gato" E é "girafa")
 *  naoTemGato("gato")     // false ❌ (é "gato")
 *  naoTemGato("leao")     // false ❌ (não é "gato", mas também não é "girafa")
 */