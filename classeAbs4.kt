package AssuntosKT.RECE


// classe abstrata:não pode ser instanciada diretamente
abstract class Mae {
    //Propriedade abstrata: não tem valor definido aqui, deve ser implementada pelas subclasses obrigatoriamente
    abstract val nome: String

    //Metódo abstrato: não tem corpo, deve ser implementado pelas subsclasses obrigatoriamente
    abstract fun calcular(): Double
}

// subclasse que implementa os membros abstratos da classe mae
class Filha(private val num1: Double) : Mae() {

    //Implementação da propriedade abstrata 'nome' usando override
    override val nome = "Classe Filha, eu sou a propriedade abstrata da classe mãe, implementada com overide"

    // Implementação do metodo abstrato da classe mãe
    override fun calcular() = num1 * num1// metodo implementado
}

// tambem subclasse
// um objeto
class Filhinha(private val num2: Double) : Mae() {

    override val nome = "Classe Filhinha,eu sou a propriedade da classe mãe, implementada com override"
    override fun calcular() = num2 + num2// metodo implementado


}

fun main() {
    val objeto: List<Mae> = listOf( // aqui polimorfismo
        //val objeto é a instancia (objetos concretos na memória)
        Filha(2.0),
        Filhinha(4.4)
    )
    objeto.forEach {
        println("Informação:${it.nome}\n-Resultado do metodo sobrescristo: ${it.calcular()}\n")
    }
}

/*
 * No main, você trata todos como Mae, mas eles respondem com seu próprio comportamento — isso é polimorfismo.
 * classe a bstrata não pode instanciar diretamente assim,
 * por exemplo: val objeto = Mae(), precisa ser assim: val objeto:Mae = Filha().
 */
