package AssuntosKT.RECE

interface Cumprimentar {
    fun primeiraPessoa(nome: String)
}

fun main() {
    val saudacao = object : Cumprimentar { // obj anonimo que implementa a interface
        override fun primeiraPessoa(nome: String) {
            println("Olá,$nome tudo bem?\ngostaria de uma informação.")
        }
    }
    saudacao.primeiraPessoa("Joseph")
}