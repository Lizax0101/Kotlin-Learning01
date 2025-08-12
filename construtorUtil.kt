package AssuntosKT.RECE

class Pessoaa(val nome: String, val idade: Int) {
    constructor(csv: String) : this(
        csv.split(",")[0],
        csv.split(",")[1].toInt()
    )
}

fun main() {
    val p1 = Pessoaa("Maria", 30)
    val p2 = Pessoaa("João,25") // Criado a partir de string CSV

    println("${p2.nome} ${p2.idade}")
}