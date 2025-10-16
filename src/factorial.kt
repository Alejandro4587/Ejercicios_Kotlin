fun main() {
    var numero = 5
    var resultadomostrar = factorial(numero)
    println("El factorial de $numero es $resultadomostrar")
}

fun factorial(n: Int): Int {

    var resultado = 1
    for (i in 1..n) {
        val resultadoAnterior = resultado
        resultado *= i
        println("Calculo $i:  $resultadoAnterior x $i = $resultado")
    }
    return resultado
}