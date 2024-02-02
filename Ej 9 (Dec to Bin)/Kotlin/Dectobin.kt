//DeathbatO

import kotlin.math.pow

fun main() {
    for (i in 0 until 9) {
        print("Digite el numero a convertir: ")
        val numero = readLine()?.toInt() ?: 0
        var num = numero
        var expo = 0
        var bin = 0

        var tempNumero = numero
        while (tempNumero != 0) {
            val dig = tempNumero % 2
            bin += dig * 10.0.pow(expo).toInt()
            expo++
            tempNumero /= 2
        }

        println("El numero $num en binario es: $bin")
    }

    println("Programa Finalizado")
}