def apertura(c):
    return c == '{' or c == '[' or c == '('

 
def cierra(c):
    return c == '}' or c == ']' or c == ')'


def par_valido(a, c):
    return (a == '{' and c == '}') or \
            (a == '[' and c == ']') or \
            (a == '(' and c == ')')


def esta_balanceada(expre):
    com = []

    for caracter in expre:
        if apertura(caracter):
            com.append(caracter)
        elif cierra(caracter):
            if not com or not par_valido(com.pop(), caracter):
                 return False

    return not com

entrada = input("Por favor ingrese una expresion: ")
if esta_balanceada(entrada):
    print("Expresion Balanceada")
else:
    print("Expresion no balanceada")