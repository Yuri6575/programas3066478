contador = 0
while contador <30:
        contador += 1
        print("iteracion", contador)

while True:
    print("introduzca un valor mayor a 10")
    a = int(input())
    if a > 10:
        print("Es correcto")
    else:
        print("Es incorrecto, pruebe de nuevo") 
        break