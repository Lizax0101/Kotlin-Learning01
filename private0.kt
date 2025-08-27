package AssuntosKT.RECE

 private class Frut(val nome: String)

 private fun pegueUmaFruta(): Frut{

    return Frut("Cereja")


}
fun main(){
    val f : Frut = pegueUmaFruta()
    println(f.nome)
}


/**
 * se a classe fosse privada e o metodo não, está tentando expor para fora do arquivo um tipo (Frut) que deveria estar escondido (porque é private).
 */