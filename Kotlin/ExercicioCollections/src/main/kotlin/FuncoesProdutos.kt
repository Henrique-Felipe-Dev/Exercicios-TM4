val listaProdutos = mutableListOf<String>()

fun cadastrarProduto(produto: String){
    if(produto.isNotBlank()){
        listaProdutos.add(produto)
        println("Produto cadastrado com sucesso!")
    }else{
        println("Valor Inválido!")
    }
}

fun removerProdutos(produto: String){
    if(listaProdutos.contains(produto)){
        listaProdutos.remove(produto)
        println("Produto $produto removido com sucesso!")
    }else{
        println("Produto $produto não existe na lista")
    }
}

fun atualizarProdutos(produto: String){
    if(listaProdutos.contains(produto)){
        val posicao = listaProdutos.indexOf(produto)

        print("Digite o novo produto: ")
        val novoProduto = readln()

        listaProdutos[posicao] = novoProduto

        println("Produto atualizado com sucesso!")
    }else{
        println("Produto $produto não existe na lista")
    }
}

fun listarProdutos(){
    println("***Produtos***\n")
    listaProdutos.forEach {
        println(it)
    }
}