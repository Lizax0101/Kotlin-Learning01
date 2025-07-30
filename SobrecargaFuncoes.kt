// VALOR PADRÃO                      // VALOR PADRÃO
fun cadastroUsuario(nome: String = "Desconhecido", idade: Int, isAdmin: Boolean = false) {
    println("Nome:$nome  Idade:$idade  Administrador:$isAdmin")

}

fun somar(a: Int, b: Int): Int {
    return a + b
}

fun multiplicar(c: Double, d: Double): Double {
    return c * d
}


fun main() {
    cadastroUsuario(
        nome = "Lizandra",
        idade = 27,
        isAdmin = false
    ) // AQUI TAMBEM ESPECIFIQUEI MAS NÃO PRECISA, ELE IRA RECEBER O PADRÃO
    println("--------------------------------------------------------------------------------------------")
    cadastroUsuario(idade = 17, nome = "Lua", isAdmin = true)// AQUI ESPECIFIQUEI O ADM
    println("--------------------------------------------------------------------------------------------")
    cadastroUsuario(idade = 18)// ESSES RECEBEM O VALOR PADRÃO DEFINIDO LA NA VARIAVEL
    println("--------------------------------------------------------------------------------------------")
    cadastroUsuario(idade = 18, nome = "Lucio")// ESSES RECEBEM O VALOR PADRÃO DEFINIDO LA NA VARIAVEL
    println("--------------------------------------------------------------------------------------------")
    cadastroUsuario("Ana", 14)// ESSES RECEBEM O VALOR PADRÃO DEFINIDO LA NA VARIAVEL, fora de ordem
    println("--------------------------------------------------------------------------------------------")


    val resultadoMultiplicacao = multiplicar(3.5, 9.8)
    println("Resultado da multiplicação: ${"%.2f".format(resultadoMultiplicacao)}") // string formatada


    //val resultadoSoma = somar(3, 7) não preciso guardar o valor aqui, posso fazer isso la dentro do println
    println("Resultado soma: ${somar(3, 7)}") // interpolação apenas


    // println(${"%..2f.format(resultadoMultiplicacao"})) errado

//exemplo sobrecarga funçoes
}