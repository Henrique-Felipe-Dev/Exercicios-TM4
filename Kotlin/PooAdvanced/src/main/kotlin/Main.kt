import companioneobjects.Calculadora
import companioneobjects.EstoqueDoJoshua
import encap.Estudante

fun main() {

    /*

    Companion Object - Atributos e métodos sem precisar instanciar uma classe;

    Objetos Anônimos - São objetos que só são instanciados uma única vez

    Encapsulamento - Deixar os nossos dados protegidos

    Exceção - Soltar exceções personalizadas e tratar essas exceções

     */

    //Exemplo utilizando o companion object
    /*
    val mult = companioneobjects.Calculadora.multiplicao(50.0, 6.0)

    println(mult)
     */

    /*
    EstoqueDoJoshua.addProdutos("Toddy")
    EstoqueDoJoshua.addProdutos("Macarrão")
    EstoqueDoJoshua.addProdutos("Margarina")

    EstoqueDoJoshua.exibirProdutos()
     */

    //val estudante1 = Estudante("Henrique", 5555)

    /*
    Tratamento de erros

    Try...Catch

    try{

        Bloco que o programa tentará executar

    }catch(armazenar o erro em uma variavel){

        Tratar o erro capturado

    }

     */

    /*
    while (true){
        try {
            val num = readln().toInt()
            break
        }catch (e: Exception){
            println(e.message)
        }
    }
     */

    /*
    Jogar exceções no programa

    throw Exception(mensagem do erro)
     */
    /*
    try {
        println("Digite o n1: ")
        val n1 = readln().toInt()

        println("Digite o n2: ")
        val n2 = readln().toInt()

    }catch (e: Exception){
        println(e.message)
    }
     */


}