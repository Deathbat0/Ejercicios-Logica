## DeathbatO
count = 0
year = int(input("Introduce un año: "))
print("Los proximos 30 años bisiestos son: ")
while count < 30:
    year += 1
    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        print(year)
        count += 1