class ProdutoEletronico (
    val nome: String,
    val marca: String,
    val processador: String,
    var carga: Double,
    val voltagem: Double
        ) {

    var ligado = false

    fun ligarDesligar(){
        if(ligado){
            ligado = false
            println("Produto Desligado")
        }else{
            ligado = true
            println("Produto Ligado")
        }
    }

    fun carregar(valor: Double){
        if(valor > 0){
            carga += valor
            println("Carga de $valor realizada, carga total: $carga")
        }
    }

}