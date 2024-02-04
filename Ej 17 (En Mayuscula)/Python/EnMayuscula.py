## DeathbatO

def mayus(frase):
    frase_mayus = ""
    palabras = frase.split(" ")
    
    for palabra in palabras:
        if len(palabra) > 0:
            palabra = palabra[0].upper() + palabra[1:]
        frase_mayus += palabra + " "
    
    return frase_mayus.rstrip()

frase = input("Por favor ingrese una frase: ")
print("La frase con mayúsculas corregidas:")
print(mayus(frase))
