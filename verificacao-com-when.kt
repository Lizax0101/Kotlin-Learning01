package AssuntosKT.RECE

fun outroSemaforo() {

    val cor = "azul"

    when (cor) {
        "vermelho" -> println("VAI, PARA, CUIDAAA")
        "amarelo" -> println("PRESTA ATENÇÃO,BESTA FERA!")
        "verde" -> println("PODE IR MEU AMOR")
        else -> println("Tem essa cor: $cor no semáforo? ATA, ACHEI QUE TINHA.")
    }

}
fun main(){
    outroSemaforo()
}

/**
 * Aqui criei um a função com construtor padrão vazio e no corpo criei
 * uma variavel que vai ser usada pelo when para verificar qual a cor correta que esta definida nela
 * ele faz, quando cor, for vermelho, print a msg, se for vermelho ela ja imprime e encerra, caso contrario ela vai ate encontrar,
 * caso contrario nenhuma corresponder, cai no else.
 *
 * E vocenão precisa repitir varias vezes a val cor para fazer a validação com no if
 */