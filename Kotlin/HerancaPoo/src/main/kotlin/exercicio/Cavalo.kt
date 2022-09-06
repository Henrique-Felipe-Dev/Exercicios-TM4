package exercicio

class Cavalo(
    nome: String, idade: Int,
    corrida: Boolean
) : Animal(nome, idade){

    override fun emitirSom() {
        println("pocotó")
    }
}