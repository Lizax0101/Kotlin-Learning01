package EstruturaDeDados_Listas

fun main() {

   val numeros =  listOf(10,20,30,40) // lista inteiros

    val numerosComMap = numeros.map { it + 5 } // variavel que guarda o valor da lista modificada, ouseja cada item da lista + 5

    numerosComMap.forEach { println("Numeros + 5: $it") }// acessando a variavel que guarda o valor com forEach para listar cada item



}
//06/2025