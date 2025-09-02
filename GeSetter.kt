package Assuntos

class Pessoa {
    var nome: String = "Sem nome"
}

fun main() {
    val p = Pessoa()

    println(p.nome)   // getter abre a gaveta → "Sem nome"
    p.nome = "João"   // setter troca o papelzinho
    println(p.nome)   // getter abre a gaveta → "João"
}
