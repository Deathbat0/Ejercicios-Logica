## DeathbatO

def ciclo_sexagenario(año):
    # Lista para almacenar los elementos y animales
    elementos = ["Madera", "Fuego", "Tierra", "Metal", "Agua"]
    animales = ["Rata", "Buey", "Tigre", "Conejo", "Dragón",
                "Serpiente", "Caballo", "Oveja", "Mono", "Gallo",
                "Perro", "Cerdo"]

    # Cálculo del año dentro del ciclo sexagenario
    ciclo = (año - 1984) % 60

    # Obtención del elemento y animal correspondiente
    indice_elemento = (ciclo // 2) % 5
    indice_animal = ciclo % 12

    # Impresión del resultado
    print("Elemento:", elementos[indice_elemento])
    print("Animal:", animales[indice_animal])

# Solicitar al usuario que ingrese un año
año = int(input("Introduce un año: "))
ciclo_sexagenario(año)
