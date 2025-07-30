package EstruturaDeDados_Listas

fun main() {
    val nomes = listOf("Jose", "Jesus", "Gilson", "Eduardo", "Janete")
    val filtre = nomes.filter { it.startsWith("J") }
    println("Filtre os nomes começados com J:\n")
    print(filtre)

    println("Contem EDUARDO na lista:\n")
    val contem = nomes.contains("Eduardo")
    println(contem)

    val transforme = nomes.map { it.uppercase() }
    println("Transforme cada item da lista em nomes com letra MAIUSCULA:\n")
    print(transforme)

}

