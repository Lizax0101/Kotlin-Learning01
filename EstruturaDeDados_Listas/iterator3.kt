package EstruturaDeDados_Listas

fun main() {
    val paises = listOf("Koreia", "Tokio", "China", "Tailandia")
    val percorrer = paises.iterator()

    while (percorrer.hasNext()) {
        val retornado = percorrer.next()
        println("País retornardo: $retornado")
        println("Tamanho da string retornada:${retornado.length}\n")
    }

}