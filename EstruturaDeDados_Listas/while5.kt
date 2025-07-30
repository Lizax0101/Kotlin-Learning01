package EstruturaDeDados_List

fun main() {


    println("Digite um número:")
    val numero = readln().toInt()
    var contar = 1 // o contador inicia do 1

    while (contar <= numero) {//repete enquanto o contador for menor ou igual ao número digitado
        println(contar)// Mostra o número atual
        contar++// aumenta o contador de 1 em 1

    }

}
// nesse caso o numero que eu digitar ele vai contar adicionando mais 1, mais 1 até chegar ao numero que digitei.
//exemplo digitei 2 - ele vai fazer 1,2
//quando contar fica maior que o número digitado, o loop para automaticamente.


