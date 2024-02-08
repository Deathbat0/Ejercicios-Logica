class TresEnRaya {
    companion object {
        private fun checkWin(matriz: Array<Array<Char>>, player: Char): Boolean {
            for (i in 0 until 3) {
                if (matriz[i][0] == player && matriz[i][1] == player && matriz[i][2] == player) {
                    return true // Verificar filas
                }
                if (matriz[0][i] == player && matriz[1][i] == player && matriz[2][i] == player) {
                    return true // Verificar columnas
                }
            }
            // Verificar diagonales
            if (matriz[0][0] == player && matriz[1][1] == player && matriz[2][2] == player) {
                return true // Diagonal principal
            }
            if (matriz[0][2] == player && matriz[1][1] == player && matriz[2][0] == player) {
                return true // Diagonal secundaria
            }
            return false
        }

        fun triqui(matriz: Array<Array<Char>>): String {
            val charsValid = "XO "
            var countX = 0
            var countO = 0
            // Verificacion de caracteres validos
            for (i in matriz.indices) {
                for (j in matriz[i].indices) {
                    val currentChar = matriz[i][j]
                    if (!charsValid.contains(currentChar)) {
                        return "ERROR: La matriz tiene uno o varios objetos no validos."
                    }
                    // Contando la cantidad de "X" y "O".
                    if (matriz[i][j] == 'X') {
                        countX++
                    } else if (matriz[i][j] == 'O') {
                        countO++
                    }
                }
            }
            // Verificamos proporcion.
            if (Math.abs(countX - countO) >= 2) {
                return "Nulo"
            }
            val xWins = checkWin(matriz, 'X')
            val oWins = checkWin(matriz, 'O')

            // Verificar si ambas partes ganaron
            if (xWins && oWins) {
                return "Nulo"
            }
            // Verificar si "X" ha ganado
            if (xWins) {
                return "X"
            }
            // Verificar si "O" ha ganado
            if (oWins) {
                return "O"
            }
            // Verificar si hay un empate
            if (countX + countO == 9) {
                return "Empate"
            }
            return "Nulo"
        }
    }
}

// Main
fun main() {
    val matriz = arrayOf(
        arrayOf('X', 'X', 'O'),
        arrayOf('O', 'X', 'O'),
        arrayOf('O', 'O', 'X')
    )
    val matriz2 = arrayOf(
        arrayOf('X', 'X', 'X'),
        arrayOf('O', 'X', 'O'),
        arrayOf('O', 'O', 'O')
    )

    println("Primer Juego:\n")
    for (row in matriz) {
        println(row.joinToString("  "))
    }
    println("\nResultado: ${TresEnRaya.triqui(matriz)}")

    println("\nSegundo Juego:\n")
    for (row in matriz2) {
        println(row.joinToString("  "))
    }
    println("\nResultado: ${TresEnRaya.triqui(matriz2)}")
}
