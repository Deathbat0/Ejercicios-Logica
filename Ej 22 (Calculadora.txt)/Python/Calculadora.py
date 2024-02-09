## DeathabtO

def calcular_resultado(entrada):

    try:
        resultado = eval(entrada)
        return resultado
    except:
        return None
    

file_name = "datos.txt"
with open(file_name) as archivo:
    print(archivo.read())