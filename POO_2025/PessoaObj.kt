package POO_2025

class CadastroSus {
    //molde p criar os objetos, 6 atributos
    var nome = ""
    var medEspecialista = ""
    var status = ""
    var data = ""
    var idade = 0
    var horario = 0


    fun acaoDoDia() {// metodo imprimindo a msg
        val vermelho = "\u001B[31m"
        val verde = "\u001B[32m"
        val reset = "\u001B[0m"

        println("FICHA CADASTRAL------------------------")
        println("Nome : $nome")
        println("Idade: $idade anos")
        println("Médico Especialista : $medEspecialista")
        println("Data: $data ")
        println("Horário: $horario h")
        println("Status Consulta:${verde}$status$reset")
        println("---------------------------------------")

    }

    fun dirigir(): Boolean {
        return idade >17
    }

    fun comprar() {
        val listRemedios = listOf("Diazepam", "Buscopam", "Benegripe")
        print("Escolha uma das opções disponiveis: Diazepam,Buscopam, Benegripe: ")
        val entrada = readln()
        if (entrada in listRemedios) {
            println("Voce comprou: $entrada.")
        } else {
            println("$entrada sem estoque.")
        }
    }
}

fun main() {
    //instancia da classe
    val cadastroSus = CadastroSus()
    cadastroSus.nome = "Gabriela"
    cadastroSus.idade = 18
    cadastroSus.medEspecialista = "Dermatologista"
    cadastroSus.data = "12/08/2025"
    cadastroSus.horario = 13
    cadastroSus.status = "Marcado"


    cadastroSus.acaoDoDia()
    cadastroSus.dirigir()
    cadastroSus.comprar()

    if (!cadastroSus.dirigir()){
        println("Paciente ${cadastroSus.nome} tem condições de dirigir, liberada! ")
    } else{
        println("Sem condições, aguardar mais um pouco...")
    }
}