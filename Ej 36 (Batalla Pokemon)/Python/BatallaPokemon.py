## DeathbatO

def calcular_efectividad(tipo_atacante, tipo_defensor):
    # Tabla de efectividad
    # El primer índice corresponde al tipo del atacante y el segundo al tipo del defensor
    efectividad = {
        'Agua': {'Agua': 1, 'Fuego': 0.5, 'Planta': 2, 'Eléctrico': 1},
        'Fuego': {'Agua': 2, 'Fuego': 1, 'Planta': 0.5, 'Eléctrico': 1},
        'Planta': {'Agua': 0.5, 'Fuego': 2, 'Planta': 1, 'Eléctrico': 1},
        'Eléctrico': {'Agua': 1, 'Fuego': 1, 'Planta': 1, 'Eléctrico': 1}
    }
    
    return efectividad[tipo_atacante][tipo_defensor]


def calcular_danio(tipo_atacante, tipo_defensor, ataque, defensa):
    efectividad = calcular_efectividad(tipo_atacante, tipo_defensor)
    danio = 50 * (ataque / defensa) * efectividad
    return danio


def main():
    tipo_atacante = input("Tipo del Pokémon atacante: ")
    tipo_defensor = input("Tipo del Pokémon defensor: ")
    ataque = int(input("Ataque (entre 1 y 100): "))
    defensa = int(input("Defensa (entre 1 y 100): "))

    if ataque < 1 or ataque > 100 or defensa < 1 or defensa > 100:
        print("Error: El valor de ataque y defensa debe estar entre 1 y 100.")
        return

    danio = calcular_danio(tipo_atacante, tipo_defensor, ataque, defensa)
    print(f"El daño del ataque es: {danio:.2f}")


if __name__ == "__main__":
    main()
