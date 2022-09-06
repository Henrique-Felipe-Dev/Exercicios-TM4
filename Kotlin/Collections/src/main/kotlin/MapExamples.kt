fun main(){

    /*
    Map (ou Dicionário) - Trabalho com chave e valor (por exemplo o código do funcionário
    e o funcionário em si, ou seja, algo parecido com 500 = Henrique)

    Pair<K, V>

    Pair<Int, String>

    Map Mutável
    Map Imutável
     */

    val funcionarios = mutableMapOf<Int, String>(
        123 to "Thays",
        521 to "Michell",
        168 to "Caroline"
    )

    funcionarios.forEach { (k, v) ->
        println("Código: $k, Nome: $v")
    }

    println("Digite o nome do funcionário: ")

    val nome = readln()
    while (true){
        val cod = (1..500).random()
        if(funcionarios.containsKey(cod)){
            println("Chave já cadastrada")
        }else{
            funcionarios[cod] = nome
            break
        }
    }

    funcionarios.forEach { (k, v) ->
        println("Código: $k, Nome: $v")
    }

}