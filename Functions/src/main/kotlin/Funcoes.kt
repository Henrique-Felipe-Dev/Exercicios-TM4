import kotlin.math.pow
import kotlin.math.sqrt
/*
    Funções - blocos de código que nós poderemos chamar em qualquer momento do nosso
    programa

    Funções com retorno - Funções que retornarão um valor, que pode ser armazenado
    em uma variável ou simplesmente printados dentro de um println, por exemplo

    Funções sem retorno - Funções que vão fazer algum cálculo específico ou
    simplesmente realizar algum tipo de output
*/

/*
    Estrutura de uma função no Kotlin

    fun identificador (parametros): Tipo{

        Bloco de código que poderá ser chamado diversas vezes

    }
*/

//Parâmetros - Vão ser valores que obrigatoriamente teremos que passar na chamada da
//função, para ela ser executada da maneira correta

//Declaração de função sem retorno
fun verificarVida(vida: Int) {
    if (vida <= 0) {
        println("Você está morto! Vida: $vida")
    } else if (vida <= 5) {
        println("Personagem está morrendo! Vida: $vida")
    } else if (vida <= 9) {
        println("Personagem está bem! Vida: $vida")
    } else {
        println("Personagem está ótimo! Vida: $vida")
    }
}

fun printarOi() {
    println("Oi")
}

//Declaração de função com retorno
fun printarNomeMaiusculo(nome: String): String {
    return nome.uppercase()
}

fun soma(n1: Int, n2: Int): Int{
    return n1 + n2
}

fun raizOuPotencia(num: Double): Double{
    return if(num < 0){
        num.pow(2)
    }else{
        sqrt(num)
    }
}