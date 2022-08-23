package companioneobjects

class Calculadora {

    companion object{

        var n1 = 0
        var n2 = 0

        fun soma(n1: Double, n2: Double): Double{
            return n1 + n2
        }

        fun subtracao(n1: Double, n2: Double): Double{
            return n1 - n2
        }

        fun divisao(n1: Double, n2: Double): Double{
            return n1 / n2
        }

        fun multiplicao(n1: Double, n2: Double): Double{
            return n1 * n2
        }

    }

}