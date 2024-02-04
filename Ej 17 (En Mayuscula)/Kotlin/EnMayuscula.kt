//DeathbatO

import java.util.Scanner;

fun mayus(frase: String): String {
    val fraseMayus = StringBuilder()
    val palabras = frase.split(" ")

    for (palabra in palabras) {
        if (palabra.isNotEmpty()) {
            fraseMayus.append(palabra[0].toUpperCase() + palabra.substring(1))
            fraseMayus.append(" ")
        }
    }
    return fraseMayus.toString().trim()
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Por favor ingrese una frase: ")
    val frase = scanner.nextLine()
    println("La frase con mayúsculas corregidas:")
    println(mayus(frase))
    scanner.close()
}