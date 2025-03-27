# variable local
nombre = "Juan"
edad = 25

puts "Hola, mi nombre es #{nombre} y tengo #{edad} años."

# variable global
$nombre_global = "Juan"
$edad_global = 25

#variable de  instancia:
def saludo
  puts "Hola desde el método: #{$nombre_global}, tienes #{$edad_global} años."
end

# Llamamos al método
saludo

class Persona
  def initialize(nombre, edad)
    @nombre = nombre
    @edad = edad
  end
  
  def saludar
    puts "Hola, mi nombre es #{@nombre} y tengo #{@edad} años."
  end
end

# variable de clase Persona
persona = Persona.new("Ana", 30)
persona.saludar

#constante
PI = 3.14159

puts "El valor de PI es #{PI}"

# Intentar cambiar el valor de una constante genera una advertencia
PI = 3.14  # Advertencia: asignación a una constante
puts "Nuevo valor de PI es #{PI}"
