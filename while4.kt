package EstruturaDeDados_Listas

fun loguin() {
    var usuario: String  = ""
    var senha: String  =""

    while (usuario != "Admin" || senha != "1234") {
        usuario
         senha

        println("Digite usuario: ")
        usuario = readln()

        println("digite sua senha de 4 digitos:")
        senha = readln()

    }
    println("Logado com sucesso")

}

fun main() {
    loguin()
}