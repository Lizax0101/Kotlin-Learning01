package AssuntosKT.RECE

class Dirigindo{
    fun executarPassos(vararg passos:String){
        passos.forEachIndexed { index, string -> println("$index - $string") }
    }
}

fun main(){
    println("Começe a dirigir seguindo esses 8 passos:\n".uppercase())
    val dirigir = Dirigindo()
    dirigir.executarPassos(
    "Ajuste o banco.",
    "Coloque o cinto.",
    "Ajuste o retrovisor.",
    "Coloque o pé no freio.",
    "Afunde o pé até o final na embreagem.",
    "Abaixe o freio de mão.",
    "Ligue o carro.",
    "Passe a primeira marcha.",
    "Solte a embreagem devagar. PARABÉNS!"
    )
}