##DeathbatO

def area_poligono(pol):
    if pol == 'T':
        base = float(input("Ingrese la base: "))
        altura = float(input("Ingrese la altura: "))
        area = (base*altura)/2
        return "El area del triangulo es: {0:.2f}".format(area)
    elif pol == 'C':
        lado = float(input("Ingrese la medida del lado: "))
        area = pow(lado, 2)
        return "El area del cuadrado es {0:.2f}".format(area)   
    elif pol == 'R':
        ancho = float(input("Ingrese el ancho: "))
        largo = float(input("Ingrese el largo: "))
        area = ancho*largo
        return "El area del rectangulo es {0:.2f}".format(area)
    else:
        return "Esa no era una opcion" 

print("Vamos a calcular el area de un poligono")
pol = input("Digita T para riangulo, C para cuadrado o R para rectangulo: ")
print(area_poligono(pol))