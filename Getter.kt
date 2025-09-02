package Assuntos

class GetterESetter {
    var nome: String = "Billy"
    val idade: Int = 18
}

fun main() {
    val instancia = GetterESetter()
    println(instancia.nome)// Getter em ação lendo a propriedade nome,e mostra o nome inicial BILLY
    instancia.nome = "Ayrim" // Setter em ação, alterando BILLY por Ayrim
    println(instancia.nome)

    println(instancia.idade) // só getter, val só ler não pode alterar
   // instancia.idade = 12 // erro idade não pode ser reatribuido o valor, é uma constante
}


/**
 * O instancia.nome na leitura chama o getter.
 *
 * O instancia.nome = "Ayrim" chama o setter.
 */