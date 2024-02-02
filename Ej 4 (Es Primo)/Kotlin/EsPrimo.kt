// DeathbatO

fun esPrimo(num: Int): Boolean {
    if (num == 2 || num == 3 || num == 5 || num == 7 || num == 11) {
        return true
    } else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num % 11 == 0) {
        return false
    } else {
        return true
    }
}

fun main() {
    for (i in 0 until 100) {
        if (esPrimo(i)) {
            println(i)
        }
    }
}