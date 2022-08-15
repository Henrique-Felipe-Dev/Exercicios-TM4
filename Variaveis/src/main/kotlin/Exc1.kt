import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main(){
    /*
    1 - O usuário digitará sua idade e o programa deverá printar o ano
    em que ele nasceu.
     */

    // LocalDate
    val ano = LocalDate.now().year

    println(ano)

    print("Você já fez aniversário este ano? (s/n) ")
    val resp = readln()

    val nasc: Int

    print("Digite sua idade: ")
    val idade = readln().toInt()

    if(resp == "s"){
        nasc = ano - idade
    }else{
        nasc = ano - (idade+1)
    }

    println("O seu ano de nascimento é: $nasc")

}