package EstruturaDeDados_Listas.Desafios

fun agenda() {
    val minhaAgenda = mutableMapOf(
        "Corrida" to null, // corrida é um objeto
        "Calistenia" to "11:00",
        "Estudos" to "13:30",
        "Descanso" to "17:30"
    )
    minhaAgenda["Corrida"]?.let { horario ->
        println("Seu treino inicia ás ${horario.uppercase()} horas.")
    } ?: println("\nValor inesperado lançado, porquê a chave CORRIDA É NULL!")

    minhaAgenda["Calistenia"]?.let { horario ->
        println("\nSeu treino inicia ás ${horario.uppercase()} horas.")
    } ?: println("Valor não esperado")
}

fun main() {
    agenda()
}

