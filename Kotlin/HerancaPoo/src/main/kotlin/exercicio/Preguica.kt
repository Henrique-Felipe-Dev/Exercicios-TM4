package exercicio

class Preguica(
    nome: String, idade: Int
) : Animal(nome, idade){

    override fun emitirSom() {
        println("Voz do Sid")
    }

    override fun locomocao() {
        println("Subindo em Árvores")
    }

}