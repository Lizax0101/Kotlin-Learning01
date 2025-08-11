package AssuntosKT.RECE

object BancoDeDados {
    val usuarios = mutableListOf<String>()

    fun adicionarUsuario(nome: String) {
        usuarios.add(nome)
        println("($nome), novo usuario adicionado ao banco de dados.")
    }
}

fun main() {
    BancoDeDados.adicionarUsuario("Liza")// assim imprimimos os dois
    BancoDeDados.adicionarUsuario("Lidia")
    println(BancoDeDados.usuarios) // assim imprime apenas os usuarios da lista, sem a mensagem do metodo.

    //instancia unica(singleton), acessada pelo nome do objeto + seu metodo.

}