package EstruturaDeDados_Listas.Desafios

fun candidatos() {
    val cand = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val candSelecionados = cand.also {
        println("lista original aqui $it")

        val selecionadosRetorno = it.map { cand -> "${cand * 3}" }
        println(selecionadosRetorno)
        println("Tamanho da lista original:${selecionadosRetorno.size}")
    }
    //println(cand)
}

fun main() {
    candidatos()
}