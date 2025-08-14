package AssuntosKT.RECE

abstract class LojaSucos(val nomeLoja: String) {
    var aceitaCartao: String =""
    abstract fun metLojS()
}
class Franquia(nomeLoja: String): LojaSucos(nomeLoja){
    override fun metLojS() {
        println("Nome: $nomeLoja funciona até as 17:00h")//implementado, existe um corpo no metodo sobrescrito
    }
}

fun main(){
    val lojS = Franquia("Sucos do nordeste")
    lojS.aceitaCartao = "sim"
    lojS.metLojS()
    println("Aceita cartão? ${lojS.aceitaCartao}")
}