## DeathbatO

def maximo_comun_divisor(a, b):
    """
    Calcula el máximo común divisor (MCD) de dos números enteros a y b.
    """
    while b:
        a, b = b, a % b
    return a

def minimo_comun_multiplo(a, b):
    """
    Calcula el mínimo común múltiplo (mcm) de dos números enteros a y b.
    """
    if a == 0 or b == 0:
        return 0
    return abs(a * b) // maximo_comun_divisor(a, b)

# Ejemplo de uso
num1 = 12
num2 = 18
print("MCD de", num1, "y", num2, "es:", maximo_comun_divisor(num1, num2))
print("MCM de", num1, "y", num2, "es:", minimo_comun_multiplo(num1, num2))