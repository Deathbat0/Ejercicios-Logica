//DeathbatO

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Conversor de tiempo a milisegundos>>  \n")
    print("Digite el numero de dias: ")
    val dias = sc.nextInt()
    print("Digite el numero de horas: ")
    val horas = sc.nextInt()
    print("Digite el numero de minutos: ")
    val min = sc.nextInt()
    print("Digite el numero de segundos: ")
    val seg = sc.nextInt()

    println("\nEl resultado en milisegundos es ${convTiempo(dias, horas, min, seg)}")
}

fun convTiempo(dias: Int, horas: Int, min: Int, seg: Int): Long{
    val mils = (seg * 1000) + (min * 60000) + (horas * 3600000) + (dias * 3600000 * 24)
    return mils
}