class Viagem(val destino: String) {

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
        data class Consultar(val horario: String, val preco: Double)

        val lista = mapOf(
            "são paulo" to Consultar("10:00", 300.00),
            "rio de janeiro" to Consultar("11:30", 450.00),
            "belo horizonte" to Consultar("14:50", 500.00),
            "balneario camburiu" to Consultar("14:50", 600.00),
            "piaiu" to Consultar("15:30", 200.00),
            "recife" to Consultar("16:00", 100.00),
            "alagoas" to Consultar("17:55", 50.00)
        )


        println("========Consulta AQUI.=========\n-Digite o nome da cidade:")
        val entrada = readln().trim().lowercase()

        val resultado = lista[entrada]

        if (resultado != null) {
            println("\nCidade: ${entrada.replaceFirstChar { it.uppercase() }}")
            println("Horário: ${resultado.horario}")
            println("Preço: R$ ${"%.2f".format(resultado.preco)}")
        } else {
            println("Cidade não encontrada.")
        }

        println("Comprar passagem para $entrada (s/n) ?")
        val comprar = readln().trim().lowercase()
        if (comprar == "s") {
            println("\nPassagem para: $entrada comprada com sucesso! BOA VIAGEM :)")
        }else{
            println("Operação cancelada! Até a proxima.")
        }
    }
}

fun main() {
    val viagem = Viagem("Rio de Janeiro")
    viagem.partida()

    val desejaContinuar =
        viagem.retorno()
    if (desejaContinuar) {
        viagem.horarios()
    } else {
        println("Encerrando... Obrigado!")
    }
}


/***
 * 🧠 Como funciona?
 * texto é a string original.
 *
 * replaceFirstChar { it.uppercase() }:
 *
 * it representa o primeiro caractere da string.
 *
 * uppercase() transforma esse caractere em letra maiúscula.
 *
 * O restante da string permanece igual.
 *
 *
 */