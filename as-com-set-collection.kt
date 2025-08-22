package AssuntosKT.RECE

open class UmaFruta(val nome: String)

fun main() {
    val frutas: MutableList<UmaFruta> = mutableListOf(UmaFruta("laranja"), UmaFruta("maracujá"))
    val firstFruta = frutas[0] as UmaFruta // as não é necessario aqui
    println("Um suco natural, muito bom: ${firstFruta.nome}")

// set(definir)
// set(index, valor) em uma MutableList serve somente para substituir o valor que já está naquela posição por outro.
// Ele não cria espaço novo, só troca.
    frutas.set(0, UmaFruta("morango"))



    frutas.add(2, UmaFruta("pinha"))
    // ja aqui voce esta adicionando uma posição especifica do seu item + o valor


    frutas.add(UmaFruta("ultima fruta adicionada, ex: jaca"))
    // lista.add(valor) - assim adiciona um novo valor no final da lista

    println("\nMostrando a lista atualizada:")
    frutas.forEach { println(it.nome) }
}

