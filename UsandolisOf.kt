package EstruturaDeDados_Listas

val diasDaSemana = listOf("Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado")

//fun exibirDias() = diasDaSemana.forEach { println(it) }
fun exibirDias() = diasDaSemana.map { println("Hoje é: $it ") }

fun main() {
    exibirDias()
}

/**
 * Nesse exemplo, como os dias da semana não mudam, então não há motivos para fazer alterações.
 * então dentro da variavel diasDaSemana foi criado uma lista de strings imutaveis.
 *
 * a função exibirDias foi criada para encapsular o comportamento de exibir os dias da semana.
 * Em vez de escrever o forEach direto no main, esse comportamento foi encapsulado na função para manter o codigo mais limpo e reutilizavel.
 * dessa forma conseguimos chamar esse mesmo codigo em outros lugares sem precisar escrever novamente.
 *
 * feito isso; fazemos a chamada de função no main() exibirDias()
 * Saida// os dias da semana um abaixo do outro.
 *
 * O que é uma chamada de função?
 * Significa: executa o que esta dentro da função exebirDias()
 */

