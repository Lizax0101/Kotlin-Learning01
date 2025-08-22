package AssuntosKT.RECE

open class Selecao
class Candidato(val nome: String, val salario: Double) : Selecao()
class Empresa(val vagas: Int) : Selecao()

fun main() {

    val selecaoList: List<Selecao> = listOf(Candidato("Liza", 2000.00), Empresa(1))
    for (item in selecaoList) {
        when (item)   {                                                       //formatação valor: "%.2f".format // não esquecer
                                                                             // % marcador de formato, .2 - duas casas decimais, f - float/double
            is Candidato -> println("Candidato: ${item.nome} - Salario: ${"%.2f".format(item.salario)} reais")
            is Empresa -> println("Empresa L-TECH: ${item.vagas} vaga disponivel")
            else -> println("Não foi nenhuma das opções, retornou essa mensagem")
        }
    }
}