fun main() {
    val temperatura = 17
    val descricao = when {
        temperatura < 0 -> "Muito frio"     // Quando a temperatura for menor que 0
        temperatura < 10 -> "Um pouco frio"// Quando a temperatura estiver entre 0 e 9
        temperatura < 20 -> "Quente"// Quando a temperatura estiver entre 10 e 19
        else -> "Quente demais"// Qualquer outro valor (20 ou mais)
    }
    println("A temperatura está: $descricao")
}



