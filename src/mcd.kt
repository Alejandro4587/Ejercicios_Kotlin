fun main() {
    val num1 = 50
    val num2 = 30
    val resultado = mcd(num1, num2)

    println("El maximo comun divisor de $num1 y $num2 es : $resultado")
}

fun mcd(num1: Int, num2: Int): Int {

    var mcdnum = 1

    val numgrande = if (num1 < num2) num1 else num2

    for (i in 1..numgrande) {

        if (num1 % i == 0 && num2 % i == 0) {
            mcdnum = i
        }
    }
    return mcdnum
}

