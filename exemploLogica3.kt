fun main() {

    print("Digite sua idade: ")
    val idade = readln().toIntOrNull()
    val registrado = true

    if (idade != null && registrado) {

        if (boateClub(idade, registrado)) {
            println("Seja bem-vindo(a), divirta-se ")
        } else {
            println("Menor de idade é proibida a entrada!")
        }
    } else{
        println("Valor é inválido, tente novamente")
    }
}
fun boateClub(idade: Int, regist: Boolean): Boolean{

    return idade > 17 && regist
}