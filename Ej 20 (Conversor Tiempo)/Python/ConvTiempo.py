## DeathbatO

def conv_tiempo(dias, horas, min, seg):
    mils = (seg*1000) + (min*60000) + (horas*3600000)+(dias*3600000*24)
    return mils

print("Conversor de tiempo a milisegundos>>  \n")
dias = int(input("Digite el numero de dias: "))
horas = int(input("Digite el numero de horas: "))
min = int(input("Digite el numero de minutos: "))
seg = int(input("Digite el numero de segundos: "))

print(f"\nEl resultado en milisegundos es {conv_tiempo(dias,horas,min,seg)}")