package EstruturaDeDados_Listas

fun main() {
    val veiculos = listOf("Carro", "Moto", "Bike")
    val novaLista = veiculos.let{
        println("Lista sem modificações: $it")
        val recebe =  it.map { veiculo -> "$veiculo ${veiculo.length} letras"}
        println(recebe)
        recebe
    }
    println(novaLista)
}

/**
 * MAP - Retorna uma lista contendo os resultados da aplicação da função de transformação fornecida a cada elemento na coleção original.
 */