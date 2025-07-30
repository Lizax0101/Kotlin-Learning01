fun bonusWhen(cargo: String): Float {
    //var bonus = Float
    return when (cargo) {
        "Diretor" -> 3000f
        "Professor" -> 2000f
        "Aluno" -> 600f
        else -> 0f
    }
}

fun loop(){ // decrementando de 100 ate 1, enquanto i for menor que zero
    var i = 100
    while(i > 0) {
        print("$i ")
        i--
    }


}
    fun main() {
        //println( bonusWhen("Diretor"))
        //loop()

    }
