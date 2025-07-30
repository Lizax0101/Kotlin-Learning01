package EstruturaDeDados_Listas

fun minhasCompras() {
    val deHoje = mutableMapOf(
        "Blusa" to 100,
        "Tenis" to 250,
        "Calça" to 80
    )

    val lisStringBui = deHoje.map { deHoje ->
        StringBuilder().apply {
            append("Nome:")
            append(deHoje.key)
            append(", Preço: R$%.2f".format(deHoje.value))
        }.toString()
    }
    lisStringBui.forEach { println(it) }
}

fun main() {
    minhasCompras()
}