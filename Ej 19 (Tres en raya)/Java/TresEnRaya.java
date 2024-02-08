//DeathbatO

public class TresEnRaya {
	
	// Función auxiliar para verificar si hay un ganador
    private static boolean checkWin(char matriz[][], char player) {
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0] == player && matriz[i][1] == player && matriz[i][2] == player) {
                return true; // Verificar filas
            }
            if (matriz[0][i] == player && matriz[1][i] == player && matriz[2][i] == player) {
                return true; // Verificar columnas
            }
        }
        // Verificar diagonales
        if (matriz[0][0] == player && matriz[1][1] == player && matriz[2][2] == player) {
            return true; // Diagonal principal
        }
        if (matriz[0][2] == player && matriz[1][1] == player && matriz[2][0] == player) {
            return true; // Diagonal secundaria
        }
        return false;
    }
	
	public static String Triqui(char matriz[][]){
		String charsValid = "XO ";
		int countX = 0, countO = 0; 
		// Verificacion de caracteres validos
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				char currentChar = matriz[i][j];
		        boolean isValid = false;
		        for (char c : charsValid.toCharArray()) {
		            if (currentChar == c) {
		                isValid = true;
		                break;
		            }
		        }
		        if(!isValid){
		        	return "ERROR: La matriz tiene uno o varios objetos no validos.";
		        }
				//Contando la cantidad de "X" y "O".
				if (matriz[i][j] == 'X') {
	                   countX++;
	               }else if (matriz[i][j] == 'O') {
	                   countO++;
	               }
			}
		}
		//Verificamos proporcion.
		if (Math.abs(countX-countO) >= 2) {
            return "Nulo";
        }
		boolean xWins = checkWin(matriz, 'X');
        boolean oWins = checkWin(matriz, 'O');

        // Verificar si ambas partes ganaron
        if (xWins && oWins) {
            return "Nulo";
        }
        // Verificar si "X" ha ganado
        if (xWins) {
            return "X";
        }
        // Verificar si "O" ha ganado
        if (oWins) {
            return "O";
        }
        // Verificar si hay un empate
        if (countX + countO == 9) {
            return "Empate";
        }
        return "Nulo";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char matriz[][] = new char [3][3];
		char matriz2[][] = new char [3][3];
		matriz[0][0] = 'X'; matriz[0][1] = 'X'; matriz[0][2] = 'O'; 
		matriz[1][0] = 'O'; matriz[1][1] = 'X'; matriz[1][2] = 'O';
		matriz[2][0] = 'O'; matriz[2][1] = 'O'; matriz[2][2] = 'X';
		
		matriz2[0][0] = 'X'; matriz2[0][1] = 'X'; matriz2[0][2] = 'X'; 
		matriz2[1][0] = 'O'; matriz2[1][1] = 'X'; matriz2[1][2] = 'O';
		matriz2[2][0] = 'O'; matriz2[2][1] = 'O'; matriz2[2][2] = 'O';
		
		
		System.out.println("Primer Juego: \n");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(matriz[i][j]+"  ");			
			}
			System.out.println("");
		}
		System.out.println("\nResultado: "+Triqui(matriz));
		
		System.out.println("Segundo Juego: \n");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(matriz2[i][j]+"  ");			
			}
			System.out.println("");
		}
		System.out.println("\nResultado: "+Triqui(matriz2));
	}

}