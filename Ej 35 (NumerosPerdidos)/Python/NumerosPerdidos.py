def find_missing_numbers(arr):
    # Verificar si el array es válido
    if not isinstance(arr, list) or len(arr) == 0:
        raise ValueError("El array de entrada no es válido")

    # Verificar si el array está ordenado y no tiene elementos repetidos
    if arr != sorted(arr) or len(arr) != len(set(arr)):
        raise ValueError("El array de entrada no está ordenado o tiene elementos repetidos")

    min_num = arr[0]
    max_num = arr[-1]
    missing_numbers = []

    # Calcular los números faltantes entre el mayor y el menor
    for i in range(min_num + 1, max_num):
        if i not in arr:
            missing_numbers.append(i)

    return missing_numbers

# Ejemplo de uso:
sorted_array = [1, 2, 4, 5, 7, 10]
try:
    missing = find_missing_numbers(sorted_array)
    print("Números faltantes:", missing)
except ValueError as e:
    print(e)
