fun programacao(p: String, k: String): String{
    return "Linguagens 2024 $p , $k"

}
fun estude(pp: String, kk: String): String{
    val recebeProgramcao = programacao(pp, kk)
    print(recebeProgramcao)
    return recebeProgramcao

}

fun main(){
    estude("Python",  "Kotlin")
}