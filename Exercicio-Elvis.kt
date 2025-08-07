package EstruturaDeDados_Listas

fun primeiroCad() {

    val pessoa: String? = null

    //aqui, se val pessoa for null, mostre esse valor ("Voce não está cadastrado na base.") alternativo a direita do ?: elvis
    val pessoaSegura = pessoa ?: "Voce não está cadastrado na base."
    println(pessoaSegura)

}

fun main() {
    primeiroCad()
}

/**
 * Use ?: quando você precisar de um valor garantido mesmo que o original seja nulo.
 */
