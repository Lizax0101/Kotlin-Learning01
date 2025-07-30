package EstruturaDeDados_Listas
fun main() {
    var nome: String = ""
    var senha: String = ""


    while (nome != "Rodrigo" || senha != "1234")    {

        println("Digite seu nome: ")
        nome =  readln()
        println("Digite sua senha: ")
        senha =  readln()

    }
    println("Login Bem-Sucedido")

}