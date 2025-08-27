
private class Comportamento(val comporta: String) {

    companion object {
        fun acao1(comporta: String): Comportamento {
            println("Criando comportamento aqui ...")
            return Comportamento(comporta)
        }
    }
}
fun main(){
    val c = Comportamento.acao1 ("propriedade da classe privada")//compila normalmente, porque ainda está no mesmo arquivo, em outro da erro pq a classe é privada
    println(c.comporta)
}
