fun main() {

    /*
    enquanto - while
    faca enquanto - do...while
    para - for
     */

    /*

    Estrutura while

    while(condicao){

        Código que será repetido enquanto a condição for verdadeira

    }
     */
    /*
    var cont = 0

    while (true){
        println("askdjlasdf")
        println("Quer sair do programa? ")
        val resp = readln()

        if(resp == "s"){
            break //Sempre quebra qualquer estrutura de looping
        }
    }
     */

    /*
    Estrutura do do...while

    do{

        Código que será executado pelo menos uma vez e vai se repetir se a condição
        for verdadeira

    }while(condicao)

     */
    /*
    do{

        println("Tem o Pete e o Repete, o Pete morreu, quem sobrou?")
        val resp = readln()

    }while(resp == "Repete" || resp == "repete")

     */

    /*
    Estrutura do for

    No portugol - para(variavel; condicao; incremento/decremento)

    No kotlin:

    for(variavel range/collection){

        Codigo que será repetido com base na variável de controle

    }

    ex: for (i in 1..10)

     */

    print("Digite um número para calcularmos sua tabuada: ")
    val tab = readln().toInt()

    //downTo - Range de forma decrescente
    //step - vai indicar o número de passos entre o range
    //until - fará o range normalmente, porém desconsiderará o último número
    for(i in 1..10){
        println("$tab X $i = ${tab * i}")
    }

}