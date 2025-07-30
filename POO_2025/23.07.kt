package POO_2025

class Viagem(val destino: String) {

    data class Consultar(val horario: String, val preco: Double)

    val lista = mapOf(
        "são paulo" to Consultar("10:00", 300.00),
        "rio de janeiro" to Consultar("11:30", 450.00),
        "belo horizonte" to Consultar("14:50", 500.00),
        "balneario camburiu" to Consultar("14:50", 600.00),
        "piaui" to Consultar("15:30", 200.00),
        "recife" to Consultar("16:00", 100.00),
        "alagoas" to Consultar("17:55", 50.00)
    )

    fun partida() {
        println("-Sua partida para $destino inicia em 10 minutos. Atente-se")
        println("\n-Deseja adicionar mais paradas ao seu destino? (s/n)")
        val entrada = readln()

        if (entrada.lowercase() == "s") {
            println("-Digite a cidade: ")
            val cidadeNova = readln()
            println("Destino atualizado: [$destino - $cidadeNova]")
        } else {
            println("Sem paradas adicionais. Seguiremos para $destino.")
        }
    }

    fun retorno(): Boolean {
        println("-Deseja retornar ao seu destino inicial ou comprar uma nova passagem?(s/n)")
        val retorno = readln().lowercase()
        return retorno == "s"
    }

    fun horarios() {

        while (true) {
            println("========Consulta AQUI.=========\nDigite o nome da cidade:")
            val entrada = readln().lowercase()

            val resultado = lista[entrada]

            if (lista.containsValue(resultado) && resultado != null) {
                println("\nCidade: ${entrada.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }}")
                println("Horário: ${resultado.horario}")
                println("Preço: R$ ${"%.2f".format(resultado.preco)}")
                //Trecho de baixo vem pra cá
                println("Comprar passagem para $entrada (s/n) ?")
                val comprar = readln().trim()
                if (comprar == "s") {
                    println("\nPassagem para: ${entrada.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }} comprada com sucesso! BOA VIAGEM :)")

                } else {
                    println("Operação cancelada!")
                }
                break
            } else {
                println("Cidade não encontrada.")
            }
        }
    }
}

fun main() {
    while (true) {
        println("Digite sua cidade de partida:")
        val inicio = readln()
        val viagem = Viagem(inicio)

        if (!viagem.lista.containsKey(inicio.lowercase())) {
            println("Essa cidade não está na lista de destinos disponíveis.")
            continue
        }

        viagem.partida()

        val desejaContinuar =
            viagem.retorno()// dica do chat pois eu, queria que o programa não execute quando o usuario escolher não retornar ao destino e nem comprar passagem
        if (desejaContinuar) {
            viagem.horarios()
            break
        } else {
            println("Encerrando... Obrigado!")
            break
        }
    }
}