fun main() {
    try {
        val a: String? = null // NullPointer

       // val b = 10 / 0 // não é possivel dividir por zero

        println(a!!.length)

    } catch (e: NullPointerException) {
        println(" Exeception capturada. Fui executada porque a variavel é nula")

    //} catch (e: ArithmeticException) {
    //    println("Impossivel dividir por zero")

    } finally {
        println("Sempre serei executado independente da excessao")
    }

    println("Aqui finalizamos a execução. FIM ")
}