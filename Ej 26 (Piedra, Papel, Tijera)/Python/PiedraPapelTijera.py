##DeathbatO

def calcular_ganador(jugadas):
    puntajes = {"Player 1": 0, "Player 2": 0}
    reglas = {"RS": "Player 1", "SP": "Player 1", "PR": "Player 1",
              "SR": "Player 2", "PS": "Player 2", "RP": "Player 2"}

    for jugada in jugadas:
        if jugada[0] == jugada[1]:
            continue  # Empate
        ganador = reglas[jugada[0] + jugada[1]]
        puntajes[ganador] += 1

    if puntajes["Player 1"] > puntajes["Player 2"]:
        return "Player 1"
    elif puntajes["Player 2"] > puntajes["Player 1"]:
        return "Player 2"
    else:
        return "Tie"

# Ejemplo de uso
jugadas = [("R","S"), ("S","R"), ("P","S")]
resultado = calcular_ganador(jugadas)
print("El ganador es:", resultado)
