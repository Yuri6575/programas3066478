a=2
if a ==2:
    print('a vale 2')
else:
    print('a es diferente de 2')

nombre = "ana"
edad = 28
ciudad = "Medellin"

if nombre =="ana" and edad == 28:
    print("su nombre es ana y tiene 28 años")
elif nombre == "ana" and not edad ==  28:
    print ("su nombre es ana y no tiene 28 años")
elif nombre != "ana" and edad == 28:
    print ("su nombre no es ana y no tiene 28 años")
    
if nombre =="ana" and ciudad == "Medellin":
    print("su nombre es ana y la cuidad que vive es Medellin")
elif nombre == "ana" and not ciudad == "Medellin":
    print ("su nombre es ana y la cuidad que vive no es Medellin")
elif nombre != "ana" and not ciudad == "Medellin":
    print ("su nombre no es ana y la cuidad que vive no es Medellin")
else:
    print('No se llama ana ni tiene 28 años')     

    
