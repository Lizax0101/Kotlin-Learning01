fun main() {
    val nome: String = "caixa" //   objeto = tipo ou seja nome é do objeto string,no objeto string temos
    // uma propriedade chamada length
    val tamanhoNome = nome.length
    println(tamanhoNome)

    //               Objeto
    val segundoNome: String = "Aurora" // Objeto = tipo
    val novoNme = nome.uppercase() // funçao  que muda o comportamento de um objeto(string)
    val numero = nome.length // acesa a propriedade de um objeto (string)

    println(segundoNome)


    //formatação de textos, com aspas triplas
    val welcome = """
        Ola, Lizandra,
        Seu pedido chegou, confirme via aplicativo. 
        Agradecemos a preferencia! 
        """.trimIndent()// serve para aparar as arestas vai puxar o texto para o canto do texto no output, vai identar o texto

    println(welcome)

    val people = " Alan Maia"
    val age = 25
    println("Ola," + people + ". Sua idade é " + age)// concatenando texto e variavel, esse jeito é bagunçado

    println( " Ola $people sua idade é $age, seu nome tem ${people.length} letras, que legal.")// esse é um jeito mais sofisticiado de formatar essa string
}