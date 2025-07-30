package EstruturaDeDados_Listas

fun simples(nome: String, letra:(String)-> String){
    println("Nome: $nome recebido normal, ${letra(nome)} recebido por lambda.")
}

fun retornaR(it: String): String{
    return it.first().toString()
}

fun main() {
    simples("Rodrigo", ::retornaR)

    //simples("Rodrigo") {letra -> letra.first().toString()}

}
