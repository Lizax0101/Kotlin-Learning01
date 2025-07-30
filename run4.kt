package EstruturaDeDados_Listas

fun main() {
    data class AprovadosConcurso(val nome: String, val classificacao: Int, val cargo: String)

    //instancia
    val apConcurso = AprovadosConcurso("Lizandra X. Albuquerque", 1, "Ciencias Aeronáuticas")

    val validar = apConcurso.run { // acessando dados do obj com this
        // dentro desse bloco, `this` é o próprio apConcurso
        if (nome == "Lizandra X. Albuquerque") {// validando nome, e retornando uma msg
            "$nome, classificacao(a) em $classificacao° lugar para cargo de $cargo"

        } else {
            "Nome diferente do esperado"
        }
    }
    println(validar)
}
