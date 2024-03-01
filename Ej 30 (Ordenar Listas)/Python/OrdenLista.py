##DeathabtO


"""
    Función implementada para ordenar la lista proporcionada de manera ascendente o descendente
    según el parámetro ord.
    :param lst: Lista a ordenar (enteros)
    :param ord: Orden en el que se quiere dejar la lista ("Asc" o "Desc")
    :return: Retorna la lista ordenada según la especificación
"""

def order_list(lst, ord):
    if ord == "Asc":
        for i in range(len(lst) - 1):
            for j in range(len(lst) - 1):
                if lst[j] > lst[j + 1]:
                    lst[j], lst[j + 1] = lst[j + 1], lst[j]

    elif ord == "Desc":
        for i in range(len(lst) - 1):
            for j in range(len(lst) - 1):
                if lst[j] < lst[j + 1]:
                    lst[j], lst[j + 1] = lst[j + 1], lst[j]

    else:
        print("ERROR: Método de ordenamiento inválido")
    return lst


# Ejemplo de uso
list1 = [2, 4, 6, 8, 9]
list2 = [1, 24, 54, 62, 36, 0, 84]
    
print("Ordenar las listas")
print("Primera lista:")
print(list2)
print("Ordenada:")
print(order_list(list2, "Asc"))
print("Segunda lista:")
print(list1)
print("Ordenada:")
print(order_list(list1, "Desc"))
