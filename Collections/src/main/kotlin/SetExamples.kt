fun main(){

    /*
    Set - Como a lista, ele também armazanará diversos valores, terá um tamanho variado,
    porém ele ignora qualquer tipo de valor duplicado

    Set Imutável
    Set Mutavel
     */

    val idades = mutableSetOf(1, 1, 1, 1, 1, 1, 2)

    println(idades.size)

    idades.add(1)

    println(idades.size)

    val setNome = mutableSetOf("Henrique", "Henrique")

}