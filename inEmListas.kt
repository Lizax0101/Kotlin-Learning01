package EstruturaDeDados_Listas

fun fazerCompras(){
    val frutas = listOf<String>("Maça", "Banana", "Pinha")

    if ("Pinha" in frutas){
        println("Tem pinha na lista.")
    }else( println("Não tem pinha nessa lista."))
}

fun main(){
    fazerCompras()
}

