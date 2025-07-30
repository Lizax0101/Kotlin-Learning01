/**
 * readline é usado para capturar a entrada do usuario
 * toIntOrNull e toDoubleOrNull converte as entradas Int e Double para um valor padrão
 * gastoDiario calcula a média de gastos diarios dividindo valorMensal por diasMes.
 */


fun main() {
    var nome: String
    var idade: Int
    var valorMensal: Double
    var diasMes: Int


    println("Digite seu nome: ")
    nome = readLine() ?: ""

    print("Digite sua idade: ")
    idade = readLine()?.toIntOrNull() ?: 0

    print("Digite o valor total que pretende gastar no mês: ")
    valorMensal = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite a quantidade de dias do mês: ")
    diasMes = readLine()?.toIntOrNull() ?: 30

    val gastoDiario = valorMensal / diasMes
    val gastoDiarioFormatado = "%.2f".format(gastoDiario)
    // Formatar o valor de gastoDiario com 2 casas decimais

    print("Nome: $nome, Idade: $idade, Gasto Diario: R$$gastoDiario ")

}