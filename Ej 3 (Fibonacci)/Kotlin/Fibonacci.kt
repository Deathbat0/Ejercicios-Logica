// DeathbatO

fun main() {
    var val1 = 0
    var val2 = 1

    for (i in 1 until 50) {
        print("$val1 ")
        val fib = val1 + val2
        val1 = val2
        val2 = fib
    }
}