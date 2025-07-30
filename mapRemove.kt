package EstruturaDeDados_Listas

fun main() {
    val contatos = mutableMapOf(
        "maria" to "9588-5015",
        "mario" to "9518-5015",
        "jose" to "9548-5015"
    )


    println(contatos["mario"])
    println(contatos["jose"])


    contatos.remove("maria")
    print(contatos)

}
