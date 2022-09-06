import { ContaBanco } from "./contabanco";

export class ContaCorrente extends ContaBanco{

    private limite = 0

    constructor(
        agencia: string,
        conta: string,
        titular: string,
        saldo: number,
        limite: number
    ){
        super(agencia, conta, titular, saldo)
        this.limite = limite
    }

    sacar(valor: number): void {
        if(valor > 0 && valor <= this.saldo + this.limite){
            this.saldo -= valor
            console.log(`Saque de R$${valor} realizado com sucesso!`)
        }else{
            console.log(`Saque de R$${valor} impossível de ser realizado`)
        }
    }

    depositar(valor: number): void {
        if(valor > 0){
            this.saldo += valor
            console.log(`Depósito de R$${valor} realizado com sucesso!`)
        }else{
            console.log(`Depósito de R$${valor} impossível de ser realizado`)
        }
    }

    alterarLimite(valor: number){
        if(valor > 0){
            this.limite = valor
            console.log("Limite alterado com sucesso")
        }else{
            console.log("Limite impossível de ser alterado")
        }
    }

}