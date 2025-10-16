fun main(){

    val numero = 300
    val factores = descomposicionArray(numero)
    println("Los factores primos de $numero son : $factores")

}

fun descomposicionArray(n: Int): ArrayList<Int> {

    val factores = ArrayList<Int>()
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
