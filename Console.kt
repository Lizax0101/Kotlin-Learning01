class Console {

    fun readInt(msg: String): Int {
        do {

            var retorno: Int? = null

            print(msg)
            val info = readLine()

            if (info != null && info != "") {
                retorno = info.toIntOrNull()
                if (retorno == null)
                    println("valor invalido")
            } else {
                println(" valor invalido 2")
            }
        } while (retorno == null || retorno <= 0)

        return 0
    }
}