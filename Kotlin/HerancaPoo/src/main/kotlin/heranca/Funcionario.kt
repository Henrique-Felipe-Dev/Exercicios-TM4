package heranca

open class Funcionario(
    nome: String,
    cpf: String,
    idade: Int,
    val registro: Int
) : Pessoa(nome, cpf, idade) {

    private val piso = 1500.0
    private var salario = 0.0

    fun calcularSalario(bonus: Double){
        salario = piso + (bonus * piso)
    }

    fun exibirSal(){
        println("R$$salario")
    }

    override fun correr() {
        //super - Indicar alguma coisa da classe pai
        super.correr()
        println("De Naruto >:^)")
    }

    //toString()
    override fun toString(): String {
        return "Nome: $nome\n" +
                "Cpf: $cpf\n" +
                "Idade: $idade\n" +
                "Registro: $registro\n" +
                "Salário: $salario"
    }

}