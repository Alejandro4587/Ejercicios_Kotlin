fun main() {

    val num = 73

    if(esPrimo(num)){
        println("$num es un numero primo")
    }else{
        println("$num no un numero primo")
    }

}

fun esPrimo(n: Int): Boolean {

    if(n <= 1) {
        return false
    }

    for (i in (n - 1) downTo 2) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}