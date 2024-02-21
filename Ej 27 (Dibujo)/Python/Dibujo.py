##DeathbatO

def draw_square(size):
    for i in range(size):
        for j in range(size):
            print("*", end=" ")
        print()

def draw_triangle(n):
    for i in range(1, n + 1):
        print(" " * (n - i), end="")
        print("*" * (2 * i - 1))


print("----Vamos a dibujar-----")
print("Por favor ingrese la figura que quiere dibujar")
print("[C] Para cuadrado o [T] para triángulo.")
entr = input(" >>> ")
fig = entr.upper()[0]
if fig == 'C':
    print("Vamos a dibujar un Cuadrado")
    size = int(input("Dijita por favor el tamaño: "))
    draw_square(size)
elif fig == 'T':
    print("Vamos a dibujar un Triángulo")
    size = int(input("Dijita por favor el tamaño: "))
    draw_triangle(size)
else:
    print("ERROR: La letra que digitaste no está en las opciones.")
