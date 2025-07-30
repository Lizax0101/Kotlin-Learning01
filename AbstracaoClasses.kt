open class Amigo {
    open fun parente() {
        println("Estou na classe Amigo,sou o metodo Parente")
    }

    open fun conjugue() {
        println("Tambem estou na classe Amigo, sou outro metodo chamado Conjugue.")
    }
}
class Festa : Amigo() {
    override fun parente() {
        super.parente()//acessando metodo original
        println("mudança do metodo PARENTE na classe Festa")// metodo parente sobrescrito

    }
}
fun main() {
    val amigos: Amigo = Festa()
    amigos.parente()
    amigos.conjugue()
}