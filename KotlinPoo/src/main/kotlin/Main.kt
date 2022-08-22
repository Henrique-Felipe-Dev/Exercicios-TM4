fun main() {

    /*
    Classes e Objetos

    Classe Cachorro
        Atributos (ou Estados) - raça, nome, cor, patas, idade, rabo
        Métodos (ou Comportamentos) -  correr, darAPata, latir, uivar, morder,
        julgar...

    Classe Pessoa
        Atributos - Nome, Idade, cpf, rg, nacionalidade, sexo


    class identificador () {

        Atributos e Métodos

    }

     */

    //Criar um objeto derivado da classe - Instância
    /*
    val jemeremias = Pessoa()

    println(jemeremias.nome)

    jemeremias.nome = "Jemeremias"
    jemeremias.idade = 25
    jemeremias.cpf = "000000000000-00"
    jemeremias.rg = "0000000000-0"
    jemeremias.nacionalidade = "BR"
    jemeremias.sexo = "Masculino"

    println(jemeremias.nome)
     */

    /*

    Classe Conta Banco
        Atributos - Nome, Agencia, Conta, Saldo
        Métodos - Consultar Saldo, Sacar, Depositar

    Construtores

     */

    println("Digite o nome do cliente: ")
    val titular = readln()

    println("Digite a agencia: ")
    val agencia = readln()

    println("Digite a conta: ")
    val conta = readln()

    println("Digite o saldo inicial: ")
    val saldo = readln().toDouble()

    val conta1 = ContaBanco(
        titular, agencia,
        conta, saldo,
        true, 1000.0,
        true
    )

    conta1.consultarSaldo()

    conta1.saque(500.0)

    conta1.consultarSaldo()

    conta1.deposito(1500.0)

    conta1.consultarSaldo()

}