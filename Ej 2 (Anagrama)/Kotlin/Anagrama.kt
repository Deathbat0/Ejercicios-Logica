//DeathbatO

fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
    if (palabra1 == palabra2 || palabra1.length != palabra2.length) {
        return false
    } else {
        var count = 0
        for (i in palabra1.indices) {
            for (j in palabra2.indices) {
                if (palabra1[i] == palabra2[j]) {
                    count++
                    break
                }
            }
        }
        return count >= palabra1.length
    }
}

fun main() {
    println("Vamos a verificar si dos palabras son un anagrama")
    print("Ingrese la primera palabra: ")
    val palabra1 = readLine() ?: ""
    print("Ingrese la segunda palabra: ")
    val palabra2 = readLine() ?: ""

    println(sonAnagramas(palabra1, palabra2))
}