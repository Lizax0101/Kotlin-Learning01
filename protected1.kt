package Assuntos

open class Paciente(val nome: String, val data: String){
    protected fun verificarPressao(){
        println("Resultado: A pressão esta ok.")
    }
}
class Consulta(nome: String, data:String): Paciente(nome, data){
    fun acao(){
        println("Informações: $nome realizou a consulta em $data")
        verificarPressao()
    }
}

fun main(){
    val consulta = Consulta("Mavika", "27/08/2025")
    consulta.acao()
}