package companioneobjects

object EstoqueDoJoshua  {

    val listaProdutos = mutableListOf<String>()

    fun addProdutos (produto: String){
        listaProdutos.add(produto)
    }

    fun exibirProdutos (){
        listaProdutos.forEach {
            println(it)
        }
    }

}