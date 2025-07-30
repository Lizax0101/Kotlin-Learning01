package EstruturaDeDados_Listas

fun main() {
    //{ parâmetro(s) -> corpo da função }
    //(String) -> String: diz que essa função recebe string e retorna string.
    //{ seuNome -> "Olá, $seuNome!" }: É o corpo da lambda

    val entrada: (String) -> String = { seuNome -> "Ola, $seuNome" }
    println(entrada("Lizandra"))

}