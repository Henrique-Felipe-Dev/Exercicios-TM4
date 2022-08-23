package exercicio

fun main(){

    try {

        print("Digite o seu nome: ")
        val nome = readln()

        print("Digite o endereço: ")
        val end = readln()

        print("Digite seu telefone: ")
        val tel = readln()

        val cliente = Cliente(nome, end, tel)

        while (true){

            println()
            println("***Menu***")
            println("1 - Adicionar compra")
            println("2 - Remover compra")
            println("3 - Listar compras")
            println("4 - Sair")

            print("Opc: ")
            val opc = readln().toInt()
            println()

            when(opc){

                1 -> {
                    print("Digite o produto que deseja adicionar: ")
                    val prod = readln()
                    cliente.addCompra(prod)
                }
                2 -> {
                    print("Digite o produto que deseja remover: ")
                    val prod = readln()
                    cliente.removeCompra(prod)
                }
                3 -> {
                    cliente.exibirCompras()
                }
                4 -> break
                else -> println("Opção Inválida")

            }

        }

    }catch (e: Exception){
        println(e.message)
    }

}