open class Amigos(val nome: String)

class IdadeAmigos : Amigos {
    var idade: Int = 0
    //idade inicializada,propriedade subclasse

    constructor(nome: String, idade: Int) : super(nome) {
        // idade como parametro local do constructor
        println(" const 1 nome + idade do amigo")
        this.idade = idade
        //atribuindo o valor do parametro a propriedade da subclasse IdadeAmigos
    }

    // constructor com parametro da subclasse
    constructor(idade: Int) : super("Parametro superclasse"){
        println(" const 2 só com um parametro: idade")
        this.idade = idade
    }

    fun mostrar() {
        println("$nome, $idade")
    }
}

fun main() {
    val id = IdadeAmigos("NOME", 12)
    id.mostrar()

    val id2 = IdadeAmigos("nome", 8)
    id2.mostrar()
}