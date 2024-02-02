// DeathbatO

fun main() {
    print("Por favor ingrese la cadena a invertir: ")
    val cadena = readLine() ?: ""
    
    println("Cadena invertida:")
    var k = cadena.length - 1
    while (k >= 0) {
        println(cadena[k])
        k--
    }
}