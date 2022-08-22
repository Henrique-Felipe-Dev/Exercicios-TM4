/*
    Classe Conta Banco
        Atributos - Nome, Agencia, Conta, Saldo
        Métodos - Consultar Saldo, Sacar, Depositar
*/

/*
Construtores são informações que serão exigidas a partir do monento da criação de um
objeto
    Os construtores já serão declarados como atributos da classe
 */

class ContaBanco (
    var titular: String,
    var agencia: String,
    val conta: String,
    var saldo: Double
        ) {

    //Construtores secundários

    var limite = false
    var saldoLimite = 0.0
    var chequeEspecial = false

    constructor(
        titular: String,
        agencia: String,
        conta: String,
        saldo: Double,
        limite: Boolean,
        saldoLimite: Double
    ): this(titular, agencia, conta, saldo){
        this.limite = limite
        this.saldoLimite = saldoLimite
    }

    constructor(
        titular: String,
        agencia: String,
        conta: String,
        saldo: Double,
        limite: Boolean,
        saldoLimite: Double,
        chequeEspecial:  Boolean
    ): this(titular, agencia, conta, saldo, limite, saldoLimite){
        this.chequeEspecial = chequeEspecial
    }

    //Declarando os métodos

    fun consultarSaldo(){
        println("O saldo da conta é R$$saldo")
    }

    fun saque(valor: Double){
        if(saldo > 0.0 && valor <= saldo){
            saldo -= valor
            println("Saque de R$$valor realizado com sucesso!")
        }else{
            println("Saque de R$$valor impossível de ser realizado!")
        }
    }

    fun deposito(valor: Double){
        if(valor > 0.0){
            saldo += valor
            println("Deposito de R$$valor realizado com sucesso!")
        }else{
            println("Deposito de R$$valor impossível de ser realizado!")
        }
    }

}