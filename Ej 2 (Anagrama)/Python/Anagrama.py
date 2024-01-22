## DeathbatO

def Anagrama(palabra1, palabra2):
    if (palabra1 == palabra2) or (len(palabra2) != len(palabra1)):
        return False
    else:
        count = 0
        for i in range(len(palabra1)):
            for j in range(len(palabra2)):
                if palabra1[i] == palabra2[j]:
                    count += 1
                    break
        if count >= len(palabra1):
            return True

print("Vamos a verificar si dos palabras son un anagrama")
palabra1 = input("Ingrese la primera palabra: ")
palabra2 = input("Ingrese la segunda palabra: ")

print(Anagrama(palabra1, palabra2))