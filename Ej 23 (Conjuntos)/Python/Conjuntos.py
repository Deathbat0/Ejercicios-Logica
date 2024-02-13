def encontrar_elementos(array1, array2, buscar_comunes):
    if buscar_comunes:
        conjunto1 = set(array1)
        conjunto2 = set(array2)
        elementos_comunes = list(conjunto1.intersection(conjunto2))
        return elementos_comunes
    else:
        conjunto1 = set(array1)
        conjunto2 = set(array2)
        elementos_no_comunes = list(conjunto1.symmetric_difference(conjunto2))
        return elementos_no_comunes

# Ejemplo de uso:

array1 = [1, 2, 3, 4, 5, 6]
array2 = [4, 5, 6, 7, 8, 9]

resultado_comunes = encontrar_elementos(array1, array2, True)
resultado_no_comunes = encontrar_elementos(array1, array2, False)

print("Elementos comunes:", resultado_comunes)
print("Elementos no comunes:", resultado_no_comunes)


