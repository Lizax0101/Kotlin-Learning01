fun main() {

    println(
        """

        <Conversor de Unidades>
        
        Escolha a conversão:
        1: Celsius para Fahrenheit
        2: Fahrenheit para Celsius: 
    """.trimIndent()
    )

    val inputCF = readln()

    print("Digite o valor em Celsius: ")
    val celsius = readln().toDoubleOrNull()

    if (celsius == null || celsius <= 0.0) {

        println("Erro, opção é invalida, tente novamente...")
    } else {

        when (inputCF) {
            "1" -> {
                celsiusFahrenheit(celsius)
            }

            "2" -> {
                fahrenheitCelsius(celsius)
            }

            else -> {
                println("Opção escolhida é inválida!")
            }
        }
    }
}

fun celsiusFahrenheit(celsius: Double) {
    val fahrenheit = (celsius * 1.8) + 32

    println("${celsius}ºC = ${fahrenheit}ºF")

}

fun fahrenheitCelsius(celsius: Double) {
    val fahrenheit = (celsius * 1.8) + 32

    println("${fahrenheit}ºF = ${celsius}ºC")

}