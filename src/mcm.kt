fun main() {
    val num1 = 5
    val num2 = 3
    val resultado = mcm(num1, num2)

    println("El minimo comun multiplo de: $num1 y $num2 es : $resultado")

}

fun mcm(num1: Int, num2: Int): Int {

    var numerogrande = if (num1 > num2) num1 else num2

    while (true) {
        if (numerogrande % num1 == 0 && numerogrande % num2 == 0) {
            return numerogrande
        }

        numerogrande++
    }

}