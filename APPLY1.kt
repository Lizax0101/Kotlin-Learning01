package AssuntosKT.RECE

data class Caneta(val cor: String, val valor: Double)


class Estoque {
    private val listaDeCanetas = listOf(
        Caneta("amarelo", 3.00),
        Caneta("azul", 2.00),
        Caneta("preto", 5.00),
        Caneta("laranja", 7.00),
        Caneta("vermelho", 9.00)
    )

    fun pen() {
        listaDeCanetas.forEachIndexed { index, caneta ->// esses dois parametros são da lambda do forEach


            // caneta.apply { ... } é a ação onde caneta vira o receiver do bloco
            caneta.apply {// this = caneta no escopo do apply
                println("Caneta ${index + 1} - Cor: $cor | Valor: R$ $valor")// chamando diretamente com apply
            }
        }
    }
}

fun main() {
    val estoque = Estoque()
    estoque.pen()
}

/**
 * Ou seja:
 *
 * No forEachIndexed, caneta é argumento que você recebeu.
 *
 * Em caneta.apply { ... }, você chama uma lambda com receiver sobre aquela caneta,
 * tornando-a o receiver do bloco e permitindo usar suas propriedades sem qualificação explícita.
 *
 * Isso faz exatamente o que você descreveu: index e caneta vêm da lambda
 * do forEachIndexed, e caneta.apply { ... } é a ação onde caneta vira o receiver do bloco.
 */