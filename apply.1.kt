

data class Chamada(var nome: String = "", var idade: Int = 0, var statusAula: String = "")
//valor padrao definido nos atributos

fun main() {
    val alunos = listOf(
        Chamada("Jose", 17, "Presente"),
        Chamada("Maria", 18, "Faltou"),
        Chamada("Edjane", 50, "Presente")
    )

    val relatorio = StringBuilder().apply {
        appendLine("=== Relatório de Presença ===\n")
        alunos.forEachIndexed { index, aluno ->
            appendLine("${index + 1}. Nome: ${aluno.nome}")
            appendLine("   Idade: ${aluno.idade}")
            appendLine("   Status: ${aluno.statusAula}\n")
        }
        appendLine("Total de alunos: ${alunos.size}")
    }.toString()

    println(relatorio)
}