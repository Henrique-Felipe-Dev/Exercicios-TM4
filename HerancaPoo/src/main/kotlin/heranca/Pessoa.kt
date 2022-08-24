package heranca

//open - Define que a classe poderá ser herdada
open class Pessoa (
    var nome: String,
    val cpf: String,
    var idade: Int
    ) {

    var corDaPele = "Não especificado"
    var corDoCabelo = "Não especificado"

    //open - indicando open no método indica que ele vai poder ser sobrescrito
    //na classe filha
    open fun correr(){
        println("Correndo")
    }

    fun andar(){
        println("Andando")
    }

}