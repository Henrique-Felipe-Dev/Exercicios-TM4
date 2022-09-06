fun main() {

    /*
    //Exemplo de função sem retorno
    println("kkkkkkkkkk")

    //Exemplo de função com retorno
    val nome = readln()

    println("$nome")
     */

    //Exemplo chamando função sem retorno

    var vida = readln().toInt()

    //Inimigo deu 3 de dano
    vida -= 3

    verificarVida(vida)

    //Inimigo deu 3 de dano
    vida -= 4

    verificarVida(vida)

    //Inimigo deu 3 de dano
    vida -= 6

    verificarVida(vida)


    //Exemplo chamando função com retorno
    /*
    print("Digite o seu nome para ver ele em letras maiúsculas: ")
    val name = readln()

    //Chamando a função direto no println()
    //println("O seu nome em letras maiúsculas é: ${printarNomeMaiusculo(name)}")

    val nomeMaiusculo = printarNomeMaiusculo(name)

    println("O seu nome em letras maiúsculas é: $nomeMaiusculo")
     */

    //println("A soma entre 3 e 4 é: ${soma(3, 4)}")
}



