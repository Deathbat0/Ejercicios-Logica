//DeathbatO

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

fun calcularDiferenciaEnDias(fecha1: String, fecha2: String): Int{
    try{
        val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        val f1 = dateFormat.parse(fecha1)
        val f2 = dateFormat.parse(fecha2)

        val diferenciaEnMillis = Math.abs(f1!!.time - f2!!.time)
        val diferenciaEnDias = diferenciaEnMillis / (24 * 60 * 60 * 1000)

        return diferenciaEnDias.toInt()
    }catch (e: ParseException) {
        throw IllegalArgumentException("Una o ambas fechas no son válidas", e)
    }
}

fun main(){
    val sc = Scanner(System.`in`)

    print("Digite una fecha en formato dd/MM/yyyy: ")
    val fecha1 = sc.next()
    print("Digite una fecha en formato dd/MM/yyyy: ")
    val fecha2 = sc.next()

    val diferencia = calcularDiferenciaEnDias(fecha1, fecha2)
    println("La diferencia en días entre $fecha1 y $fecha2 es: $diferencia días.")
}