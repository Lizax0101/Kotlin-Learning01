package Assuntos

class Zoologico private constructor(val animal: String) {
    companion object { fun criar(v: String) = Zoologico(v.uppercase()) }
}

fun main() {
    val c = Zoologico.criar("borboleta")
    println(c.animal)
}
