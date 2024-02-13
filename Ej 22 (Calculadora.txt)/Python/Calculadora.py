## DeathabtO

def calcular_resultado(entrada):

    try:
        resultado = eval(entrada)
        return resultado
    except:
        return None

operation = []
file_name = "datos.txt"
try:
    with open(file_name) as archivo:
        for line in archivo:
            lin = line.strip()
            if line:
                operation.append(lin)

    entr = ' '.join(operation)
    print(calcular_resultado(entr))

except FileNotFoundError:
    print(f"No se encotro el archivo {file_name}")
except Exception as e:
    print("Ocurrio un error", e)