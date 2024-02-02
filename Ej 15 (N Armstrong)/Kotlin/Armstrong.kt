// DeathbatO

import kotlin.math.pow
import java.util.Scanner

fun esNarcisista(num: Int): Boolean{
    var org = num
    var sum = 0
    var len = num.toString().length

    while(org != 0){
        val mod = num % 10
        sum += mod.toDouble().pow(len).toInt()
        org /= 10
    }
    return num == sum
}

fun main(){
    val sc = Scanner(System.`in`)

    repeat(5) {
        print("Por favor, ingrese un número: ")
        val num = sc.nextInt()
        sc.nextLine()

        if (num > 0) {
            if (esNarcisista(num)) {
                println("El número $num es Narcisista.")
            } else {
                println("El número $num NO es Narcisista.")
            }
        } else {
            println("El número debe ser mayor a cero...")
        }
    }
    sc.close()
}