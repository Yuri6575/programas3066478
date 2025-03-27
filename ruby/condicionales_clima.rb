# Solicitar la temperatura al usuario
print "Ingrese la temperatura actual en grados: "
temperatura = gets.chomp.to_i

# Solicitar el clima (soleado, lluvioso, nublado,frio)
print "¿Cómo está el clima? (soleado, lluvioso, nublado, frío): "
clima = gets.chomp.downcase  # Convertir a minúsculas para evitar errores

# Lógica para recomendar vestuario basado en la temperatura y el clima
if temperatura >= 30
  vestuario = "camiseta y pantalones cortos"
  recomendacion = "ponerte protector solar."
elsif temperatura >= 20
  vestuario = "ropa cómoda como una camiseta y jeans"
  recomendacion = "Puedes usar gafas de sol."
elsif temperatura >= 10
  vestuario = "un abrigo liviano  y pantalones largos"
  recomendacion = "llevar una bufanda."
elsif temperatura >= 0
  vestuario = "un abrigo grueso, guantes y bufanda"
  recomendacion = "¡No olvides un gorro para protegerte del frío!"
else
  vestuario = "abrigo pesado, guantes y botas"
  recomendacion = "tomar algo caliente."
end

# Verificar si el clima es lluvioso y añadir una recomendación adicional
if clima == "lluvioso"
  vestuario += " Además, no olvides llevar un paraguas."
elsif clima == "nublado"
  vestuario += " Podrías llevar un suéter adicional por si hace frío."
elsif clima == "frío"
  vestuario += " Asegúrate de estar bien abrigado."
end

# Mostrar la recomendación de vestuario y otras sugerencias
puts "\nRecomendación de vestuario:"
puts "Con una temperatura de #{temperatura}°C y un clima #{clima}, es ideal usar #{vestuario}."
puts recomendacion
