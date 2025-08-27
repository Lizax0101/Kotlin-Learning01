fun main() {

    val animal: Animal = Cachorro()

    animal.fazerSom()
    animal.comer()
    animal.dormir() //ERRO o método é private, quando deixa de ser private funciona normal.

    //Agora você também já está trabalhando arquivos de Classes em arquivos separados.
    // a class sem o main

}