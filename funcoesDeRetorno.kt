fun calculoItens(valorProduto: Double, taxaDeEntrega: Double): Double{
     return valorProduto + taxaDeEntrega

}

fun main(){
    val valorProduto1 = 50.0
    val taxaDeEntrega2 = 10.0

    val retornoTotal = calcularTotal(valorProduto1, taxaDeEntrega2)

    println( " O VALOR DO PEDIDO É: R$ $retornoTotal")

    println( " O VALOR DO PEDIDO É: R$ ${"%.2f".format(retornoTotal)}")

}