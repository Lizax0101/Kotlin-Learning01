fun main() {
    val a = false
    val b = false
    val c = true
    val d = true

    println(a && b && c && d)
    // conjunção E(&)comercial, ambas as expressoes precisam ser verdade para que todas sejam verdade.
    // como A já é false não precisamos avaliar as demais expressoes pois a saida já será false.
    // exemplo: a(false) && b(false) && c(true) && d(true), como todas precisam ser true, ja identificamos a saida como false.

    println(!a && !b && (c && d))
    // aqui temos a negação de a, ele sendo false, negando sera true. Negação b como é
    // false negando sera true
    // sendo assim true && true && c = true && d = true, a expressao retornará true.


    println(a && ((b || c) || d))
    //Se temos o E(&)comercial e A já é false, já podemos encerrar por aqui, pois o resultado sera false, por se tratar de uma conjunção não interessa o que tem dentro das expressoes adiante, tudo é ignorado pois a condição já é verificada.


    println(a || ((!b && c) || !d))
    // ||(OR) - Se pelo menos uma das expressoes for verdade a saida sera verdade.
    // a (false) ||(OR) (true || false)
    // false || true
    // true

    println(!a || ((!b && c) || !d))
    // a negação de a, torna a em true. Eu tenho um item verdadeiro em uma disjunção e basta que um item seja verdadeiro para a saida ser verdade. O resto da expressao não importa, é ignorado.

}