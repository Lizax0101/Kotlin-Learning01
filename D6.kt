package EstruturaDeDados_Listas.Desafios

fun cadastro(vararg dados: String): Boolean{
    return dados.all { it.isNotBlank() }

}

fun main() {

    val nome: String = "Rodrigo"
    val email: String = "rodrigo@albuquerque.com"
    val senha: String = "1234"

    if(!cadastro(nome, email, senha)){
        println("Por favor, preencha todos os campos!")
    } else{
        println("Todos os campos preenchidos!")
    }

}

/*
Saída:
Todos os campos preenchidos!
*/