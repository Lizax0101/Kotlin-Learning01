package EstruturaDeDados_Listas

fun main() {
    println("Digite um número:")
    val numero = readln().toInt()

    var contar = 1

    while (contar <= numero) {
        println("contar vale: $contar (comparando $contar <= $numero)")
        contar++ // aumenta 1
    }

    println("FIM DO LOOP: contar agora vale $contar e a condição ficou falsa.")
}
