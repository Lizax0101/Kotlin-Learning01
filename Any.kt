fun valores(value: Any): Any {
    return value
}
// Any assume qualquer tipo de dado

// Unit - função sem retorno

//Nothing - Tipo de dado mas não tem retorno , pode ser um nada
//podemos usalo para retornar um excessao da função

fun nada(parametroNothing: Any): Nothing{
    TODO(" Não implementado ainda")

    // tambem não consigo retornar nada com nothing porque ele é um nada
}
fun main() {
    print(valores("Aceito string, ou qualquer outro tipo de dado"))
}

