package AssuntosKT.RECE

open class Entrada(val nome: String)

// toda classe que herda de Entrada, também é uma Entrada com nome.

class Verificacao(nome: String, val idade: Int) : Entrada(nome)
// a classe filha Verificacao é uma Entrada com uma propriedade a mais, idade.

class NovaClasse(nome: String, val umDouble: Double) : Entrada(nome)
// agora NovaClasse também é uma Entrada

fun main() {

    println("\nSaidas:")
    val entrada: Entrada = Verificacao("Lua", 18)
    val verificacao: Verificacao? = entrada as? Verificacao
    println("Verificacao idade: ${verificacao?.idade}")

    val entrada1: Entrada = Entrada("Aqui realmente guarda a propria entrada")
    val verificacao1: Verificacao? = entrada1 as? Verificacao // null
    println("Verificacao1: ${verificacao1?.nome}")

    val entrada2: Entrada = NovaClasse("Teste", 12.0)
    val verificacao2: Verificacao? = entrada2 as? Verificacao // vai dar null pq não é Verificacao
    val novaClasse: NovaClasse? = entrada2 as? NovaClasse     // aqui funciona porque é realmente NovaClasse

    println("verificacao2: ${verificacao2?.nome}")
    println("novaClasse: ${novaClasse?.nome}, double: ${novaClasse?.umDouble}")
}


    /**
     * Criando os objetos:
     * entrada do tipo Entrada, mas por dentro ela guarda
     * um objeto Verificação.
     *
     * val verificacao: Verificacao? = entrada as? Verificacao
     * aqui, é como se a gente tentasse abrir a Entrada e ver se dentro tem mesmo uma Verificação
     * como realmente tem, o kotlin deixa transformar, agora a verificação é do tipo Verificação e voce pode acessar a idade dentro dela.
     *
     * O ?. é usado porque as? pode devolver null se não for Verificacao.
     *
     *  o casting (ou conversão de tipo)
     *
     *  Importante:
     *
     *  as só funciona se as classes tiverem relação de herança.
     *
     * Se não tiver relação → você precisa converter manualmente criando um novo
     * objeto com base no outro (como uma espécie de “tradução” de dados).
     */
