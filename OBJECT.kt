interface PagamentoListener {
    fun aoPagar(valor: Double)
}

// Helper para formatar valores
object FormatarMoeda {
    var simbolo = "R$"  // dado global, único

    fun formatar(valor: Double): String {
        val texto = String.format("%.2f", valor).replace('.', ',')
        return "$simbolo $texto"
    }
}

fun main() {
    val pagamentoCartao = object : PagamentoListener {
        override fun aoPagar(valor: Double) {
            println("Pagamento de ${FormatarMoeda.formatar(valor)} realizado no cartão.")
        }
    }

    val pagamentoPix = object : PagamentoListener {
        override fun aoPagar(valor: Double) {
            println("Pagamento de ${FormatarMoeda.formatar(valor)} realizado via PIX.")
        }
    }

    pagamentoCartao.aoPagar(50.0)
    pagamentoPix.aoPagar(75.5)
}