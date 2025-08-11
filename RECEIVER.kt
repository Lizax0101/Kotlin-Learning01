package AssuntosKT.RECE

fun mostrar() {
    val souUmaLambda: String.() -> Unit = { val palavraRecebida = this
        println(palavraRecebida)
    }

    "Eu sou a string receiver".souUmaLambda()
}

fun main() {
    mostrar()
}