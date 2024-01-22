## DeathbatO

charsNoValid = ".,?_!"
cadena = input("Por favor ingrese el texto inicial: ").upper()
palabras = cadena.split(" ")
for i in range(len(palabras)):
    for c in charsNoValid:
        palabras[i] = palabras[i].replace(c, "")

word = input("Ingrese la palabra que desea contar: ").upper()
count = palabras.count(word)

print(f"La palabra {word} se repite {count} veces en el texto")