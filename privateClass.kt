package AssuntosKT.RECE

private class ValidarUsuario {

    fun validarUser(usuario: String) = usuario.isNotBlank()
    fun validarKey(senha: String) = senha.length >= 6
}

class Condicao {
    private val verificacao = ValidarUsuario()// ELE SÓ PODE SER ACESSADO ATRAVES DESSA CLASSE

    fun entrar(usuario: String, senha: String) {
        if (verificacao.validarUser(usuario) && verificacao.validarKey(senha)) {
println("Resposta: Logado com sucesso!")
        }else{
            println("Resposta:Senha invalida. Verifique e tente novamente.")
        }
    }
}
fun main(){
    val entrada = Condicao()
    entrada.entrar("Luk","12345")// senha menor que 6 digitos, precisa ser maior ou igual a 6
    entrada.entrar("Liza","123453")//ambas condições são verdadeiras
    entrada.entrar("Lyz","1234531")//ambas condições são verdadeiras
    entrada.entrar("","123458")//basta que uma seja falsa para que o resultado seja false
}