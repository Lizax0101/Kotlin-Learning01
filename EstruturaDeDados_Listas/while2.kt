package EstruturaDeDados_Listas

fun testee() {
    var resposta: String

    do {
        println("Digite 'ok' para continuar:")
        resposta = readLine() ?: ""

    } while (resposta != "ok")//true

    println("Obrigado!")

}

fun main() {
testee()
}
