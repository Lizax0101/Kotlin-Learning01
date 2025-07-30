package EstruturaDeDados_Listas

fun fazVerifica() {
    var senha: String
    do {
        println("Digite sua senha:")
        senha = readln()
    } while (senha != "1234")
}
fun main(){
    fazVerifica()
}