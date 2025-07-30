package EstruturaDeDados_Listas

fun umaMensagem() {

    while (true) {
        println("Você tem uma nova mensagem! Digite 'open' para abrir:")
        val entrada = readln().trim().lowercase()

        if (entrada == "open") {
            println("Abrindo mensagem...\n")

            println(StringBuilder().apply {
                //val msg=  StringBuilder().apply
                appendLine("Nova mensagem (1) ")
                appendLine("Enviado por: [Adm-1.0] ")
                append("Lizandra,conserta o codigo na linha 34.\n")
                append("Você tem até amanhã,para me entregar ok?")
            }.toString())
            break
        } else {
            println("Comando invalido... tente outra vez\n")
        }

    }
}
// println(msg)
fun main() {
    umaMensagem()
}


// com apply ja podemos chamar append direto

/**
 * msg - variavel que guarda a instancia de StringBuilder
 * StringBuilder() - quando escrevo isso crio um novo objeto, ou seja uma instancia da classe stringBuilder
 * (instancia é um objeto criado apartir de uma classe)
 *
 *SEM O APPLY - eu precisaria fazer uma chamda de metodo no objeto (msg)
 * .append("texto aqui") - chama o metodo append que adiciona texto ao  final do conteúdo do StringBuilder.
 *
 * appendLine e append, conceito parecido com print e printl
 * println  e  print, conceito parecido com print e printl
 */


































































