## DeathbatO

# Definir las fuerzas de cada raza
fuerzas = {
    'Pelosos': 1,
    'Sureños buenos': 2,
    'Enanos': 3,
    'Númenóreanos': 4,
    'Elfos': 5,
    'Sureños malos': 2,
    'Orcos': 2,
    'Goblins': 2,
    'Huargos': 3,
    'Trolls': 5
}

# Función para calcular el resultado de la batalla
def resultado_batalla(ejercito_bien, ejercito_mal):
    fuerza_total_bien = sum(fuerzas[raza] for raza in ejercito_bien)
    fuerza_total_mal = sum(fuerzas[raza] for raza in ejercito_mal)
    
    integrantes_bien = len(ejercito_bien)
    integrantes_mal = len(ejercito_mal)
    
    if fuerza_total_bien * integrantes_bien > fuerza_total_mal * integrantes_mal:
        return "El bien triunfa en la batalla!"
    elif fuerza_total_bien * integrantes_bien < fuerza_total_mal * integrantes_mal:
        return "El mal prevalece en la batalla!"
    else:
        return "¡Es un empate!"

# Ejemplo de uso
ejercito_bien = ['Elfos', 'Númenóreanos', 'Pelosos']
ejercito_mal = ['Trolls', 'Orcos', 'Goblins']

print(resultado_batalla(ejercito_bien, ejercito_mal))
