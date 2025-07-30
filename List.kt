fun main() {
    /**
    //listOf uma vez definida não pode mudar
    val myList: List<Int> = listOf(1, 2, 3, 4, 6)
    //List collection

    val list2: MutableList<Int> = mutableListOf(1, 2, 3, 4)
    // MutableListOf lista mutavel

    println(list2[0]) // acessando posição
    println(list2.size) // tamanho da lista

    list2.add(2)// adicionando elemento na lista
    list2.add(31)// adicionando elemento na lista
    list2.remove(2) // removendo um elemento da lista
    list2.removeAt(5) // removendo o elemento pela posição dele na lista
    println(list2.contains(0))// verificando se contem esse numero na lista
    //list2.clear()// limpa a lista
    println(list2)
     **/
    //------------------------------------------------------------------------------
// o set tambem é uma collection, set não é um conjunto alteranado
    /**val set1: Set<String> = setOf("berlim", "madri", "alemanha", "berlim")
    val set2: MutableSet<String> = mutableSetOf()

    println(set1)
     **/


// map
    //      mapOf de string/ string passo a chave e o valor
    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"), Pair("Alemanha", "Berlim"))
    val map2 =
        mutableMapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"), Pair("Alemanha", "Berlim"))
    println(map1)
    println(map1.entries)// todas as chaves(entradas)
    println(map1.values)// todos os valores associados as chaves

    // chave         // valor
    map2["Brasil"] = " Brasilia" // adicionando entrada no map2
    println(map2)

}