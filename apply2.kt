package EstruturaDeDados_Listas

data class Chamada(var nome: String = "", var idade: Int = 0, var statusAula: String = "")

val alunos = listOf(

    Chamada().apply {
        nome = "Jose"
        idade = 17
        statusAula = "Presente"
    },
    Chamada().apply {
        nome = "Maria"
        idade = 18
        statusAula = "Faltou"
    },

    //Aqui

)

fun main() {
    alunos.forEachIndexed { index, nomeIdadeStatusAula ->
        println("${index + 1}: Aluno: ${nomeIdadeStatusAula.nome}, " +
                " Idade: ${nomeIdadeStatusAula.idade}, " +
                " Status: ${nomeIdadeStatusAula.statusAula}"
        )
    }

    val aluno1 = Chamada()
    aluno1.nome = "Lucas"
    aluno1.idade = 17
    aluno1.statusAula = "Presente"

    val aluno2 = Chamada()
    aluno2.nome = "Mateus"
    aluno2.idade = 18
    aluno2.statusAula = "Faltou"

    val alunos = listOf(aluno1, aluno2)

}
















    /*
    Saida:
    [Nome: Rodrigo, Letras -> 7, Nome: Liza, Letras -> 4, Nome: Edjane, Letras -> 6, Nome: Rejane, Letras -> 6]

    Listando...
    Nome: Rodrigo, Letras -> 7
    Nome: Liza, Letras -> 4
    Nome: Edjane, Letras -> 6
    Nome: Rejane, Letras -> 6
     */
