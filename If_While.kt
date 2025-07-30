fun main() {

    var number = 1
    var dobrar = 1

    if (isPositive1(number)){

        while (number < 11){
            dobrar += dobrar
            println(dobrar)
            number++

        }
    } else {
        println("Caiu no else")
    }
}

fun isPositive1(number: Int):Boolean{
    return number > 0
}