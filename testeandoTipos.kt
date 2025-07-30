fun main() {
    //println(byte::class)
    //println(desconto::class)
    //println(double::class)

    println(resposta)
}

val byte: Byte = 8 // aceita 8 bits
val short: Short = 16 // aceita 16 bits
val inteiro: Int = 32 // aceita 32 bits
val desconto: Float = 31.90f // aceita 32 bits,se voce não especifica que é um long o kotlin infere um double.( é util para economizar espaçço na mememoria)
val double: Double = 32.90 // aceita 64 bits ponto flutuante
val long: Long = 1_925_000_000L // aceita 64 bits
// aceita 64 bits, Aqui estou reservando um espaço maior, ele armazena o 1925 em uma parte da memoria e reserva a outra, mas se eu não especifico, ele infere um Int.
val string : String = "sou um texto"

/**
 * O int equivale ao float 32 / 32 bits
 * O double equivale ao long 64/ 64 bits
 */

val booleano = true
val booleano1 = false // booleano armazena 1byte ou seja 8 bits               | 1 |               -true
//ele não usa todo o espaço do bit, usa apenas uma casa; exemplo temos 8 bits | 0 | | | | | | |  - false

val mediaPrice = 22
val resposta = mediaPrice.toDouble()// conversao de int para double


