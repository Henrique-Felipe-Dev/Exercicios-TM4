import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Scanner

fun main() {

    /*

    declaracao identificador: tipo = valor
    var idade: Int = 10

    Type Inference - O kotlin já consegue associar um tipo em uma variável a partir
    do momento que declararmos ela com um valor inicial

    var idade = 10

     */

    //Exemplo prático utilizando as variáveis

    /*
    val nome = "Henrique"
    val idade = 21
    val altura = 1.75
    val comidaFavorita = "Temaki"

    //Concatenação
    /*
    + - Funciona, mas não é o jeito mais prático
    $ - Concatenação dentro da String
     */

    println("Olá, meu nome é $nome, tenho $idade anos de idade, minha altura é $altura " +
            "e minha comida favorita é $comidaFavorita")
     */

    /*
    Input do usuário

    Scanner

    readLine()

    readln()
     */

    //Exemplo utilizando o Scanner
    /*
    val leitura = Scanner(System.`in`)

    print("Digite o seu nome: ")
    val nome = leitura.next()

    print("Digite a sua idade: ")
    val idade = leitura.nextInt()

    println("Nome: $nome, Idade: $idade")
     */

    //readLine() ou readln()
    /*
    print("Digite o seu nome: ")
    val nome = readln()

    //Conversores de Tipo - to Tipo (por exemplo, toInt())
    print("Digite a sua idade: ")
    val idade = readln().toInt()

    print("Digite a sua altura: ")
    val altura = readln().toDouble()

    println("Nome: $nome, idade: $idade, altura: $altura")
     */

    //Exemplo utilizando cálculos
    /*
    print("Digite o salário do funcionário: ")
    val sal = readln().toDouble()

    print("Digite a porcetagem do aumnento: ")
    val aum = readln().toDouble()

    val salAum = sal * (aum / 100)

    println("O aumento de $aum% no salário do funcionário, " +
            "ficaria: R$salAum. E o valor final do salário ficou: R$${salAum + sal}")
     */

}