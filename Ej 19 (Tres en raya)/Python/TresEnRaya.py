## DeathbatO

class TresEnRaya:
    
    def check_win(matriz, player):
        for i in range(3):
            if matriz[i][0] == player and matriz[i][1] == player and matriz[i][2] == player:
                return True  # Verificar filas
            if matriz[0][i] == player and matriz[1][i] == player and matriz[2][i] == player:
                return True  # Verificar columnas
        
        # Verificar diagonales
        if matriz[0][0] == player and matriz[1][1] == player and matriz[2][2] == player:
            return True  # Diagonal principal
        if matriz[0][2] == player and matriz[1][1] == player and matriz[2][0] == player:
            return True  # Diagonal secundaria
        
        return False
    
    def triqui(matriz):
        chars_valid = "XO "
        count_x = 0
        count_o = 0
        
        # Verificacion de caracteres validos
        for i in range(3):
            for j in range(3):
                current_char = matriz[i][j]
                if current_char not in chars_valid:
                    return "ERROR: La matriz tiene uno o varios objetos no validos."
                
                # Contando la cantidad de "X" y "O"
                if matriz[i][j] == 'X':
                    count_x += 1
                elif matriz[i][j] == 'O':
                    count_o += 1
        
        # Verificamos proporcion
        if abs(count_x - count_o) >= 2:
            return "Nulo"
        
        x_wins = TresEnRaya.check_win(matriz, 'X')
        o_wins = TresEnRaya.check_win(matriz, 'O')
        
        # Verificar si ambas partes ganaron
        if x_wins and o_wins:
            return "Nulo"
        
        # Verificar si "X" ha ganado
        if x_wins:
            return "X"
        
        # Verificar si "O" ha ganado
        if o_wins:
            return "O"
        
        # Verificar si hay un empate
        if count_x + count_o == 9:
            return "Empate"
        
        return "Nulo"

# Main
matriz = [['X', 'X', 'O'], ['O', 'X', 'O'], ['O', 'O', 'X']]
matriz2 = [['X', 'X', 'X'], ['O', 'X', 'O'], ['O', 'O', 'O']]

print("Primer Juego:\n")
for row in matriz:
    print("  ".join(row))
print("\nResultado:", TresEnRaya.triqui(matriz))

print("\nSegundo Juego:\n")
for row in matriz2:
    print("  ".join(row))
print("\nResultado:", TresEnRaya.triqui(matriz2))

