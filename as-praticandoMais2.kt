/**
 * package AssuntosKT.RECE
 *
 * open class Cantor(val nome: String)
 * class Musica(nome: String, val sentir: String) : Cantor(nome)
 * //class Cor(nome: String, val cor: String) : Cantor(nome)
 *
 * fun main() {
 *     val lista: List<Cantor> = listOf(
 *         Musica("no surprises", "reflexiva"),
 *         Cantor("Não sou uma musica, SOU UM CANTOR."))
 *
 *     lista.forEach { musicas ->
 *         val musica = musicas as? Musica
 *         val naoMusic = musica?.let {
 *             "Esta música: ${it.nome} me faz sentir: ${it.sentir}\n"
 *
 *         }?: "\nNão é música, é de outro tipo: ${musicas.nome}"
 *
 *
 *         println("SAIDA:${musica?.nome} me faz sentir: ${musica?.sentir}")
 *     }
 *
 * }
 */