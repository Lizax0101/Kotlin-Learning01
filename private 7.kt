class Produtinhos(
    val nome: String,
    private var preco: Double // propriedade privada, só pode ser alterada dentro dessa classe
) {
    fun exibindoPreco(): String { //função public qualquer um pode chama-la,ela acessa o preço privado e devolve uma representação fomatada em string
        return "R$ %.2f".format(preco)// ela é um metoo de leitura controlado, vc decide como o valor sera mostrado sem expor a variavel diretamente
    }

    private fun apliqueDesconto(percent: Double) {// não pode ser chamada de fora dessa classe pois é um metodo privado
        preco -= this.preco * (percent / 100)//Serve como função utilitária interna para calcular o desconto, tipo uma função que executa uma determinada tarefa em tempo de execução, não salva nenhum dado.
    }

    fun apliqueCupom(cupom: String) {
        if (cupom == "MenosDEZ") {// valida se o cupom adicionado é valido
            apliqueDesconto(10.0)
        }
    }
}
//Ex de regras de negocio

fun main() {
    val notbook = Produtinhos("Notebook Dell-1TB-I7", 3096.0)

    println("Preço notbook sem desconto: ${notbook.exibindoPreco()}")
    // chama exibindoPreco -> acessa preco internamente -> devolve "R$ 2500.00"
    notbook.apliqueCupom("MenosDEZ")
    // chama apliqueCupom -> valida se o cupom é "MenosDEZ" -> chama aplicarDescontoInterno -> altera preco internamente
    println("Preço notbook com desconto aplicado: ${notbook.exibindoPreco()}")
    // devolve "R$ 2786.00"
}

/**
 * sobre a função private
 * Por que deixar privada?
 *
 * Porque você não quer que qualquer parte do app saia aplicando desconto sem regra.
 *
 * Só a própria classe deve controlar quando e como aplicar descontos.
 * fun aplicarCupom(cupom: String)
 *
 * Essa é pública (qualquer parte do app pode chamar).
 *
 * Ela recebe um cupom e decide se pode aplicar um desconto ou não.
 *
 * Para aplicar o desconto, ela usa a função privada aplicarDescontoInterno.

O mundo externo só enxerga aplicarCupom.
 *
 * Mas quem realmente altera o preço é aplicarDescontoInterno, que está protegido.
 */