open class Animal

class Cachorro(val nome: String) : Animal()

class Gato(val nome: String) : Animal()

class Girafa(val nome: String) : Animal()

fun main() {

    val listaAnimais: List<Animal> = listOf(Gato("Lilo"), Cachorro("Rex"), Girafa("Gina"))

    for (animal in listaAnimais) {
        val cachorro = animal as? Cachorro
        if (cachorro != null) {
            println("O nome do cachorro é ${cachorro.nome}")
        }

        val gato = animal as? Gato
        if (gato != null) {
            println("O nome do gato é ${gato.nome}")
        }

        val animalAleatrio = animal as? Cachorro
        if (animalAleatrio != animalAleatrio) {// não executa porque é false, pq não é diferente é igual
            println("Animal aleatorio é diferente")
        }

        val girafa = animal as? Girafa
        if (girafa != null){
            println("Nome da Girafa is ${girafa.nome}")

        }
    }

}