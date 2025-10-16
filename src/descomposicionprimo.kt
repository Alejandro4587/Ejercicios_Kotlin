fun main(){

    val numero = 245
    val factores = descomposicion(numero)
    println("Los factores primos de $numero son : $factores")

}

fun descomposicion(n: Int): List<Int> {

    val factores = mutableListOf<Int>()
    var num = n
    var divisor = 2

    while (num > 1) {
        if (num % divisor == 0) {
            factores.add(divisor)
            num /= divisor
        } else {
            divisor++
        }
    }

    return factores
}

