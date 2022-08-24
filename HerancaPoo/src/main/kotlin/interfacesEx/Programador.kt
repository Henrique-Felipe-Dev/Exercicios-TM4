package interfacesEx

import classesabstratas.Animal

class Programador(
    override var nome: String,
    override val rg: String,
    override var idade: Int,
    override var cargo: String,

) : PessoaFisica, FuncionarioEmp {

    override var salario = 0.0
    override var piso = 1500.00

    override fun falar() {
        println("Falando sobre código")
    }

    override fun andar() {
        println("Andando com sono")
    }

    override fun calcularSalario(bonus: Double) {

    }

    override fun exibirSalario() {

    }

}