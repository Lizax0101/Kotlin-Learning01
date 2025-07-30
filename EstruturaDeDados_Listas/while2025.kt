package EstruturaDeDados_Listas

fun vericacao() {

    print("Digite a senha:")
    var senha = readln()
    while (senha != "1234") {
        println("Senha incorreta. Tente de novo:")
        senha = readln()
    }
}
fun main(){
    vericacao()

}