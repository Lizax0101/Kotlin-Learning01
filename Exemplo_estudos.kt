fun mercado() {

    val frutasVermelhas = listOf("morango", "cereja", "amora", "melancia")

    print("Digite uma fruta vermelha: ")
    val fruta1 = readlnOrNull()
    print("Digite OUTRA  fruta vermelha:  ")
    val fruta2 = readlnOrNull()

    if (fruta1 == null  || fruta1 !in frutasVermelhas){
        println("Fruta $fruta1 é inválida.")
        return
    }
    if (fruta2 == null  || fruta2 !in frutasVermelhas){
        println("Fruta $fruta2 é inválida.")
        return
    }

    println("As frutas $fruta1 e $fruta2 estão disponíveis: \n")

    println("Listando as frutas disponíveis:\n ")
    for (i in frutasVermelhas){
        println("Disponível: $i")
    }


}
fun main(){
    mercado()
}