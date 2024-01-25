## DeathbatO

def es_palindromo(cadena):
    con = ''.join(cadena.split())
    cadena = con.lower()
    return cadena == cadena[::-1]

input_str = input("Por favor introduzca una cadena: ")
if es_palindromo(input_str):
    print("La cadena es un palíndromo")
else:
    print("La cadena NO es un palíndromo")