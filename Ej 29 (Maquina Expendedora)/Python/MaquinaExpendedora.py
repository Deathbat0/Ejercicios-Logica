## DeathbatO

def maquina_expendedora(monedas, seleccion):
    productos = [
        {"nombre": "Refresco", "precio": 150},
        {"nombre": "Chocolate", "precio": 100},
        {"nombre": "Café", "precio": 120}
    ]

    monedas_validas = [5, 10, 50, 100, 200]
    monedas_vuelta = []
    total_monedas = 0

    # Verificar si las monedas recibidas son válidas
    for moneda in monedas:
        if moneda not in monedas_validas:
            return {"mensaje": "Moneda no válida", "monedas": monedas}
        total_monedas += moneda

    # Verificar si el número de producto existe
    if seleccion < 1 or seleccion > len(productos):
        return {"mensaje": "Número de producto no válido", "monedas": monedas}

    producto_seleccionado = productos[seleccion - 1]

    # Verificar si el dinero es suficiente para comprar el producto
    if total_monedas < producto_seleccionado["precio"]:
        return {"mensaje": "Dinero insuficiente", "monedas": monedas}

    # Calcular el cambio y devolverlo con el menor número de monedas posibles
    cambio = total_monedas - producto_seleccionado["precio"]
    for moneda in sorted(monedas_validas, reverse=True):
        while cambio >= moneda:
            monedas_vuelta.append(moneda)
            cambio -= moneda

    return {"producto": producto_seleccionado["nombre"], "monedas": monedas_vuelta}

# Ejemplo de uso:
monedas_recibidas = [200, 100, 50, 10]
seleccion_producto = 1  # Elige el primer producto
resultado = maquina_expendedora(monedas_recibidas, seleccion_producto)
print(resultado)
