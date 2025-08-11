package AssuntosKT.RECE.incremento

class Cadastro(val nome: String, val profissao: String, var salario: Double)

fun main() {
    val cadastro = Cadastro("Lizandra", "Desenvolvedora Mobile", 2.000)
    println("Nome: ${cadastro.nome}, Profissão: ${cadastro.profissao}, Salário: ${"R$%.3f".format(cadastro.salario)}")

    println( " Salário: ${"R$%.3f".format(cadastro.salario)}")

}