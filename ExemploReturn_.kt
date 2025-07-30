fun quilometrosParaMilhas(km: Double): Double{
    return km * 0.621371
}

fun conversaoEmString(km: Double): String{
    val milhas = quilometrosParaMilhas(km)// isso daqui é uma chama de funcao
    //valor esta sendo armazenado em val milhas,
    //o valor recebido via parametro é passado aqui para segunda função
    //que então executa a frmula e retorna o valor
    return " O valor de $km  km é igual a $milhas milhas"

}

fun main(){

    val km= 2.0//valor passado como argumento
    //paramentro de quilometrosParaMilhas sendo passado aqui, e o valor
    //sendo armazenado na variavel milhas
    println(conversaoEmString(km))
    //val km esta sendo passada como argumento


    //milhas armazena o retorno da função quilometrosParaMilhas





}