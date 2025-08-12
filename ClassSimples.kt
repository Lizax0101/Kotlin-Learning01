package AssuntosKT.RECE

class Animall(val nome: String, var idade: Int) {
    fun aniversario() {
        idade += 1

    }

    override fun toString(): String = "$nome, $idade anos"
}
fun main() {
    val ani = Animall("Luk", 2)// instancia
    println(ani)
    ani.aniversario()
    println(ani)

}
