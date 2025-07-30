interface Funcionario {
    var salario: Float
    fun bonus(): Float
}

class Gerente(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.5f
    }
}


class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f
    }

}
fun mostrarBonus(g:Funcionario){
    println(g.bonus())
}

/**fun mostrarBonus(a: Analista){
println(a.bonus())
}
**/

fun main() {
    mostrarBonus(Gerente(6000f))
    mostrarBonus(Analista(4000f))

}