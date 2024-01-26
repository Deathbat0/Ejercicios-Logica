## DeathbatO

def fact_rec(num):
    result = 1
    for i in range(1, num+1):    
        result = result * i
    return result

for i in range(5):
    num = int(input("Ingrese un numero para calcular su factorial: "))
    if num > 0:
        print(f"El facorial de {num} es {fact_rec(num)}")
    elif num == 0:
        print("El factorial de 0 es 1")
    else:
        print("ERROR: El numero es negativo")