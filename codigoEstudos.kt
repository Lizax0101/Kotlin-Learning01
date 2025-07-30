fun lojaOnline(preco: Double, desconto: Double = 0.0, imposto: Double = 0.0, promocao: String = "") {

    val descontO = preco - desconto
    val impostO = descontO + imposto

    println("Resumo da Transação ===>\n")
    println("Preço Original: R$$preco")
    if (desconto > 0.0) println("Desconto: R$$desconto")
    if (imposto > 0.0) println("Imposto: R$$imposto")
    if (promocao != "") println("Promoção: $promocao")
    println("Preço final: R$$impostO")

}

fun main() {

    lojaOnline(100.0, 10.0, 5.0, "Black Fraude")

    /*
        Output:
        Resumo da Transação ===>

        Preço Original: R$100.0
        Desconto: R$10.0
        Imposto: R$5.0
        Promoção: Black Fraude
        Preço final: R$95.0
    */

}