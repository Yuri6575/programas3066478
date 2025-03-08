<?php
echo "Escriba sus nombres completos: ";
$a = trim(fgets(STDIN));  

echo "Escriba sus apellidos completos: ";
$b = trim(fgets(STDIN)); 

echo "Escriba su profesion: ";
$c = trim(fgets(STDIN));  n

echo "Escriba su año de nacimiento: ";
$d = (int) trim(fgets(STDIN)); 

$e = 2025 - $d;//edad

echo "El (La) " . $c . " " . $a . " " . $b . " tiene " . $e . " años.\n";
?>