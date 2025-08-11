package AssuntosKT.RECE

class constrPrimario(val loguin: String, val senha: Int)

fun main() {
    val constP = constrPrimario("Liza", 12345)
    // constP.loguin
    //constP.senha
    println("Meu loguin: ${constP.loguin} e minha senha:${constP.senha}")


}
/**
 * Acesso as propriedades da classe com construtor primario atraves do objeto criado constP
 */