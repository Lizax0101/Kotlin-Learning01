fun saudar(nome: String): String{//
    // Função que retorna uma saudação personalizada
    return "Olá, $nome! Seja bem vindo!"

}
fun main(){
    val mensagem = saudar("Jose")
    // Chama a função com o nome "Maria"
    print(mensagem)
}