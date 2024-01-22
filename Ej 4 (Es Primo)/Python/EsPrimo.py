## DeathbatO

def Es_Primo(num):
    if num == 2 or num == 3 or num == 5 or num == 7 or num == 11:
        return True
    elif num % 2 == 0 or num % 3 == 0 or num % 5 == 0 or num % 7 == 0 or num % 11 == 0:
        return False
    else:
        return True
    
for i in range(100):
    if Es_Primo(i):
        print(i)