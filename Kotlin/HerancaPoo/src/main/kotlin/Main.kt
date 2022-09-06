import heranca.Funcionario
import heranca.Pessoa

fun main() {

    /*
    O que aprenderemos?

    Herança - Classes pais (superclasses) e classes filhas

    Polimorfismo - Usar métodos com o mesmo nome, mas que executam coisas diferentes

    Classes abstratas - Classes pais que não podem ser instanciadas, apenas seus filhos
    que poderão criar novos objetos

    Interface - Interfaces que vão servir como um contrato entre ela e suas filhas
     */

    /*

    Pessoa (Classe pai ou superclasse)
        Funcionario
        Estudante

     */

    val funcionario = Funcionario(
        "Henrique", "65465144564", 21, 1564
    )

    funcionario.calcularSalario(0.6)

    funcionario.exibirSal()

    funcionario.correr()

    println(funcionario)


}