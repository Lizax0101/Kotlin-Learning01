open class Protegido {

    protected val nome = "Lizandra"
    protected val idade = 28

    protected fun pessoa() {
        println(
            "METODO, Protegido. Estou escondido na classe mãe Protegido, " +
                    "consigo acessar o nome:" +
                    " $nome e a idade: $idade , são propredades" +
                    " protegidas pela classe mãe."
        )
    }

    protected fun irmaoPessoa() {
        println("METODO, irmãoPessoa. Tambem estou escondido na classe mãe Protegido. E tambem tenho acesso á $nome e $idade")
    }
}

class Filha : Protegido() {
    fun metodoFilha() {
        println("\nSou o meotodo da subclasse Filha, meus amigos tambem estao aqui.\nConsigo apresenta-los para vocês através do meu corpo:\n")
        pessoa()
        irmaoPessoa()
    }
}


fun main() {
    val filha = Filha()
    filha.metodoFilha()
}

//esses metodos são visiveis apenas nas subclasses e na propria classe, não é possivel instanciar diretamente
// a instancia é feita atraves da classe filha e seu metodo
