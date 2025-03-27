# Pedir al usuario los valores del voltaje y la resistencia
print "Ingrese el valor del voltaje del circuito: "
v = gets.chomp.to_i  # Convierte la entrada a entero

print "Ingrese el valor de la resistencia del circuito: "
r = gets.chomp.to_i  # Convierte la entrada a entero

# Calcular la corriente (Ley de Ohm: I = V / R)
res = v.to_f / r.to_f  # Asegúrate de hacer la división con números flotantes

# el resultado
puts "Al conectar un resistor de R #{r} ohmios a una fuente de V #{v} voltios, circulará una corriente de #{res} amperios."
