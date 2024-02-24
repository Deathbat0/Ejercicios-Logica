## DeathbatO

def son_ortogonales(vector1, vector2):
    if len(vector1) != len(vector2):
        return False

    producto_punto = sum(vector1[i] * vector2[i] for i in range(len(vector1)))
    return producto_punto == 0


longitud = int(input("Ingrese la longitud de los vectores: "))

vector1 = []
vector2 = []

    # Ingreso de elementos para el primer vector
print("Ingrese los elementos del primer vector:")
for i in range(longitud):
    elemento = int(input(f"Elemento {i + 1}: "))
    vector1.append(elemento)

# Ingreso de elementos para el segundo vector
print("Ingrese los elementos del segundo vector:")
for i in range(longitud):
    elemento = int(input(f"Elemento {i + 1}: "))
    vector2.append(elemento)

# Verificando si los vectores son ortogonales
if son_ortogonales(vector1, vector2):
    print("Los vectores son ortogonales.")
else:
    print("Los vectores no son ortogonales.")