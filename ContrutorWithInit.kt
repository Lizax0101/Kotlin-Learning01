package AssuntosKT.RECE

class Cliente(val nome: String, var email: String) {

    var ativo: Boolean = true

    init {// Construtor secundário (caso não tenha email no momento)
        require(email.contains("@")) { "Email invalido" }
        println("Cliente $nome criado com sucesso.")
    }

    constructor(nome: String) : this(nome, "email@vazio.com") {
        ativo = false
    }
}

fun main() {
    val cliente1 = Cliente("Liza", "liza@gmail.com")
    val cliente2 = Cliente("Lyz")
    println("${cliente1.nome}, ${cliente1.email}")

    println(cliente2.email)// acessou a mensagem definida no inicializador, como eu não defini um email para este cleinte

}
