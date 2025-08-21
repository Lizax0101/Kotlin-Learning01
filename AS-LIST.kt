open class Sentimento
//super class generica(modelo) sem contrutor e nem corpo

class Alegria(val nome: String, val confir: String) : Sentimento()//classe filha que herda da superclasse

class Tristeza(val nome: String) : Sentimento()//classe filha que herda da superclasse



fun mostrarCada(at: Sentimento) {//Função que recebe um parametro do tipo superclasse, então ela tambem pode usar os parametros das filhas.
    when (at) {// when sendo usado pra verificar quando for do tipo superclasse, e faz a verificação com is
        is Alegria -> println("${at.nome.uppercase()} esta alegre? ${at.confir}.")
        is Tristeza -> println("${at.nome} esta triste.")
    }
}

fun main() {
    val listando: List<Sentimento> = listOf(Alegria("Alic", "Sim"), Tristeza("Ayla"))
    for (item in listando) {
        mostrarCada(item)
    }
}