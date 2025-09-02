package Assuntos

class Quarto {
    var Cor_lencol: String = "AZUL"
        set(value) {
            println("Alterando o FIELD(campo) de $field para $value")
            field = value
        }
}
fun main(){
    val quarto = Quarto()
    quarto.Cor_lencol = "ROSA"
    println(quarto.Cor_lencol)
}

/***
 * o getter lê azul que esta no field
 * o set substitue o valor desse fild por rosa.
 * precisa usar o field para o valor ser salvo
 *
 * "Azul" é o valor inicial guardado no field.
 *
 * field é o valor cru, interno que armazena a propriedade.
 *
 * Cor_lencol é a interface pública pra acessar esse field.
 *
 * Getter/Setter = como você lê ou altera esse field
 */