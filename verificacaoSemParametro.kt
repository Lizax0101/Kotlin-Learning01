fun quadrado() {
    try {
        print("Informe o lado 1: ")
        val lado1 = readln().toIntOrNull()

        print("Informe o lado 2: ")
        val lado2 = readln().toIntOrNull()

        if (lado1 != null && lado2 != null) {

            if (lado1 == lado2) {
                println("É um quadrado, entradas iguais")

            } else {
                println("Não é um quadrado, entradas diferentes")
            }
        } else {
            println("Por favor insira apensas numeros validos")
        }
    } catch (e: Exception) {
        println("Erro inesperado: ${e.message}")
    }

}
fun main() {
    quadrado()
}