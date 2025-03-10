class usuario: 
    
    def __init__(self, nombre, pin, saldo):
        self.nombre = nombre
        self.pin = pin
        self.saldo = saldo

class Banco: 
     
    def __init__(self, usuarios=[]):
        self.usuarios=usuarios
    def autenticar(self, nombre, pin):
        for usuario in self.usuarios:
            if usuario.nombre == nombre:
                if usuario.pin == pin:
                    print ("Estas logueado")
                    return True
                else:
                    print("pin Incorrecto")
                    return False
        else:
            print ("El usuario no esxiste")
            return  False
    def sacar_dineo(self, nombre, saldo):
        for usuario in self.usuarios:
            if usuario.nombre == nombre:
                if usuario.saldo < saldo:
                    print("saldo insufiente")
                    break
                elif usuario.saldo >=saldo:
                    usuario.saldo -=saldo
                    print("saldo disponible es", usuario.saldo)
                    
ana = usuario ("Ana", 9872, 450)
pablo = usuario("Pablo", 5555, 200)
rodrigo = usuario("Rodrigo", 2222, 900) 

banco = Banco(usuarios=[ana, pablo,rodrigo])
while True:
    print("Bienvenido al banco. por favor, identifiquese.")
    print("introduzca su nombre")
    nombre = input()
    print("Introduzca el pin")
    pin = int(input())
    
    if banco.autenticar(nombre, pin):
        while True:
            print("por favor, elija de estas opciones.\n1. sacar dinero\n2.terminar sesión")
            opcion = input()
            
            if opcion=="1:":
                print("Introduzca cantidad a sacar")
                saldo = int(input())
                banco.sacar_dinero(nombre, saldo)
          
            elif opcion == "2":
                print("saliendo del sistema")
                break    
            else:
                print("opcion incorrecta. Por favor, introduzca otra opcion")
        else:
            print("usuario no autenticado, por favor, introduzca un nombre y pin correctos") 