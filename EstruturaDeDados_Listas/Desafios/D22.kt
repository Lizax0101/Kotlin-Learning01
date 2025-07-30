package EstruturaDeDados_Listas.Desafios

fun main() {

    val veiculos = listOf("Carro", "Moto", "Bike")

    val novaLista = veiculos.also{
        println("Lista sem modificações: $it")

        val recebe =  it.map { veiculo -> "$veiculo ${veiculo.length} letras"}
        println(recebe)
    }
    println(novaLista)

}