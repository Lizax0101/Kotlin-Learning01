package EstruturaDeDados_Listas

fun checkEntrada() {
    var idade: Int

    do {
        println("Qual sua idade: ")
        idade = readln().toInt()

        if (idade < 18) {
            println("Menor de idade")
        }

    } while (idade < 18)
    println("Entrada permitida")
}

fun main(){
    checkEntrada()
}












//readln - nunca retorna nulo
//readLine - val idade = readLine()!!.toInt() precisa usar o operador de não nulo
// val idade = readLine()!!.toInt() ( ou assim )