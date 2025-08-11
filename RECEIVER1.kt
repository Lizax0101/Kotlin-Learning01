package AssuntosKT.RECE

fun main() {
    val maiusculas: String.() -> String = {
        this.uppercase()
    }
    println("a casa é velha".maiusculas())
}

/**
 * this é a frase ( a casa é velha ) que aponta para a string na variavel.
 * a string "a casa é velha" vira o receiver.
 * Dentro da lambda, o this é justamente essa frase completa → "a casa é velha"
 * Por isso:
 * this.uppercase() → "A CASA É VELHA"
 * Ou seja: o receiver (this) sempre aponta para o objeto da esquerda que chamou a lambda (String no caso)

 */