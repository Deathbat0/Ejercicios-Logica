## DeathbatO

from datetime import datetime as dt

def CalcularDifDias(fecha1, fecha2):

    try:

        f1 = dt.strptime(fecha1, '%d/%m/%Y')
        f2 = dt.strptime(fecha2, '%d/%m/%Y')
        dif = abs((f1-f2).days)
        return dif
    
    except ValueError as e:

        raise ValueError("Una o ambas fechas no son validas") from e
    
fe1 = input("Digite una fecha en formato dd/mm/YY: ")
fe2 = input("Digite una fecha en formato dd/mm/YY: ")

dif = CalcularDifDias(fe1,fe2)
print(f"La diferencia en días entre {fe1} y {fe2} es: {dif} días.")
