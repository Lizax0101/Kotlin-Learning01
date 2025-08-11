package AssuntosKT.RECE

class Aluno {
    var nome: String
    var idade: Int

    constructor(nome: String) {
        this.nome = nome // no main so passando nome como argumento
        this.idade = 0
    }

    constructor(nome: String, idade: Int) {
        this.nome = nome 
        this.idade = idade
    }
}

fun main() {
    val aluno1 = Aluno("Rodrigo")
    val aluno2 = Aluno("Liza", 28)

    println("Aluno: ${aluno1.nome},  idade: ${aluno1.idade}")
    println("Aluno: ${aluno2.nome}, idade ${aluno2.idade}")
}

/**
 * Aluno → é o molde (classe).
 *
 * "Rodrigo" → é o valor que você está passando para o construtor dessa classe.
 *
 * aluno1 → é a variável de referência que aponta para a instância criada.
 *
 * Então aqui:
 *
 * Instância: o objeto Aluno que foi criado na memória com o nome "Rodrigo".
 *
 * Variável de referência: aluno1 (guarda o endereço dessa instância).
 *
 *
 * resumo
 *
 * Classe Aluno → molde
 * Construtor recebe "Rodrigo"
 * Cria o objeto na memória → [nome = "Rodrigo"]
 * aluno1 aponta para esse objeto
 *
 */