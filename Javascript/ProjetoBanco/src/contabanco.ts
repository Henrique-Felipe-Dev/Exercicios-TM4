export abstract class ContaBanco {

    private agencia: string
    private conta: string
    private titular: string
    protected saldo: number

    constructor(
        agencia: string,
        conta: string,
        titular: string,
        saldo: number
    ){
        this.agencia = agencia
        this.conta = conta
        this.titular = titular
        this.saldo = saldo
    }

    /*

    Kotlin - fun identificador(parametros): tipo{}

    Typescript - identificador(parametros): tipo{}

    */

    /*
    Encapsulamento

    public - pode ser acessado de qualquer arquivo
    private - pode ser acessado apenas no arquivo
    protected - pode ser acessado na classe pai e nas filhas

    */

    abstract sacar(valor: number): void

    abstract depositar(valor: number): void

    consultarSaldo(){
        console.log(`Saldo da conta R$${this.saldo}`)
    }

}