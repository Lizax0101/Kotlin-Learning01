fun calcularTotal( valorIntens: Double, taxaEntrega: Double ) : Double {// Double representa uma precisao de 64 bits
    return valorIntens + taxaEntrega

}
fun main(){

    val valorDosItens = 51.50
    val taxaDeEntrega = 10.0

    val totalPedido = calcularTotal(valorDosItens, taxaDeEntrega)

    //Três formas de fazer

    println(" O valor do pedido é: R$ $totalPedido") /* interpolação da variavel dentro da string, usado quando o formato exato não importa*/

    println(" O valor do pedido é: R$ ${"%.2f".format(totalPedido)}") /* forma correta, formatada com valor preciso em moeda real*/

    println(" O valor do pedido é: R$ "+ totalPedido) /* exemplo com concatenação, usado quando o formato exato não importa */

}

