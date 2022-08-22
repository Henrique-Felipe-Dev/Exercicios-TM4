fun main() {

    /*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados
    desse estoque, o programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.
     */

    while (true){

        println()

        println("1 - Cadastrar Produtos")
        println("2 - Remover Produtos")
        println("3 - Atualizar Produtos")
        println("4 - Listar Produtos")
        println("5 - Sair\n")

        print("Opção: ")

        when(readln().toInt()){
            1 -> {
                println("Digite o produto a ser cadastrado: ")
                val produto = readln()
                cadastrarProduto(produto)
            }
            2 -> {
                println("Digite o produto a ser removido: ")
                val produto = readln()
                removerProdutos(produto)
            }
            3 -> {
                println("Digite o produto a ser atualizado: ")
                val produto = readln()
                atualizarProdutos(produto)
            }
            4 -> {
                listarProdutos()
            }
            5 -> break
            else -> println("Valor Inválido")
        }
    }
}