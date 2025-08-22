package AssuntosKT.RECE

open class Cantores(val nome: String)
class Musicas(nome: String, val sentir: String) : Cantores(nome)
class Cores(nome: String, val cor: String) : Cantores(nome)

fun main() {
    val lista: List<Cantores> = listOf(
        Musicas("no surprises", "reflexiva"),
        Cores("Close to you", "bordô"), Cantores("outros cantores")
    )
    lista.forEach { musicas ->
        val musica = musicas as? Musicas
        println("SAIDA:${musica?.nome} me faz sentir: ${musica?.sentir}")
    }
}

/**
 * aqui quando musica não é musica retorna null
 * cantor é uma musica ? não - null
 * musica é uma musica ? sim - retorna a msg com acesso as propriedades
 * cor é uma musica ? não - null
 */