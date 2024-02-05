## DeathbatO

def paso_carrera(pista, atleta):
    if len(pista) == len(atleta):
        res = [""] * len(pista)
        for i in range(len(pista)):
            if (pista[i] == "_" and atleta[i] == "run") or (pista[i] == "|" and atleta[i] == "jump"):
                res[i] = pista[i]
            elif pista[i] == "_" and atleta[i] == "jump":
                res[i] = "x"
            elif pista[i] == "|" and atleta[i] == "run":
                res[i] = "/"
        
        resultado = res == pista
        print("Completo la carrera correctamente: " if resultado else "No completo la carrera correctamente: ")
        print(res)
        return resultado
    else:
        return False
    
p1 = ["_", "_", "|", "_", "_", "_", "|", "_"]
a1 = ["run", "run", "jump", "run", "run", "run", "jump", "run"]
p2 = ["_", "|", "_", "|", "_", "_", "|", "_"]
a2 = ["run", "jump", "run", "jump", "jump", "run", "run", "jump"]

print("Primera pista y recorrido: ")
print(p1)
print(a1, "\n")
paso_carrera(p1, a1)
print("\n\nSegunda pista y recorrido: ")
print(p2)
print(a2, "\n")
paso_carrera(p2, a2)