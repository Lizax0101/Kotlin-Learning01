package EstruturaDeDados_Listas

data class Pessoa(val profissao: String, val salario: Double)

fun testRun() {

    val contratacao2 = Pessoa("", 0000.00)

    println("Sua profissao? ")
    val opProfissao = readln().trim()

    println("Meta salarial? ")
    val opSalario = readln().toDoubleOrNull()

    if (opSalario == null) {
        println("Salario Invalido. Encerrando..")
        return
    }


    val resultado = contratacao2.run {
        if (opProfissao == "Programador" && opSalario <= 5000.00) {
            "Parabéns, vamos marcar uma call!"

        } else "\"${this.profissao} não aceita(o) no momento\""

    }

    println(resultado)

}

fun main() {
    testRun()
}


