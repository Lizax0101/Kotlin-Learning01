package AssuntosKT.RECE


fun main() {
    val nota = 1
    val caderneta = when (nota) {
        in 9..10 -> "Aprovado"
        in 7..8 -> "Aprovado"
        in 5..6 -> "Parcial"
        else -> "Reprovadissimo"
    }
    println("Candidato:$caderneta")
}