from re import A

Figura = input ('seleccione la figura a calcular su area: \n\n 1 para rombo \n\n 2 para Rectangulo \n\n 3 para cuadrado \n\n 4 para trapecio \n\n: ')
pi = 3.1416
var1 = int (input("ingrese valor "))
var2 = int (input("ingrese valor "))
const = int(2) 

match Figura:
    case "1":
        D= int(input('ingresa el valor de la diagonal mayor: '))
        d= int(input('ingresa el valor de la diagonal menor: '))
        Area=(D*d/const)
        print('El area del rombo es: ',Area)
    case '2':
        Largo= int(input('ingresa el valor del largo del rectangulo: '))
        Ancho= int(input('ingresa el valor del ancho del rectangulo: '))
        Area=Largo*Ancho
        print('El area del rectangulo es: ',Area)   
    case '3':
        Lado= int(input('ingresa el valor del lado del cuadrado: '))
        Area=Lado*Lado
        print('El area del cuadrado es: ',Area)    
    case '4':
        B= int(input('ingresa el valor de la base mayor: '))
        b= int(input('ingresa el valor de la base menor: '))
        H=int (input('ingrese la altura del trapecio: '))
        Area=(((B+B)*H)/2)
        print('El area del trapecio es: ',Area)   
    case ' ':
        Area= A*pi
        print(Area)