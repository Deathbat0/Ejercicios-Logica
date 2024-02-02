// DeathbatO

import kotlin.text.toUpperCase


fun main() {
    val charsNoValid = ".,?_!"
    
    print("Por favor ingrese el texto inicial: ")
    var cadena = readLine()?.toUpperCase() ?: ""
    
    val palabras = cadena.split(" ").toMutableList()
    
    for (i in palabras.indices) {
        for (c in charsNoValid) {
            palabras[i] = palabras[i].replace(c.toString(), "")
        }
    }

    print("Ingrese la palabra que desea contar: ")
    val word = readLine()?.toUpperCase() ?: ""
    
    val count = palabras.count { it == word }

    println("La palabra $word se repite $count veces en el texto")
}