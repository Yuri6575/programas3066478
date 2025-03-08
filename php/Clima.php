<?php
echo "Ingresa la temperatura actual: ";
$temperatura = intval(fgets(STDIN));  // Lee la temperatura

echo "¿Está lloviendo? (sí/no): ";
$lluvia = trim(fgets(STDIN));  // Lee si está lloviendo


if ($temperatura <= 0) {
        echo "Muy Frío. Usar abrigo grueso, guantes y botas.\n";
} elseif ($temperatura > 0 && $temperatura <= 15) {
    // Si está entre 0 y 10 grados
    echo "frío. Usar suéter, bufanda y botas.\n";
} elseif ($temperatura > 15 && $temperatura <= 22) {
       echo "Templado. Usar una chaqueta y pantalones largos.\n";
} elseif ($temperatura > 22 && $temperatura <= 30) {
        echo "Caliente. Usar ropa ligera como camiseta y pantalones cortos.\n";
} else {
    echo "Playa. Usar Vestido de baño.\n";
}

if (strtolower($lloviendo) == "sí" || strtolower($lloviendo) == "si") {
    echo "Además, como está lloviendo, llevar un paraguas y botas.\n";
}
?>