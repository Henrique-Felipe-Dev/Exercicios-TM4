package exercicio

fun main(){

    val cachorro = Cachorro(
        "Bob",
        5
    )

    println("Digite o nome: ")
    val nome = readln()

    println("Digite a idade: ")
    val idade = readln().toInt()

    var corrida: Boolean
    println("É de corrida? ")
    val resp = readln()

    corrida = resp == "s"

    val cavalo = Cavalo(
        nome,
        idade,
        corrida
    )

    val preguica = Preguica(
        "Flash",
        5
    )

    cachorro.emitirSom()
    cavalo.emitirSom()
    preguica.emitirSom()

    println(cachorro.nome)



}