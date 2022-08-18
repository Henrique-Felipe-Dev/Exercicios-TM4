import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    /*
    2- Faça um programa que entre com três números e coloque em ordem crescente.
     */
    /*
    print("Digite o primeiro número: ")
    val n1 = readln().toInt()

    print("Digite o segundo número: ")
    val n2 = readln().toInt()

    print("Digite o terceiro número: ")
    val n3 = readln().toInt()

    /*
    n1 - n2 - n3
    n1 - n3 - n2
    n2 - n1 - n3
    ...
     */

    println()

    if(n1 <= n2 && n2 <= n3){
        println("$n1 - $n2 - $n3")
    }else if(n1 <= n3 && n3 <= n2){
        println("$n1 - $n3 - $n2")
    }else if(n2 <= n1 && n1 <= n3){
        println("$n2 - $n1 - $n3")
    }else if(n2 <= n3 && n3 <= n1){
        println("$n2 - $n3 - $n1")
    }else if(n3 <= n2 && n2 <= n1){
        println("$n3 - $n2 - $n1")
    }else{
        println("$n3 - $n1 - $n2")
    }
     */

    /*
    Faça um programa em que permita a entrada de um número qualquer e exiba se este
    número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    ímpar exiba o número elevado ao quadrado.
     */

    print("Digite um número qualquer: ")
    val num = readln().toInt()

    if(num % 2 == 0){
        val aux = sqrt(num.toDouble())
        println("O número $num é par e sua raiz quadrada é: ${"%.2f".format(aux)}")
    }else{
        val aux = num.toDouble().pow(2)
        println("O número $num é ímpar e seu quadrado é: ${"%.2f".format(aux)}")
    }

}