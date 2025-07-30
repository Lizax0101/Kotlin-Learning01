fun main() {
    val usuarioCorreto = "Lizandra"
    val senhaCorreta = "12345"

    print("Digite seu usuario: ")
    val usuario = readlnOrNull() ?: ""

    print("Digite sua senha: ")
    val senha = readlnOrNull() ?: ""

    if (usuario == usuarioCorreto && senha == senhaCorreta) {
        println("Loguin bem-sucedido! Bem-Vindo(a), $usuario.")

    } else {
        println("Usuario ou senha incorretos. Tente novamente! ")
    }


}
//stopping studying now (parando de estudar agora às 00:41pm 30/10/2024)