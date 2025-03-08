var diccionario = Vehiculos();

diccionario.set("Marca", "Honda");
diccionario.set("Modelo",1993) ;
diccionario.set("ciudad", "Bogota");

console.log(diccionario.get("Marca")); // Honda Civic
console.log(diccionario.get("Modelo"));   // 1993

diccionario.set("Civic", "Creador");


console.log("Tamaño del diccionario: " + diccionario.size);


diccionario.forEach(function(valor, clave) {
    console.log(clave + ": " + valor);
});