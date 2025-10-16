fun main() {
    val num1 = 34
    val num2 = 153

    if (sumaDePotencias(num1)) {
        println("El número $num1 SÍ cumple la condición.")
    } else {
        println("El número $num1 NO cumple la condición.")
    }

    if (sumaDePotencias(num2)) {
        println("El número $num2 SÍ cumple la condición.")
    } else {
        println("El número $num2 NO cumple la condición.")
    }
}

fun sumaDePotencias(numero: Int): Boolean {
    var cantidadDeDigitos = 0
    var copiaDelNumero = numero
    while (copiaDelNumero > 0) {
        copiaDelNumero /= 10
        cantidadDeDigitos++
    }


    copiaDelNumero = numero
    var sumaTotal = 0

    while (copiaDelNumero > 0) {
        val digito = copiaDelNumero % 10

        var potenciaDelDigito = 1
        for (i in 1..cantidadDeDigitos) {
            potenciaDelDigito *= digito
        }

        sumaTotal += potenciaDelDigito
        copiaDelNumero /= 10
    }

    return sumaTotal == numero
}