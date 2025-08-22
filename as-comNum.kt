package AssuntosKT.RECE

fun num(){
    val listNum: List<Any> = listOf(99, 2.5, "12", "liza")

    listNum.forEach { cada -> val tipos = cada as? Int
    println("Tentando converter: $cada para Int: $tipos")
    }
}

fun main(){
    num()

    val int: Int = 2
    val double = int.toDouble()
    println(double)

    // aqui sim temos uma conversão explicita de int para double.
    // mesmo a referencia dele sendo um Int, porque já não tem mais relação com as?
}

/**
 * esse exemplo funciona com is - checagem de tipos e tambem funciona com cast seguro as?
 * que tenta converter se sim, ele converte senão, ele devolve um null.
 *
 * E porque não é possivel converter' um double em um Int?
 *
 * Porque as não faz conversão de valor, ele só faz casting de referência.
 * Ou seja, ele só funciona se o objeto já for do tipo alvo.
 *
 * 10.5 é um Double, não é um Int. Então o cast falha e o as? devolve null.
 */