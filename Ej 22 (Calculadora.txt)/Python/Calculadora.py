## DeathabtO

def calcular_resultado(entrada):

    try:
        resultado = float(entrada[0].strip())
        for i in range(1, len(entrada), 2):
            operador = entrada[i].strip()
            numero = float(entrada[i + 1].strip())
            if operador == '+':
                resultado += numero
            elif operador == '-':
                resultado -= numero
            elif operador == '*':
                resultado *= numero
            elif operador == '/':
                resultado /= numero
        return resultado
    except ZeroDivisionError:
        print("Error: División por cero.")
        return None
    except:
        print("Error: Operación inválida.")
        return None

operation = []
file_name = "datos.txt"
try:
    with open(file_name) as archivo:
        for line in archivo:
            lin = line.strip()
            if line:
                operation.append(float(lin) if lin.replace('.','').isdigit() else lin)
    
    print(operation)

except FileNotFoundError:
    print(f"No se encotro el archivo {file_name}")
except Exception as e:
    print("Ocurrio un error", e)