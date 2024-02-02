//DeathbatO

import kotlin.math.pow

fun areaPoligono(pol: Char): String {
    return when (pol.toUpperCase()) {
        'T' -> {
            val base = readLine()!!.toFloat()
            val altura = readLine()!!.toFloat()
            val area = (base * altura) / 2
            "El área del triángulo es: ${"%.2f".format(area)}"
        }
        'C' -> {
            val lado = readLine()!!.toFloat()
            val area = lado.pow(2)
            "El área del cuadrado es: ${"%.2f".format(area)}"
        }
        'R' -> {
            val ancho = readLine()!!.toFloat()
            val largo = readLine()!!.toFloat()
            val area = ancho * largo
            "El área del rectángulo es: ${"%.2f".format(area)}"
        }
        else -> "Esa no era una opción"
    }
}

fun main() {
    println("Vamos a calcular el área de un polígono")
    print("Digita T para triángulo, C para cuadrado o R para rectángulo: ")
    val pol = readLine()!!.firstOrNull()
    println(areaPoligono(pol ?: ' '))
}