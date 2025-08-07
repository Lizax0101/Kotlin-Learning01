package EstruturaDeDados_Listas.Desafios

fun referencia1(a: MutableList<String>, lambda: (String) -> Boolean): Boolean {
    return a.any(lambda)
}

/*
fun naoTemGato(it: String): Boolean {
    return (it != "gato" || it != "girafa")
}*/

fun main() {
    val b = mutableListOf("cachorro", "girafa", "leao", "gato")

    //println(referencia(b, ::naoTemGato))
    println(referencia1(b){it != "gato" && it != "girafa"})
}
