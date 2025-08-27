class Usuario private constructor(val nome: String, val idade: Int){

    //objeto complementar
    companion object{
        fun criar(nome: String, idade: Int): Usuario{
            return Usuario(nome, idade)
        }
    }
}

fun main(){

    //val u = Usuario : Aniversario() // não da certo, não é possivel instanciar um construtor privado diretamente, precisa fazer a instanci atraves do metodo de fabrica
    val u = Usuario.criar("Sou o metodo dentro do objeto complementar", 12)
    println("Propriedade NOME recebeu: ${u.nome}\nPropriedade IDADE recebeu: ${u.idade} anos")
}