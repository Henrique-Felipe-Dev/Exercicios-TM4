package classesabstratas

class Gato(
    especie: String, nomeCientifico: String, habitat: String,
    ehCarnivoro: Boolean, sexo: String, idade: Int
) : Animal(especie, nomeCientifico, habitat, ehCarnivoro, sexo, idade){

    override fun correr() {
        println("Correndo como um cat")
    }

    override fun dormir() {
        println("Dormindo como um cat")
    }

    override fun andar() {
        println("Andando como um cat")
    }

    override fun comer() {
        println("Comendo como um cat")
    }

    override fun emitirSom() {
        println("Miau")
    }

    fun executarCoisasAleatorias(){
        println("Fazendo coisas aleatórias como um cat")
    }

    fun ronronar(){
        println("Ronronando")
    }

    fun arranhar(){
        println("Arrancando pele de ser humano")
    }


}