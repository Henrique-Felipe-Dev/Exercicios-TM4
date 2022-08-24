package polimorfismo

fun main (){
    /*

    Sobrecarga de Métodos - Métodos com o mesmo nome, porém com parâmetros diferentes,
    que vão consequentemente executar outras funções

    Sobrescrita de Métodos - Métodos com o mesmo nome, os mesmos parâmetros, só que
    executando coisas diferentes (Dentro de Classes filhas)

     */

    soma(2.0, 4.0)

}

fun soma(n1: Int, n2: Int): Int{
    return n1 + n2
}

//Sobrecarga de Métodos
fun soma(num1: Double, n2: Double): Double{
    return num1 + n2
}

fun soma(n1: Double, n2: Int): Double{
    return n1 + n2
}