package EstruturaDeDados_Listas

fun prodAcrescimow(preco: Map.Entry<String, Double>): Boolean {
    return preco.value < 30
}

fun main() {

    val cesta = mutableMapOf(
        "Tenis" to 350.00,
        "Bone" to 20.00,
        "Bolsa" to 95.00,
        "moleton" to 102.00,
        "Meia Compressao" to 27.50
    )

    cesta["Casaco"] = 55.90
    cesta["Tenis"] = 270.00

    val produtoAbaixo = cesta.any(::prodAcrescimo)
    val produtoAcima = cesta.any{it.value > 50}

    if (produtoAbaixo) {
        println("️Produtos com preço abaixo de R$30,00:")
        val menorQ30 = cesta.filter(::prodAcrescimo)

        menorQ30.forEach {
            println(String.format("%s: R$%.2f", it.key, it.value))

        }
    }
    if (produtoAcima){
        println("\nProdutos acima de R$50,00")
        val maiorQ50 = cesta.filter{it.value > 50}

        maiorQ50.forEach {
            println(String.format("%s: R$%.2f", it.key, it.value))
            val desconto =+ it.value - 10.00
            println(String.format("Por apenas: R$%.2f", desconto))
            println()

        }
    }
}