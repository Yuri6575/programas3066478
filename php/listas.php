<?php
// Definir arreglo 
$lista = array("lunes", "martes", "miercoles", "jueves", "viernes", "sabado");

echo $lista[2] . "\n";  // Miercoles

print_r($lista);

print_r(array_slice($lista, 0, 3));

$lista = array("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", 1, 2, 3, array("manuel", 0, 2, 0.25, true));

print_r(array_slice($lista, 0, 4));

print_r(array_slice($lista[9], 0, 3));
?>