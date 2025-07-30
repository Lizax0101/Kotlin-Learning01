package EstruturaDeDados_Listas

fun nulo() {

    val nome: String? = null
    // nome = null tipo não nulo padrão
    // erro de compilação

    //var sobrenome: String? = null
    //sobrenome = "LizaCooper"
    //println("Essa string contem: ${sobrenome?.length} letras")
    // ? tipo anulável (nullable type)
    //O ? diz ao compilador: “pode ser string OU null”.

    val tamanho = nome?.length ?: 0
    println(tamanho)
    // como a string contem um valor com 3 letras "liz" ele nos retorna o tamanho.
   // agora atribui um valor null, ela nos retornou o valor a esquerda do elvis, ou seja 0
}

fun main() {
    nulo()
}