fun main() {

    val cantidadnumprimos = 20

    println("Los cantidad de numeros primos es $cantidadnumprimos y son : ")
    agruparPrimo(cantidadnumprimos)

}

fun agruparPrimo(n: Int) {

    var buscadorprimos = 0
    var numeroinicial = 2

    while (numeroinicial < n) {

        if (numPrimo(numeroinicial)) {
            println("$numeroinicial primo")
            buscadorprimos++
        }
        numeroinicial++
    }
}

fun numPrimo(n: Int): Boolean {
    if (n <= 1) {
        return false
    }
    for (i in (n - 1) downTo 2) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}