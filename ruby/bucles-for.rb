# For loop en Ruby para imprimir los nombres
nombres = ["camila", "sebastian R", "Cristian", "Andres R", "Anyelo", "Esteban A", "Felipe", "Fito", "Hanssy R", "Hanz l", "Jhon", "juan pablo", "Nilo", "Santiago", "Santiago S", "Yuri \n\n"]

# bucle for en Ruby
for nombre in nombres
  puts nombre
end

# Diccionarios en Ruby (Hashes)
personas = [] # Lista vacía

# Definir los diccionarios (Hashes)
a = {'nombre' => 'sebastian R', 'Edad' => 24}
b = {'nombre' => 'Andres R', 'Edad' => 26}
c = {'nombre' => 'Anyelo', 'Edad' => 30}
d = {'nombre' => 'Esteban A', 'Edad' => 28}
e = {'nombre' => 'Felipe', 'Edad' => 23}
f = {'nombre' => 'Fito', 'Edad' => 32}
g = {'nombre' => 'Hanssy R', 'Edad' => 27}
h = {'nombre' => 'Jhon', 'Edad' => 26}
i = {'nombre' => 'juan pablo', 'Edad' => 25}
j = {'nombre' => 'Nilo', 'Edad' => 26}
k = {'nombre' => 'Santiago', 'Edad' => 20}
l = {'nombre' => 'Santiago s', 'Edad' => 28}
m = {'nombre' => 'Yuri', 'Edad' => 28}

# Añadir los hashes a la lista
personas << a
personas << b
personas << c
personas << d
personas << e
personas << f
personas << g
personas << h
personas << i
personas << j
personas << k
personas << l
personas << m

# Imprimir nombres y edades
for persona in personas
  puts "#{persona['nombre']}, #{persona['Edad']}"
end

# Operar con los valores de los hashes, aumentar la edad de todas las personas en 1
personas.each do |persona|
  persona['Edad'] += 1
end

# Imprimir la nueva edad de cada persona
puts "\nEdades después de aumentar en 1 año:"
for persona in personas
  puts "#{persona['nombre']}, #{persona['Edad']}"
end
