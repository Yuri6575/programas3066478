# Crear una lista de libros utilizando un arreglo de hashes
libros = [
  { 'titulo' => 'El Gran Gatsby', 'autor' => 'F. Scott Fitzgerald', 'año' => 1925 },
  { 'titulo' => '1984', 'autor' => 'George Orwell', 'año' => 1949 },
  { 'titulo' => 'Cien Años de Soledad', 'autor' => 'Gabriel García Márquez', 'año' => 1967 },
  { 'titulo' => 'Don Quijote de la Mancha', 'autor' => 'Miguel de Cervantes', 'año' => 1605 },
  { 'titulo' => 'La Odisea', 'autor' => 'Homero', 'año' => -800 }
]

# Imprimir todos los libros en la lista
puts "Lista de libros:"
libros.each do |libro|
  puts "#{libro['titulo']} de #{libro['autor']} (Publicado en #{libro['año']})"
end

# Buscar un libro por título
puts "\nBuscar un libro por título:"
print "Ingrese el título del libro que desea buscar: "
titulo_buscado = gets.chomp

libro_encontrado = libros.find { |libro| libro['titulo'].downcase == titulo_buscado.downcase }

if libro_encontrado
  puts "Libro encontrado: #{libro_encontrado['titulo']} de #{libro_encontrado['autor']} (Publicado en #{libro_encontrado['año']})"
else
  puts "No se encontró el libro con ese título."
end
