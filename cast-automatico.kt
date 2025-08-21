package AssuntosKT.RECE

fun checkType(obj: Any) {
    if (obj is String) {
        println("É uma String com tamanho ${obj.length}") // cast automático
    }
    if (obj is Int) {
        println("É um Int com valor $obj")
    }
    if (obj is Double) {
        println("É UM Double ${obj + 10}")
    }
}

fun main() {
    checkType("Rodrigo")
    checkType(123)
    checkType(2)
}