## DeathbatO

def main():
    for i in range(1, 11):
        es_binario = False
        while not es_binario:
            binario = int(input("Ingrese el número en binario: "))
            es_binario = True
            aux = binario
            while aux != 0:
                residuo = aux % 10
                if residuo != 0 and residuo != 1:
                    es_binario = False
                    print("El número ingresado no es binario")
                    break
                aux = aux // 10

        binario_original = binario
        pos = 0
        numero = 0
        residuo = 0

        while binario != 0:
            residuo = binario % 10
            numero += residuo * (2 ** pos)
            pos += 1
            binario = binario // 10

        print(f"El binario {binario_original} en decimal es {numero}")

    print("...........Programa finalizado.............")


if __name__ == "__main__":
    main()
