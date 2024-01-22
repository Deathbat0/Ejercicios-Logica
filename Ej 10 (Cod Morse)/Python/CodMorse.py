## DeathbatO

dict = {
    'A': "·—", 'B': "—···", 'C': "—·—·", 'D': "—··", 'E': "·", 'F': "··—·", 
    'G': "——·", 'H': "····",'I': "··", 'J': "·———", 'K': "—·—", 'L': "·—··", 
    'M': "——", 'N': "—·", 'O': "———", 'P': "·——·",'Q': "——·—", 'R': "·—·", 
    'S': "···", 'T': "—", 'U': "··—", 'V': "···—", 'W': "·——", 'X': "—··—",
    'Y': "—·——", 'Z': "——··", '0': "—————",'1': "·————", '2': "··———", 
    '3': "···——", '4': "····—",'5': "·····", '6': "—····", '7': "——···", 
    '8': "———··", '9': "————·", '.': "·—·—·—", ',': "——··——",'?': "··——··", 
    ' ': " "
}

dict2 = {v: k for k, v in dict.items()}

def to_morse(cadena):
    morse = ""
    for char in cadena:
        morse = dict.get(char.upper(), "")+" "
    return morse.strip()

def to_text(cadena):
    words = cadena.split("   ")
    ttext = ""
    for word in words:
        let = word.split(" ")
        for l in let:
            ttext += dict2.get(l, "")
        ttext += " "
    return ttext.strip()


print("\t------Traductor de Codigo Morse-----")
for j in range(5):
    cadena = input("\nPor favor digita el texto que deseas traducir: ").upper()
    if '·' in cadena:
        print(to_text(cadena))
    else:
        print(to_morse(cadena))
    
print("\n\n\t-----Programa Finalizado-------")