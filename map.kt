package EstruturaDeDados_Listas
fun mapa(){
    val mapaProduto = mutableMapOf(
        "arroz" to 5.99,
        "feijao" to 6.99,
        "macarrao" to 8.49
    )


    //mapaProduto["Feijao"] = 15.00
    mapaProduto.remove("feijao" )
    mapaProduto.forEach { posicao, index -> println("$posicao - ${ index + 1 }")}
}


fun main() {
    mapa()

}