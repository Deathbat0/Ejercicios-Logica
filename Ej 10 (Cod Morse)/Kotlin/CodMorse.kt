//DeathbatO

val morseDict = mapOf(
    'A' to "·—", 'B' to "—···", 'C' to "—·—·", 'D' to "—··", 'E' to "·", 'F' to "··—·",
    'G' to "——·", 'H' to "····", 'I' to "··", 'J' to "·———", 'K' to "—·—", 'L' to "·—··",
    'M' to "——", 'N' to "—·", 'O' to "———", 'P' to "·——·", 'Q' to "——·—", 'R' to "·—·",
    'S' to "···", 'T' to "—", 'U' to "··—", 'V' to "···—", 'W' to "·——", 'X' to "—··—",
    'Y' to "—·——", 'Z' to "——··", '0' to "—————", '1' to "·————", '2' to "··———",
    '3' to "···——", '4' to "····—", '5' to "·····", '6' to "—····", '7' to "——···",
    '8' to "———··", '9' to "————·", '.' to "·—·—·—", ',' to "——··——", '?' to "··——··",
    ' ' to " "
)

val reverseMorseDict = morseDict.entries.associateBy({ it.value }, { it.key })

fun toMorse(cadena: String): String {
    var morse = ""
    for (char in cadena) {
        morse += morseDict[char.toUpperCase()] + " "
    }
    return morse.trim()
}

fun toText(cadena: String): String {
    val words = cadena.split("   ")
    var ttext = ""
    for (word in words) {
        val let = word.split(" ")
        for (l in let) {
            ttext += reverseMorseDict[l]
        }
        ttext += " "
    }
    return ttext.trim()
}

fun main() {
    println("\t------Traductor de Codigo Morse-----")
    repeat(5) {
        print("\nPor favor digita el texto que deseas traducir: ")
        val cadena = readLine()?.toUpperCase() ?: ""
        val result = if ('·' in cadena) toText(cadena) else toMorse(cadena)
        println(result)
    }

    println("\n\n\t-----Programa Finalizado-------")
}