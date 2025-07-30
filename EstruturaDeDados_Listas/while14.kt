package EstruturaDeDados_Listas

fun main() {

    val lista = mutableListOf("POP 110i 2025", "Start 160", "Fan 150")// criei uma lista mutavel com tres itens

    while (true) { //passei true como paramento p while( enquanto verdade...

        println("Digite o número da moto que deseja remover:")// essa mensagem aparecerá enquanto while for vdd
        lista.forEachIndexed { index, item -> println("${index + 1} - $item") }//chamei lista, vou acessa-la por meio do index(posição + item)
        //e vou printar na tela a posição + 1 porque ? poque geralmente o indice começa em 0,1,2 ... então quero que inicie apartir do numero 1
        // então print posição + o item da lista que esta nessa posição

        print("Escolha a opção: ")// ele vai escolher um numero de 1 a 3
        val opcao =
            readln().trim()//a variavel opção vai receber por entrada de dados esse valor e se o usuario digitar algum espaço seguido do numero, o ponto trim ira fazer a remoção

        val entrada =
            opcao.toIntOrNull()//val entrada, recece a opção escolhida que sera convertida em Inteiro ou se a entrada for vazia, retorna null

        if (entrada != null && entrada in 1..lista.size) {//o if faz checagem, se a entrada for diferente de nulo ou a entrada estiver entre 1 e o tamanho da lista
            val remover =
                lista.removeAt(entrada - 1) //a variavel remover recebe a lista, o removeAt remove o item na posição indicada(aqui dentro ´passamos o argumento para o metodo removeAt) se fosse entrada +1 ela iria sempre pegar o item posterior a posição digitada

            if (lista.isEmpty()) { //Verifica se a lista está vazia, ex: voce removeu todos os itens da lista que é de tamanho 3, quando voce vai remover o 4 item
                println("A lista está vazia, não há nada pra remover")// esse if é acionado, e verifica a lista é vazia ? se sim, mostra a mensagem e para o loop com break;
                break // para
            }

            println("$remover removida com sucesso.")// mostra uma mensagem com o item removido p o usuario
            println("Restam:")//
            lista.forEachIndexed { index, item -> println("${index + 1} - $item") }// aqui ele mostra percorre a lista e retorna as posições que restaram na lista e printa as novas posições atualizadas
        } else
            println("Opção inválida, tente novamente...")// caso eu digite uma opção invalida, else entra em ação mostrando a msg de erro e tente novamente

    }
}