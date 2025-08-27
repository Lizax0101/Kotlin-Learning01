open class Animal {
    open fun fazerSom(){
        println("Som genérico")
    }

    open fun comer(){
        println("O Animal está comendo...")
    }

     fun dormir(){ //private
        println("O animal está dormindo...")
    }
}

class Cachorro: Animal(){

    override fun fazerSom(){
        println("O cachorro está latindo")
    }

    override fun comer(){
        println("O cachorro está comendo...")
    }

}
