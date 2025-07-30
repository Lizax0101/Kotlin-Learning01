fun main() {

    val number = mutableListOf<Int>()

    for (i in 0..<2) {
        print("Digite o número ${i + 1} para para efetuar o calculo: ")
        val numero = readlnOrNull()?.toIntOrNull()
        if (numero != null && numero >= 0) {
            number.add(numero)
        } else {
            println("Error! Digite apenas números.")
            return
        }
    }

    calculadora(number[0], number[1])

}

fun calculadora(num1: Int, num2: Int) {
    print(
        """
            
            Qual operação deseja realizar?
            
            Adição: + Digite(1)
            Subtração: -  Digite(2)
            Divisão: / Digite(3)
            Multiplicação: * Digite(4)
                        
        """.trimIndent()
    )

    val opcao = readln()

    when (opcao) {
        "1" -> {
            print("Resultado da Adição: ${num1 + num2}")
        }

        "2" -> {
            print("Resultado da Subtração: ${num1 - num2}")
        }

        "3" -> {
            if (num2 == 0) {
                print("Divisão por zero não permitida!")
            } else {
                print("Resultado da Divisão: ${num1 / num2}")
            }
        }

        "4" -> {
            print("Resultado da Multiplicação: ${num1 * num2}")
        }
    }
}