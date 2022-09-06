package exercicio

class Cachorro(
    nome: String,
    idade: Int
) : Animal(nome, idade){

    override fun emitirSom() {
        println("Au au")
    }

    override fun toString(): String {
        return "Cachorro $nome"
    }


}