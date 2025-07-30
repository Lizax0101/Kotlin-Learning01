fun main(){
    val str: String by lazy {
        println("Inicializando agora")
        "Eu sou o lazy"
    }
    println(str)
}