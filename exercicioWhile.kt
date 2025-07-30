fun loopFor() {
    var b = 0
    for (b in 1..50) {
        print("$b ")
    }

}

fun decrescente() {
    for (b in 50 downTo 1) {
        print("$b ")

    }
}

fun mutiplos5() {
    for (g in 1..50) {
        if (g % 5 != 0) {// resto da divisao por 5 dá zero, então não imprimir os multiplos de 5, então colocamos o continue e ele sobe para o laço novamente
            print("$g ")
            //continue
        }
        // print("$g ")

    }
}

fun somaTodos() {

    var soma = 0
    for (c in 1..500) {
        //soma = soma + c
        soma += c// mesma coisa de cima

    }
    print(soma)
}


fun contador(n: Int) {
    for (a in 1..n) {
        for (b in 1..a) {
            print("#")
        }
        println()
    }

}


fun main() {
    //loopFor()
    // decrescente()
    //mutiplos5()
    //
// somaTodos()
    contador(5)
}
