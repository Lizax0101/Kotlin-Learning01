package AssuntosKT.RECE

fun semaforo() {
    val cor = "amarelo"

    if (cor == "vermelho") {
        println("Pare")
    } else if (cor == "amarelo") {
        println("Atenção-Reduzir")
    } else if (cor == "verde") {
        println("Siga")
    } else {
        println("Cor: $cor invalida")
    }
}

fun main() {
    semaforo()
}