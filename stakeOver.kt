fun fatorial(n: Int): Int{

    /* if (n == 0) {
         return 1
     }
 Isso causará recursão infinita
 */

    return n * fatorial(n- 1)
}

fun main() {
    val resultFatorial =  fatorial(5)
    println(resultFatorial)
}
