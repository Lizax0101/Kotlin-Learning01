package Assuntos


/**
 * O setter entra em ação e organiza automaticamente.
 * Quando imprimimos println(ranking.pontuacoes), o getter retorna o field,
 * que agora contém a lista já tratada
 *
 *
 * setter dentro de listas organiza os valores antes de guardar no field
 *
 * ranking.pontos = mutableListOf(900,750,900,176,500,256,1000,1,0)
 *
 * o Kotlin chama automaticamente o setter da propriedade.
 * O parâmetro value é justamente o novo valor que estão tentando atribuir à propriedade.
 *
 * field = value.sortedDescending().toMutableList()
 *
 *“Pegue a lista recebida (value), ordene em ordem decrescente (sortedDescending()),
 * converta novamente para lista mutável (toMutableList()),
 * e só então guarde dentro do field”.
 *
 * ranking.pontuacoes = mutableListOf(100, 200, 50, 400)
 * O setter intercepta a atribuição.
 *
 * Em vez de guardar (750,0,1,900), ele transforma em (900,750,1,0).
 *
 * Assim, a regra da classe é: "qualquer lista de pontuações sempre fica ordenada do maior para o menor".
 *
 * getter → controla como a propriedade é lida.
 *
 * setter → controla como a propriedade é modificada.
 *
 *
 * set(value) {
 *     field = value.sortedDescending().toMutableList()
 * }
 *
 * value → é a lista que você tentou atribuir (750,0,1,900).
 *
 * value.sortedDescending() → transforma em (900,750,1,0).
 *
 * .toMutableList() → garante que ainda seja uma lista mutável.
 *
 * field = ... → salva o resultado final dentro da propriedade pontuacoes.
 *
 * field é o armazenamento real por trás da propriedade.
 *
 *  você nunca acessa field diretamente de fora da classe. Ele só existe dentro do getter/setter.
 *  voce só tem acesso ao field aqui dentro da classe onde esta a propriedade var
 *
 *
 *
 */