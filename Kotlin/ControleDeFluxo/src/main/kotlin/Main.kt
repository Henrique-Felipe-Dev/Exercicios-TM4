import kotlin.math.pow

fun main() {

    /*

    Operadores Relacionais

    == - Igualdade
    != - Diferença
    > - Maior
    >= - Maior ou Igual
    < - Menor
    <= - Menor ou Igual

    Operadores Lógicos

    e ou - && ||

    Tabela Verdade

    &&
    VV - V
    VF - F
    FV - F
    FF - F

    ||
    VV - V
    VF - V
    FV - V
    FF - F

    Estrutura if...else

    Estrutura simples

    if(condicao){

        Os comandos que serão executados caso a condição seja verdadeira

    }else{

        Os comandos que serão executados caso a condição seja false

    }

    Estrutura composta

    if(condicao){

        Os comandos que serão executados caso a condição seja verdadeira

    }else if(condicao){

        Os comandos que serão executados caso a condição anterior seja falsa e se
        a nova condição for verdadeira

    }else{

        Os comandos que serão executados caso a condição seja false

    }
     */

    //Exemplo prático if...else
    /*
    val vida = readln().toInt()

    /*
    10 - Você está ótimo
    7 - Você está bem
    5 - Você está morrendo
    0 - Você está morto
     */

    if(vida <= 0){
        println("O personagem está morto")
    }else if(vida <= 5){
        println("O personagem está morrendo")
    }else if(vida <= 7){
        println("O personagem está bem")
    }else{
        println("O personagem está ótimo")
    }
     */

    //Exemplo de calculadora de imc

    /*
    print("Digite o seu peso: ")
    val peso = readln().toDouble()

    print("Digite a sua altura: ")
    val altura = readln().toDouble()

    val imc = peso / altura.pow(2)

    println("IMC: ${"%.2f".format(imc)}")

    println()
     */
    /*

    if..else sem os ranges

    if(imc < 18.5){
        println("Você está abaixo do peso")
    }else if(imc >= 18.5 && imc <= 24.9){
        println("Você está no peso ideal")
    }else if(imc >= 25.0 && imc <= 29.9 ){
        println("Você está sobrepeso")
    }else if(imc >= 30.0 && imc <= 39.9){
        println("Você está obeso")
    }else{
        println("Você está com obesidade grave")
    }
     */

    //Ranges - inicial..numeroFinal - imc in 18.5..24.9
    /*
    if(imc < 18.5){
        println("Você está abaixo do peso")
    }else if(imc in 18.5..24.9){
        println("Você está no peso ideal")
    }else if(imc in 25.0..29.9){
        println("Você está sobrepeso")
    }else if(imc in 30.0..39.9){
        println("Você está obeso")
    }else{
        println("Você está com obesidade grave")
    }
     */


    /*
    when - quando o valor tiver o resultado da condição, alguma coisa será executada

    when(variavel){

        valor -> executa a ação

    }
     */

    //Exemplo prático do when
    /*
    print("Digite um número de 1 a 3 e verifique como o programa te cumprimentará: ")
    val resp = readln().toInt()

    when(resp){
        1 -> {
            println("Oi")
            println("Tudo bem?")
        }
        2 -> println("Olá")
        3 -> println("Eae")
        else -> println("Número inválido")
    }
     */

    //Exemplo de when com ranges

    print("Digite um número de 1 a 12 para verificarmos se é um mês quente ou frio: ")
    val mes = readln().toInt()

    when(mes){

        in 1..3 -> println("Mês quente")
        in 4..6 -> println("Mês marromeno")
        in 7..9 -> println("Mês FRIO")
        in 10..12 -> println("Mês Pelando")

    }

}