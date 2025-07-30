package EstruturaDeDados_Listas.Desafios


fun imprindoColecao(colecao: Collection<Int>){
    for (item in colecao) println(item)

}
fun main(){
    val numeros = arrayOf(1,2,3,4,5)

    imprindoColecao(numeros.toList())
}

