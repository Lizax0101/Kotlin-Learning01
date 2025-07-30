/**
 * Tupe Bit
 * Double 64( TIPOS COM MAIORES TAMANHOS, ELEVADO A 308)
 * Float 32 ( TIPOS COM MAIORES TAMANHOS, ELEVADO A 38 )
 * Armazenam inteiros, mas foram criados para aceitar valores quebrados
 *
 * Long 64
 * Int 32
 * Short 16
 * Byte 8
 * Armazenam numeros inteiros
 *
 * Boolean ?
 * Verdadeiro ou Falso
 * String ?
 * Se adequa ao tamanho do conteudo
 * Char ?
 * Aceita um caractere com aspas simples
 *
 * Tamanho da memoria que a variavel ocupa
 */
fun main() {
    //conversão de tipos

    val idade1: Int = 10
    val altura: Double = 1.75


    println("Minha idade convertida: ${idade1.toDouble()} ")
    println("Minha altura convertida: ${altura.toInt()} ")

    val nomeCompleto : String = "Lizandra Albuquerque"

    val tamanhoNome = nomeCompleto.length


    println(tamanhoNome)
    println(nomeCompleto)
}