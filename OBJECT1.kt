package AssuntosKT.RECE

interface Ingresso {
    fun clientes(nome: String) {
        // implementação padrão da interface
    }

    //instancia unica
    object ParaTodos {
        fun mensagem(nome: String): String {
            return "$nome, seja bem-vindo ao evento".trim().uppercase()

        }
    }
}

fun main() {
    val entrada1 = object : Ingresso {
        override fun clientes(nome: String) {
            println("Implementação 1: ${Ingresso.ParaTodos.mensagem(nome)}")//acessando pelo nome do objeto
        }
    }
    val entrada2 = object : Ingresso {
        override fun clientes(nome: String) {
            println("Implementação 2: ${Ingresso.ParaTodos.mensagem(nome)}")//acessando pelo nome do objeto
        }
    }

    entrada1.clientes("P'tawan")
    entrada2.clientes("P'nueng")
}
