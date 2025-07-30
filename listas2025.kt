fun main() {
    val numeros = listOf(1,2,3,4,5)

    val numerosModificados = numeros.map {"Número: $it"}

    numerosModificados.forEach { println(it)}

}