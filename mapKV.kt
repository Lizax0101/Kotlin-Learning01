package EstruturaDeDados_Listas

fun prodAcrescimo(preco: Map.Entry<String, Double>): Boolean {
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

    val acresProduto = cesta.any(::prodAcrescimo)

    if (acresProduto) {
        println("️Alguns produtos precisam de reajuste (preço muito baixo)\n")
    }

    val menorQ30 = cesta.filter(::prodAcrescimo)


    menorQ30.forEach { item ->
        println("${item.key}-R$${"%.2".format(item.value)}")

        //verificando um bom lugar p colocar essa lista

    }
}






