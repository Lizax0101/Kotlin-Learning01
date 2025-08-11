class Pproduto(val nome: String, val preco: Double) {

    init {
        require(nome.isNotBlank()) { "O nome do produto não pode ser vazio." }
        require(preco > 0) { "O preço deve ser maior que zero." }
    }
}

fun main() {
    // Produto válido
    val p1 = Pproduto("lapis", 2.5)
    println("${p1.nome} custa R$${p1.preco}")

    // Produto inválido - teste com try/catch
    try {
        val p2 = Pproduto("", -5.0)
    } catch (e: IllegalArgumentException) {
        println("Erro ao criar produto: ${e.message}")
    }
}

/**
 * require
 * Serve para validar argumentos ou condições que devem ser verdadeiras antes de continuar a execução.
 *
 * Se a condição falhar, lança automaticamente uma exceção IllegalArgumentException.
 */
