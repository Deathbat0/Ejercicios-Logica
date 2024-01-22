## DeathbatO

for i in range(9):
    numero = int(input("Digite el numero a convertir: "))
    num = numero
    expo = 0
    bin = 0
    while numero != 0:
        dig = numero % 2
        bin = bin + dig * pow(10, expo)
        expo += 1
        numero = numero//2
    print(f"El numero {num} en binario es: {bin}")

print("Programa Finalizado")