package AssuntosKT.RECE

abstract class Escola(val nome: String, var nescola: String, var modalidade: String, private val nota: Int) {
    abstract fun aluno()
    abstract fun materia1()
    abstract fun materia2()
    abstract fun materia3()
    fun metodoPropPrivate() = println("Eu sou a propriedade nota: $nota, só a classe mãe tem ACESSO mim.")
    //metodo não é abstrato pq tem corpo
    // se fosse protect so as filhas conseguiram acessar a propriedade
    // como esta aqui, só essa classe tem acesso a esse parametro

}

class SalaAula(nome: String, nescola: String, modalidade: String, nota: Int) : Escola(nome, nescola, modalidade, nota) {
    override fun aluno() {// metodo existe apenas na subsclasse
        println("Aluno:$nome, Escola: $nescola, Modalidade:${modalidade.uppercase()}")
    }

    override fun materia1() {
        println("Estuda: Português")
    }

    override fun materia2() {
        println("Estuda: Inglês")
    }

    override fun materia3() {
        println("Estuda: Holandês")
    }

   // fun metodoPropPrivate() = println("$nota, só a classe mãe tem acesso a propriedade nota.")// nota não é acessivel aqui na subclasse


}

fun main() {
    val instancia: Escola = SalaAula("JAYZ", "High School N1", "Publica", 10)
    val instancia2 = SalaAula("HANNA", "High School N2", "Particular", 10)
    val instancia3 = SalaAula("YALY", "High School N3", "Publica", 10)
    instancia.metodoPropPrivate()
    instancia.aluno()
    instancia.materia1()
    instancia2.aluno()
    instancia2.materia2()
    instancia3.aluno()
    instancia3.materia3()

}