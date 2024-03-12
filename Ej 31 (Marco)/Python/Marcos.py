## DeathbatO

def mostrar_marco_rectangular(texto):
    # Dividir el texto en palabras
    palabras = texto.split()

    # Encontrar la longitud de la palabra más larga
    longitud_maxima = max(len(palabra) for palabra in palabras)

    # Imprimir el marco superior
    print('*' * (longitud_maxima + 4))

    # Imprimir las palabras con el marco lateral
    for palabra in palabras:
        print('* {:<{}} *'.format(palabra, longitud_maxima))

    # Imprimir el marco inferior
    print('*' * (longitud_maxima + 4))

# Ejemplo de uso
texto_ejemplo = "Esta es una frase de ejemplo para probar la función."
mostrar_marco_rectangular(texto_ejemplo)
