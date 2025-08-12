package AssuntosKT.RECE

class Frutas(val nome: String) {
    var preco: Int = 0

    constructor(nome: String, preco: Int) : this(nome){
        this.preco = preco
    }
}

fun main(){

    val f0 = Frutas("maça", 2)
    val f1 = Frutas("uva", 5)
    val f2 = Frutas("morango")

    println("${f0.nome}, ${f0.preco}")
    println("${f1.nome}, ${f1.preco}")
    println(f2.nome)

}

/**
 * f0 → objeto do tipo Frutas que representa "maça" com preço 2.
 *
 * f1 → objeto do tipo Frutas que representa "uva" com preço 5.
 *
 * f2 → objeto do tipo Frutas que representa "morango"
 *
 *
 * O Kotlin por baixo dos panos cria getters e setters para essas propriedades,
 * mas a sintaxe é simplificada para parecer que você está só pegando o valor.
 *
 *
 * O que são getters e setters?
 * Getter: é um método que retorna o valor de uma propriedade.
 * Exemplo: quando você faz f2.nome, na verdade está chamando internamente algo como getNome().
 *
 * Setter: é um método que atribui um valor à propriedade (só existe se a propriedade for mutável, ou seja, var).
 * Exemplo: quando você faz f2.preco = 10, internamente chama setPreco(10)
 */