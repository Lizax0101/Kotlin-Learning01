package EstruturaDeDados_Listas

fun loguin1() {

    println("Digite usuario: ")
    val usuario = readln()

    println("digite sua senha de 4 digitos:")
    val senha = readln()

    while (usuario != "Admin" && senha != "1234") {
        println("Usuário ou senha incorreta")
        break
    }
        //println("LOGADO")
}

fun main() {
    loguin1()
}