package EstruturaDeDados_Listas.Desafios

fun verificarMes1(mes: String) {
    when (mes.lowercase()) {
        "fevereiro" -> println("28 dias")
        "abril", "junho", "setembro", "novembro" -> println("$mes tem 30 dias.")
        "janeiro", "março", "maio", "julho", "agosto", "outubro", "dezembro" -> println("$mes tem 31 dias.")
        else -> println("Mês inválido.")
    }
}

fun main() {
    verificarMes1("Março")
    verificarMes1("junho")
    verificarMes1("teste")
}
