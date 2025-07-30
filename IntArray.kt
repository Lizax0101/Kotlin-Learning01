fun main() {

    val numeros = 0..1000

    println("Números da Rifa:")

    for (n in numeros) {

        // print("${n} ")
        //if (n % 10 == 0) println()// dessa forma o 0 fica encima sozinho


        print("${n.toString().padStart(3, '0')} ")
        if ((n + 1) % 10 == 0) println()//dessa forma ele fica na frente do 1 na mesma linha de sequencia




    }

}

/**
 * O resto da divisão de 10 por 10 é 0
 * O resto da divisão de 9 por 10 é 9
 * Então até o 9 não irá quebrar.
 * Mas quando chega no 10 = 0.
 * println() Quebra a linha/
 *
 * O 2 é o tamanho que será p preencher os espaços p ficar igual linha e coluna , e o zero é o caracter que vai ocupar esse espaço "em branco".
 * Eu poderia colocar qualquer outra coisa, sei lá 'B'
 * Essa é uma forma de criar esse algoritmo
 */