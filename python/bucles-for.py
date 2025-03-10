#for
nombres =["camila", "sebastian R","Cristian","Andres R", "Anyelo", "Esteban A","Felipe ","Fito","Hanssy R","Hanz l","Jhon", "juan pablo","Nilo", "Santiago","Santiago S","Yuri \n\n"]
for nombre in nombres:
    print(nombre)
#Diccionarios
Personas=[]#lista vacia se llena con a y b
a={'nombre':'sebastian R', 'Edad': 24}
b={'nombre':'Andres R', 'Edad': 26}
c={'nombre':'Anyelo', 'Edad': 30}
d={'nombre':'Esteban A', 'Edad': 28}
e={'nombre':'Felipe', 'Edad': 23}
f={'nombre':'Fito', 'Edad': 32}
g={'nombre':'Hanssy R', 'Edad': 27}
h={'nombre':'Jhon', 'Edad': 26}
i={'nombre':'juan pablo', 'Edad': 25}
j={'nombre':'Nilo', 'Edad': 26}
k={'nombre':'Santiago', 'Edad': 20}
l={'nombre':'Santiago s', 'Edad': 28}
m={'nombre':'Yuri', 'Edad': 28}
Personas.append(a)#append: permite que los datos se agregen a la lista vacia
Personas.append(b)
Personas.append(c)
Personas.append(d)
Personas.append(e)
Personas.append(f)
Personas.append(g)
Personas.append(h)
Personas.append(i)
Personas.append(j)
Personas.append(k)
Personas.append(l)
Personas.append(m)
for persona in Personas:
    print(persona['nombre'], persona['Edad'])

#Operar con valores de diccionarios
