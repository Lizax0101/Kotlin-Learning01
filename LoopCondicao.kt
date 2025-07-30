fun main() {
    var y = 0
    while (y < 10) {
        println(y) // exibe na tela o valor atual de y
        y++ // incrementa o valor atual de y em +1
        if (y == 10) { // verifica se y é igual a 10 sendo true a instrução break é executada, quebrando o loop.
            break
        }
    }
}
/**
 * Y inicia com valor 0
 * se y menor que 10 exiba na tela e adicione +1, ele fará isso até y ser igual a 10 então ele entra na condição
 * como y == 10 ela quebra o loop e encerra.
 */