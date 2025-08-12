import CalculadoraUtil.Companion.divide
import CalculadoraUtil.Companion.multiplica
import CalculadoraUtil.Companion.soma
import CalculadoraUtil.Companion.subtrai

class CalculadoraUtil {

    companion object {

        // Operações
        fun soma(a: Double, b: Double) = a + b
        fun subtrai(a: Double, b: Double) = a - b
        fun multiplica(a: Double, b: Double) = a * b

        fun divide(a: Double, b: Double): String {
            return if (b != 0.0) {
                "Resultado: ${a / b}"
            } else {
                "Erro: divisão por zero"
            }
        }

        // Função para usar apply como bloco de calculadora
        fun bloco(operacoes: CalculadoraUtil.() -> Unit) {
            CalculadoraUtil().apply(operacoes)
        }
    }

    // Apenas para teste: método que roda dentro do apply
    fun testeOperacao() {
        println("Rodando o bloco apply...\n")
    }
}

fun main() {

    // Uso com apply como um bloco de calculadora
    CalculadoraUtil.bloco {
        testeOperacao()
        println("Multiplicação rápida: ${multiplica(4.0, 6.0)}")
        println("Soma rápida: ${soma(10.0, 20.0)}")
        println(divide(8.0, 0.0)) // também tratado no bloco
        println(subtrai(8.0, 0.0))
    }
}
