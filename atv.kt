package EstruturaDeDados_Listas


fun comeca(nome: String): Boolean {
    return nome.startsWith("a")

}

fun main() {
    val nomes = setOf("ana", "ana", "julia", "gisele", "alexia")
    val encontrou = nomes.filter(::comeca)
    println("Nomes que começam com 'a': $encontrou".uppercase())
}