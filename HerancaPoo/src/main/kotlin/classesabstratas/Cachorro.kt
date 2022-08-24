package classesabstratas

class Cachorro(
    especie: String, nomeCientifico: String,
    habitat: String, ehCarnivoro: Boolean, sexo: String, idade: Int,
    val nome: String
) : Animal(especie, nomeCientifico, habitat, ehCarnivoro, sexo, idade){

    override fun correr() {
        println("Correndo como um dog")
    }

    override fun dormir() {
        println("Dormindo como um dog")
    }

    override fun andar() {
        println("Andando como um dog")
    }

    override fun comer() {
        println("Comendo como um dog")
    }

    override fun emitirSom() {
        println("Auau")
    }

    fun abanarRabo(){
        println("Abanando o Rabo")
    }

    fun rosnar(){
        println("Rosnar")
    }

}