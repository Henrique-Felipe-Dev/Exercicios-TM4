package classesabstratas

//abstract
abstract class Animal (
    val especie: String,
    val nomeCientifico: String,
    val habitat: String,
    val ehCarnivoro: Boolean,
    val sexo: String,
    val idade: Int
        ){

    abstract fun correr()

    abstract fun dormir()

    abstract fun andar()

    abstract fun comer()

    open fun emitirSom(){
        println("Emitindo som como um animal")
    }

}