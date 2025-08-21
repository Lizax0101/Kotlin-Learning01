package AssuntosKT.RECE

fun process(obj: Any) {
    when (obj) {
        is String -> println("String: ${obj.uppercase()}")
        is Int -> println("Inteiro: ${obj + 10}")
        is Double -> println("Double: ${obj * 2}")
        else -> println("Tipo desconhecido")
    }
}

fun main() {
    process("Kotlin")
    process(42)
    process(3.14)
}