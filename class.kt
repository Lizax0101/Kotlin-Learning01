// uma class tem comportamentos e atributos
// classe gera objetos
class Pessoa(val anoNascimento: Int, var nome: String) {

    var corOlhos = "" // faz parte de toda classe esse atributo

    //comportamento
    //metodos
    fun dormir() {

    }

    //comportamento
    //metodos
    fun acordar() {

    }

}
fun main() {
    // | aqui estou instanciando uma classe, quando coloco os parenteses na frente do nome da minha classe
    // classe instancia objetos
    var pessoa: Pessoa = Pessoa(
        1987,
        "Alex"
    ) //quando fazemos a instancia, reservamos um espaço na memoria que vai ser reservado as informações da pessoa
    //esse é meu objeto -> pessoa

    println(pessoa.anoNascimento) //apenas printando
    println("meu nome é: ${pessoa.nome}") // expressao dentro da string

    pessoa.acordar()
    pessoa.dormir()

}