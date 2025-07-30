fun main() {
    val str: String? = null
    if (str == null) {
        println("str é Nulo")
    }else{
        println(str)
    }
    println(str ?: "Nulo de novo")
}
/**
 * Ele executa uma intrução quando a variavel a direta é nula
 * ele executa o que estiver a esquerda.
 */