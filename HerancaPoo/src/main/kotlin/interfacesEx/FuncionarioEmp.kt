package interfacesEx

interface FuncionarioEmp {

    var cargo: String
    var salario: Double
    var piso: Double

    fun calcularSalario(bonus: Double)

    fun exibirSalario()

}