<?php

$nombre = "Juan";      
$edad = 25;            
$altura = 1.75;        
$esEstudiante = true; 

echo "Nombre: " . $nombre . "\n";
echo "Edad: " . $edad . " años\n";
echo "Altura: " . $altura . " metros\n";
echo "Es estudiante: " . ($esEstudiante ? "Sí" : "No") . "\n";

$edadFutura = $edad + 5;  // Aumentando 5 años a la edad actual
echo "En 5 años, " . $nombre . " tendrá " . $edadFutura . " años.\n";

$saludo = "¡Hola, mi nombre es " . $nombre . " y tengo " . $edad . " años!";
echo $saludo . "\n";
?>