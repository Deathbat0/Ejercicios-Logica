## DeathbatO

import threading
import time

def sum_async(a, b, seconds):
    def calculate_sum():
        time.sleep(seconds)
        result = a + b
        print("La suma es:", result)

    thread = threading.Thread(target=calculate_sum)
    thread.start()

# Ejemplo de uso
# Suma 5 + 7 y retorna el resultado después de 3 segundos
sum_async(5, 7, 3) 