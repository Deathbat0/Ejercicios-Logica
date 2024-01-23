##DeathbatO

def Char_P(in1, in2):
    result = ""
    for c in in1:
        if c not in in2:
            result += c
    return result

entrada1 = input("Por favor ingrese la primera cadena: ")
entrada2 = input("Por favor ingrese la segunda cadena: ")

out1 = Char_P(entrada1, entrada2)
out2 = Char_P(entrada2, entrada1)

print(f"Out1: {out1}")
print(f"Out2: {out2}")
